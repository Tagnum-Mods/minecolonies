package com.minecolonies.api.client.render.modeltype.registry;

import com.minecolonies.api.IMinecoloniesAPI;
import net.minecraft.util.ResourceLocation;

public interface IModelTypeRegistry
{
    static IModelTypeRegistry getInstance()
    {
        return IMinecoloniesAPI.getInstance().getModelTypeRegistry();
    }

    void register(ModelTypeEntry modelTypeEntry);

    ModelTypeEntry get(ResourceLocation resource);
}
