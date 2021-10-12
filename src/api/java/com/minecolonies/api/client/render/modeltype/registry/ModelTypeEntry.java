package com.minecolonies.api.client.render.modeltype.registry;

import com.minecolonies.api.client.render.modeltype.CitizenModel;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;

import static com.minecolonies.api.entity.citizen.AbstractEntityCitizen.DATA_STYLE;
import static com.minecolonies.api.entity.citizen.AbstractEntityCitizen.DATA_TEXTURE_SUFFIX;

/**
 * Entry for the ModelTypes registry
 */
public class ModelTypeEntry extends ForgeRegistryEntry<ModelTypeEntry>
{
    /**
     * Base folder for textures.
     */
    public static final String BASE_FOLDER = "textures/entity/citizen/";

    /**
     * Default folder.
     */
    public static final String DEFAULT_FOLDER = "default";

    /**
     * Builder for a {@link ModelTypeEntry}
     */
    public static final class Builder
    {
        private String                              _texturePath;
        private ResourceLocation                    registryName;
        private int                                 textureCount;
        private ResourceLocation                    texturePath;
        private CitizenModel<AbstractEntityCitizen> maleModel;
        private CitizenModel<AbstractEntityCitizen> femaleModel;

        /**
         * Sets the registry name of the model.
         *
         * @param registryName The registry name.
         * @return The builder.
         */
        public Builder setRegistryName(final ResourceLocation registryName)
        {
            this.registryName = registryName;
            return this;
        }

        /**
         * Sets the texture resource and amount of texture variations for the {@link ModelTypeEntry}.
         *
         * @param texturePath  The resource location of the texture.
         * @param textureCount The amount of texture variations this model has.
         * @return The builder.
         */
        public Builder setModelTexture(final ResourceLocation texturePath, final int textureCount)
        {
            this.texturePath = texturePath;
            this.textureCount = textureCount;
            return this;
        }

        /**
         * Sets the texture name and amount of texture variations for the {@link ModelTypeEntry}.
         * <p>
         * This functions assumes that your texture namespace is the same as the one you set in {@link #setRegistryName(String)}.
         *
         * @param texturePath  The name of the texture.
         * @param textureCount The amount of texture variations this model has.
         * @return The builder.
         */
        public Builder setModelTexture(final String texturePath, final int textureCount)
        {
            this._texturePath = texturePath;
            this.textureCount = textureCount;
            return this;
        }

        /**
         * Sets the model to be used by males in the {@link ModelTypeEntry}.
         *
         * @param maleModel The male model to be used for rendering.
         * @return The builder.
         */
        public Builder setMaleModel(final CitizenModel<AbstractEntityCitizen> maleModel)
        {
            this.maleModel = maleModel;
            return this;
        }

        /**
         * Sets the model to be used by females in the {@link ModelTypeEntry}
         *
         * @param femaleModel The female model to be used for rendering.
         * @return The builder.
         */
        public Builder setFemaleModel(final CitizenModel<AbstractEntityCitizen> femaleModel)
        {
            this.femaleModel = femaleModel;
            return this;
        }

        /**
         * Creates a new {@link ModelTypeEntry}.
         *
         * @return The created {@link ModelTypeEntry}
         */
        public ModelTypeEntry build()
        {
            Validate.notNull(registryName);
            if (texturePath == null)
            {
                texturePath = new ResourceLocation(registryName.getNamespace(), _texturePath);
            }
            Validate.notNull(texturePath);
            Validate.isTrue(textureCount > 0);
            Validate.notNull(maleModel);
            Validate.notNull(femaleModel);

            return new ModelTypeEntry(texturePath, textureCount, maleModel, femaleModel).setRegistryName(registryName);
        }
    }

    private final int                                 textureCount;
    private final ResourceLocation                    texturePath;
    private final CitizenModel<AbstractEntityCitizen> maleModel;
    private final CitizenModel<AbstractEntityCitizen> femaleModel;

    private ModelTypeEntry(ResourceLocation texturePath, int textureCount, CitizenModel<AbstractEntityCitizen> maleModel, CitizenModel<AbstractEntityCitizen> femaleModel)
    {
        super();
        this.texturePath = texturePath;
        this.textureCount = textureCount;
        this.maleModel = maleModel;
        this.femaleModel = femaleModel;
    }

    /**
     * Gets the name of the texture and which mod the texture came from in a ResourceLocation.
     *
     * @return The modid and texture name in a ResourceLocation format.
     */
    public ResourceLocation getTexturePath()
    {
        return this.texturePath;
    }

    /**
     * Gets the amount of texture variations availible for this model.
     *
     * @return The amount of texture variations.
     */
    public int getTextureCount()
    {
        return this.textureCount;
    }

    /**
     * Get the male model for this {@link ModelTypeEntry}.
     *
     * @return The male model to be used
     */
    public CitizenModel<AbstractEntityCitizen> getMaleModel()
    {
        return maleModel;
    }

    /**
     * Get the female model for this {@link ModelTypeEntry}.
     *
     * @return The female model to be used
     */
    public CitizenModel<AbstractEntityCitizen> getFemaleModel()
    {
        return femaleModel;
    }

    /**
     * Gets the resource location of the texture required for the {@link AbstractEntityCitizen} to be rendered with.
     *
     * @param entityCitizen The citizen that will be rendered.
     * @return The texture for the model.
     */
    public ResourceLocation getTexture(@NotNull final AbstractEntityCitizen entityCitizen)
    {
        final int moddedTextureId = (entityCitizen.getTextureId() % getTextureCount()) + 1;
        final String MOD_ID = getTexturePath().getNamespace();
        final String textureName = getTexturePath().getPath();

        // Texture Identifier: {textureName}{gender}{texture_id}{render_matadata}{render_metadata_suffix}
        final String textureIdentifier =
          textureName + (entityCitizen.isFemale() ? "female" : "male") + moddedTextureId + entityCitizen.getRenderMetadata() + entityCitizen.getEntityData()
            .get(DATA_TEXTURE_SUFFIX);

        // Resource Location {namespace}:{BASE_FOLDER}/{style}/{textureIdentifier}.png
        final ResourceLocation modified = new ResourceLocation(MOD_ID, BASE_FOLDER + entityCitizen.getEntityData().get(DATA_STYLE) + "/" + textureIdentifier + ".png");

        // Check if there is a custom style and return that.
        if (Minecraft.getInstance().getResourceManager().hasResource(modified))
        {
            return modified;
        }

        return new ResourceLocation(MOD_ID, BASE_FOLDER + DEFAULT_FOLDER + "/" + textureIdentifier + ".png");
    }

    @Override
    public String toString()
    {
        ResourceLocation regName = getRegistryName();
        if (regName != null)
        {
            return regName.toString();
        }
        return super.toString();
    }
}
