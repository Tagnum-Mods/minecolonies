package com.minecolonies.coremod.colony.jobs;

import com.minecolonies.api.client.render.modeltype.ModModelTypes;
import com.minecolonies.api.client.render.modeltype.registry.ModelTypeEntry;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.jobs.ModJobs;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.coremod.entity.ai.citizen.planter.EntityAIWorkPlanter;
import net.minecraft.util.DamageSource;
import org.jetbrains.annotations.NotNull;

/**
 * Class of the planter job.
 */
public class JobPlanter extends AbstractJobCrafter<EntityAIWorkPlanter, JobPlanter>
{
    /**
     * Instantiates the job for the plantation.
     *
     * @param entity the citizen who becomes a planter
     */
    public JobPlanter(final ICitizenData entity)
    {
        super(entity);
    }

    @Override
    public JobEntry getJobRegistryEntry()
    {
        return ModJobs.planter;
    }

    @NotNull
    @Override
    public String getName()
    {
        return "com.minecolonies.coremod.job.planter";
    }

    /**
     * Generate your AI class to register.
     *
     * @return your personal AI instance.
     */
    @NotNull
    @Override
    public EntityAIWorkPlanter generateAI()
    {
        return new EntityAIWorkPlanter(this);
    }

    @NotNull
    @Override
    public ModelTypeEntry getModelType()
    {
        return ModModelTypes.planter;
    }

    @Override
    public boolean ignoresDamage(@NotNull final DamageSource damageSource)
    {
        return damageSource == DamageSource.CACTUS;
    }
}
