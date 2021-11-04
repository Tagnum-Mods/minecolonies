package com.minecolonies.coremod.colony.jobs;

import com.minecolonies.api.client.render.modeltype.IModelType;
import com.minecolonies.api.client.render.modeltype.ModModelTypes;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.jobs.ModJobs;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.coremod.entity.ai.citizen.glassblower.EntityAIWorkGlassblower;
import org.jetbrains.annotations.NotNull;

/**
 * Class of the Glassblower job.
 */
public class JobGlassblower extends AbstractJobCrafter<EntityAIWorkGlassblower, JobGlassblower>
{
    /**
     * Instantiates the job for the Glassblower.
     *
     * @param entity the citizen who becomes a Glassblower.
     */
    public JobGlassblower(final ICitizenData entity)
    {
        super(entity);
    }

    @NotNull
    @Override
    public IModelType getModel()
    {
        return ModModelTypes.glassblower;
    }

    /**
     * Generate your AI class to register.
     *
     * @return your personal AI instance.
     */
    @NotNull
    @Override
    public EntityAIWorkGlassblower generateAI()
    {
        return new EntityAIWorkGlassblower(this);
    }
}
