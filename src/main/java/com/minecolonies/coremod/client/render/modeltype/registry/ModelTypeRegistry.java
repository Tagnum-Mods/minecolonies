package com.minecolonies.coremod.client.render.modeltype.registry;

import com.minecolonies.api.client.render.modeltype.registry.IModelTypeRegistry;
import com.minecolonies.api.client.render.modeltype.registry.ModelTypeEntry;
import com.minecolonies.api.util.Log;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModelTypeRegistry implements IModelTypeRegistry
{
    private final Map<ResourceLocation, ModelTypeEntry> MODEL_TYPES = Collections.synchronizedMap(new HashMap<>());

    public ModelTypeRegistry() {}

    /**
     *
     * @param modelTypeEntry
     */
    @Override
    public void register(final ModelTypeEntry modelTypeEntry)
    {
        final ResourceLocation registryName = modelTypeEntry.getRegistryName();

        if (MODEL_TYPES.containsKey(registryName)) {
            // Make a note that there is a duplicate, but overwrite it any way.
            Log.getLogger().warn("Model Type ({}) was already registered", registryName);
        }
        MODEL_TYPES.put(registryName, modelTypeEntry);
    }

    /**
     *
     * @param resource
     * @return
     */
    @Nullable
    @Override
    public ModelTypeEntry get(final ResourceLocation resource)
    {
        return MODEL_TYPES.getOrDefault(resource, null);
    }
}
