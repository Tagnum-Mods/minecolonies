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
 *
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
     *
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
         * @param registryName
         * @return
         */
        public Builder setRegistryName(final ResourceLocation registryName)
        {
            this.registryName = registryName;
            return this;
        }

        /**
         * @param texturePath
         * @param textureCount
         * @return
         */
        public Builder setModelTexture(final ResourceLocation texturePath, final int textureCount)
        {
            this.texturePath = texturePath;
            this.textureCount = textureCount;
            return this;
        }

        /**
         * @param texturePath
         * @param textureCount
         * @return
         */
        public Builder setModelTexture(final String texturePath, final int textureCount)
        {
            this._texturePath = texturePath;
            this.textureCount = textureCount;
            return this;
        }

        /**
         * @param maleModel
         * @return
         */
        public Builder setMaleModel(final CitizenModel<AbstractEntityCitizen> maleModel)
        {
            this.maleModel = maleModel;
            return this;
        }

        public Builder setFemaleModel(final CitizenModel<AbstractEntityCitizen> femaleModel)
        {
            this.femaleModel = femaleModel;
            return this;
        }

        /**
         * @return
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

    /**
     * @param texturePath
     * @param textureCount
     * @param maleModel
     * @param femaleModel
     */
    private ModelTypeEntry(ResourceLocation texturePath, int textureCount, CitizenModel<AbstractEntityCitizen> maleModel, CitizenModel<AbstractEntityCitizen> femaleModel)
    {
        super();
        this.texturePath = texturePath;
        this.textureCount = textureCount;
        this.maleModel = maleModel;
        this.femaleModel = femaleModel;
    }

    /**
     * @return
     */
    public ResourceLocation getTexturePath()
    {
        return this.texturePath;
    }

    /**
     * @return
     */
    public int getTextureCount()
    {
        return this.textureCount;
    }

    /**
     * @return
     */
    public CitizenModel<AbstractEntityCitizen> getMaleModel()
    {
        return maleModel;
    }

    /**
     * @return
     */
    public CitizenModel<AbstractEntityCitizen> getFemaleModel()
    {
        return femaleModel;
    }

    public ResourceLocation getTexture(@NotNull final AbstractEntityCitizen entityCitizen)
    {
        final int moddedTextureId = (entityCitizen.getTextureId() % textureCount) + 1;
        final String MOD_ID = texturePath.getNamespace();
        final String textureName = texturePath.getPath();

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
