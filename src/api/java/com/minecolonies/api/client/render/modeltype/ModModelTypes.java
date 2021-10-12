package com.minecolonies.api.client.render.modeltype;

import com.minecolonies.api.client.render.modeltype.registry.ModelTypeEntry;
import com.minecolonies.api.util.constant.Constants;
import net.minecraft.util.ResourceLocation;

public class ModModelTypes
{
    public static final ResourceLocation SETTLER_ID        = rl("settler");
    public static final ResourceLocation CITIZEN_ID        = rl("citizen");
    public static final ResourceLocation NOBLE_ID          = rl("noble");
    public static final ResourceLocation ARISTOCRAT_ID     = rl("aristocrat");
    public static final ResourceLocation BUILDER_ID        = rl("builder");
    public static final ResourceLocation DELIVERYMAN_ID    = rl("deliveryman");
    public static final ResourceLocation MINER_ID          = rl("miner");
    public static final ResourceLocation LUMBERJACK_ID     = rl("lumberjack");
    public static final ResourceLocation FARMER_ID         = rl("farmer");
    public static final ResourceLocation UNDERTAKER_ID     = rl("undertaker");
    public static final ResourceLocation FISHERMAN_ID      = rl("fisherman");
    public static final ResourceLocation BAKER_ID          = rl("baker");
    public static final ResourceLocation COMPOSTER_ID      = rl("composter");
    public static final ResourceLocation COOK_ID           = rl("cook");
    public static final ResourceLocation CHICKEN_FARMER_ID = rl("chicken_farmer");
    public static final ResourceLocation SHEEP_FARMER_ID   = rl("sheep_farmer");
    public static final ResourceLocation PIG_FARMER_ID     = rl("pig_farmer");
    public static final ResourceLocation COW_FARMER_ID     = rl("cow_farmer");
    public static final ResourceLocation SMELTER_ID        = rl("smelter");
    public static final ResourceLocation STUDENT_ID        = rl("student");
    public static final ResourceLocation CRAFTER_ID        = rl("crafter");
    public static final ResourceLocation BLACKSMITH_ID     = rl("blacksmith");
    public static final ResourceLocation ARCHER_GUARD_ID   = rl("archer_guard");
    public static final ResourceLocation KNIGHT_GUARD_ID   = rl("knight_guard");
    public static final ResourceLocation CHILD_ID          = rl("child");
    public static final ResourceLocation HEALER_ID         = rl("healer");
    public static final ResourceLocation TEACHER_ID        = rl("teacher");
    public static final ResourceLocation GLASSBLOWER_ID    = rl("glassblower");
    public static final ResourceLocation DYER_ID           = rl("dyer");
    public static final ResourceLocation PLANTER_ID        = rl("planter");
    public static final ResourceLocation FLETCHER_ID       = rl("fletcher");
    public static final ResourceLocation MECHANIST_ID      = rl("mechanist");
    public static final ResourceLocation RABBIT_HERDER_ID  = rl("rabbit_herder");
    public static final ResourceLocation CONCRETE_MIXER_ID = rl("concrete_mixer");
    public static final ResourceLocation BEEKEEPER_ID      = rl("beekeeper");

    public static ModelTypeEntry settler;
    public static ModelTypeEntry citizen;
    public static ModelTypeEntry noble;
    public static ModelTypeEntry aristocrat;
    public static ModelTypeEntry builder;
    public static ModelTypeEntry deliveryman;
    public static ModelTypeEntry miner;
    public static ModelTypeEntry lumberjack;
    public static ModelTypeEntry farmer;
    public static ModelTypeEntry undertaker;
    public static ModelTypeEntry fisherman;
    public static ModelTypeEntry baker;
    public static ModelTypeEntry composter;
    public static ModelTypeEntry cook;
    public static ModelTypeEntry chicken_farmer;
    public static ModelTypeEntry sheep_farmer;
    public static ModelTypeEntry pig_farmer;
    public static ModelTypeEntry cow_farmer;
    public static ModelTypeEntry smelter;
    public static ModelTypeEntry student;
    public static ModelTypeEntry crafter;
    public static ModelTypeEntry blacksmith;
    public static ModelTypeEntry archer_guard;
    public static ModelTypeEntry knight_guard;
    public static ModelTypeEntry child;
    public static ModelTypeEntry healer;
    public static ModelTypeEntry teacher;
    public static ModelTypeEntry glassblower;
    public static ModelTypeEntry dyer;
    public static ModelTypeEntry planter;
    public static ModelTypeEntry fletcher;
    public static ModelTypeEntry mechanist;
    public static ModelTypeEntry rabbit_herder;
    public static ModelTypeEntry concrete_mixer;
    public static ModelTypeEntry beekeeper;

    private static ResourceLocation rl(final String name)
    {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
}
