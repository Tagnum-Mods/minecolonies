package com.minecolonies.api.crafting.registry;

import com.minecolonies.api.crafting.IGenericRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

/**
 * Class to represent the different types of crafting supported by MineColonies
 */
public abstract class CraftingType extends ForgeRegistryEntry<CraftingType>
{
    protected CraftingType(@NotNull final ResourceLocation id)
    {
        setRegistryName(id);
    }

    /**
     * Find all teachable recipes supported by this particular crafting type
     * @param recipeManager the vanilla recipe manager
     * @param world the world (if available)
     * @return the list of teachable recipes
     */
    @NotNull
    public abstract List<IGenericRecipe> findRecipes(@NotNull final RecipeManager recipeManager,
                                                     @Nullable final World world);

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof CraftingType)
        {
            return Objects.equals(getRegistryName(), ((CraftingType) obj).getRegistryName());
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return getRegistryName().hashCode();
    }
}
