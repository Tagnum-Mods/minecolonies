package com.minecolonies.coremod.colony.jobs;

import com.minecolonies.api.client.render.modeltype.ModModelTypes;
import com.minecolonies.api.client.render.modeltype.registry.ModelTypeEntry;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.jobs.ModJobs;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.coremod.entity.ai.citizen.florist.EntityAIWorkFlorist;
import org.jetbrains.annotations.NotNull;

public class JobFlorist extends AbstractJob<EntityAIWorkFlorist, JobFlorist>
{
    /**
     * Initialize citizen data.
     *
     * @param entity the citizen data.
     */
    public JobFlorist(final ICitizenData entity)
    {
        super(entity);
    }

    @Override
    public JobEntry getJobRegistryEntry()
    {
        return ModJobs.florist;
    }

    @Override
    public String getName()
    {
        return "com.minecolonies.coremod.job.florist";
    }

    @NotNull
    @Override
    public ModelTypeEntry getModelType()
    {
        return ModModelTypes.composter;
    }

    @Override
    public EntityAIWorkFlorist generateAI()
    {
        return new EntityAIWorkFlorist(this);
    }
}
