package com.minecolonies.apiimp.initializer;

import com.minecolonies.api.client.render.modeltype.CitizenModel;
import com.minecolonies.api.client.render.modeltype.ModModelTypes;
import com.minecolonies.api.client.render.modeltype.registry.ModelTypeEntry;
import com.minecolonies.coremod.client.model.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public final class ModModelTypesInitializer
{
    private ModModelTypesInitializer()
    {
        throw new IllegalStateException("Tried to initialize: ModModelTypesInitializer but this is a Utility class.");
    }

    public static void init(final RegistryEvent.Register<ModelTypeEntry> event)
    {
        final IForgeRegistry<ModelTypeEntry> reg = event.getRegistry();

        ModModelTypes.settler = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.SETTLER_ID)
          .setModelTexture("settler", 3)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new ModelEntityFemaleCitizen())
          .build();
        reg.register(ModModelTypes.settler);

        ModModelTypes.citizen = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.CITIZEN_ID)
          .setModelTexture("citizen", 3)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new ModelEntityFemaleCitizen())
          .build();
        reg.register(ModModelTypes.citizen);

        ModModelTypes.noble = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.NOBLE_ID)
          .setModelTexture("noble", 3)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new ModelEntityCitizenFemaleNoble())
          .build();
        reg.register(ModModelTypes.noble);

        ModModelTypes.aristocrat = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.ARISTOCRAT_ID)
          .setModelTexture("aristocrat", 3)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new ModelEntityFemaleAristocrat())
          .build();
        reg.register(ModModelTypes.aristocrat);

        ModModelTypes.builder = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.BUILDER_ID)
          .setModelTexture("builder", 1)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new ModelEntityBuilderFemale())
          .build();
        reg.register(ModModelTypes.builder);

        ModModelTypes.deliveryman = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.DELIVERYMAN_ID)
          .setModelTexture("deliveryman", 1)
          .setMaleModel(new ModelEntityDeliverymanMale())
          .setFemaleModel(new ModelEntityDeliverymanFemale())
          .build();
        reg.register(ModModelTypes.deliveryman);

        ModModelTypes.miner = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.MINER_ID)
          .setModelTexture("miner", 1)
          .setMaleModel(new ModelEntityMinerMale())
          .setFemaleModel(new ModelEntityMinerFemale())
          .build();
        reg.register(ModModelTypes.miner);

        ModModelTypes.lumberjack = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.LUMBERJACK_ID)
          .setModelTexture("lumberjack", 1)
          .setMaleModel(new ModelEntityLumberjackMale())
          .setFemaleModel(new ModelEntityLumberjackFemale())
          .build();
        reg.register(ModModelTypes.lumberjack);

        ModModelTypes.farmer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.FARMER_ID)
          .setModelTexture("farmer", 1)
          .setMaleModel(new ModelEntityFarmerMale())
          .setFemaleModel(new ModelEntityFarmerFemale())
          .build();
        reg.register(ModModelTypes.farmer);

        ModModelTypes.fisherman = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.FISHERMAN_ID)
          .setModelTexture("fisherman", 1)
          .setMaleModel(new ModelEntityFishermanMale())
          .setFemaleModel(new ModelEntityFishermanFemale())
          .build();
        reg.register(ModModelTypes.fisherman);

        ModModelTypes.undertaker = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.UNDERTAKER_ID)
          .setModelTexture("undertaker", 1)
          .setMaleModel(new ModelEntityUndertakerMale())
          .setFemaleModel(new ModelEntityUndertakerFemale())
          .build();
        reg.register(ModModelTypes.undertaker);

        ModModelTypes.archer_guard = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.ARCHER_GUARD_ID)
          .setModelTexture("archer", 1)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new CitizenModel<>())
          .build();
        reg.register(ModModelTypes.archer_guard);

        ModModelTypes.knight_guard = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.KNIGHT_GUARD_ID)
          .setModelTexture("knight", 1)
          .setMaleModel(new CitizenModel<>())
          .setFemaleModel(new CitizenModel<>())
          .build();
        reg.register(ModModelTypes.knight_guard);

        ModModelTypes.baker = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.BAKER_ID)
          .setModelTexture("baker", 1)
          .setMaleModel(new ModelEntityBakerMale())
          .setFemaleModel(new ModelEntityBakerFemale())
          .build();
        reg.register(ModModelTypes.baker);

        ModModelTypes.sheep_farmer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.SHEEP_FARMER_ID)
          .setModelTexture("sheepfarmer", 1)
          .setMaleModel(new ModelEntitySheepFarmerMale())
          .setFemaleModel(new ModelEntitySheepFarmerFemale())
          .build();
        reg.register(ModModelTypes.sheep_farmer);

        ModModelTypes.cow_farmer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.COW_FARMER_ID)
          .setModelTexture("cowfarmer", 1)
          .setMaleModel(new ModelEntityCowFarmerMale())
          .setFemaleModel(new ModelEntityCowFarmerFemale())
          .build();
        reg.register(ModModelTypes.cow_farmer);

        ModModelTypes.pig_farmer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.PIG_FARMER_ID)
          .setModelTexture("pigfarmer", 1)
          .setMaleModel(new ModelEntityPigFarmerMale())
          .setFemaleModel(new ModelEntityPigFarmerFemale())
          .build();
        reg.register(ModModelTypes.pig_farmer);

        ModModelTypes.chicken_farmer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.CHICKEN_FARMER_ID)
          .setModelTexture("chickenfarmer", 1)
          .setMaleModel(new ModelEntityChickenFarmerMale())
          .setFemaleModel(new ModelEntityChickenFarmerFemale())
          .build();
        reg.register(ModModelTypes.chicken_farmer);

        ModModelTypes.composter = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.COMPOSTER_ID)
          .setModelTexture("composter", 1)
          .setMaleModel(new ModelEntityComposterMale())
          .setFemaleModel(new ModelEntityComposterFemale())
          .build();
        reg.register(ModModelTypes.composter);

        ModModelTypes.smelter = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.SMELTER_ID)
          .setModelTexture("smelter", 1)
          .setMaleModel(new ModelEntitySmelterMale())
          .setFemaleModel(new ModelEntitySmelterFemale())
          .build();
        reg.register(ModModelTypes.smelter);

        ModModelTypes.cook = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.COOK_ID)
          .setModelTexture("cook", 1)
          .setMaleModel(new ModelEntityCookMale())
          .setFemaleModel(new ModelEntityCookFemale())
          .build();
        reg.register(ModModelTypes.cook);

        ModModelTypes.student = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.STUDENT_ID)
          .setModelTexture("student", 6)
          .setMaleModel(new ModelEntityStudentMale())
          .setFemaleModel(new ModelEntityStudentFemale())
          .build();
        reg.register(ModModelTypes.student);

        ModModelTypes.crafter = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.CRAFTER_ID)
          .setModelTexture("crafter", 1)
          .setMaleModel(new ModelEntityCrafterMale())
          .setFemaleModel(new ModelEntityCrafterFemale())
          .build();
        reg.register(ModModelTypes.crafter);

        ModModelTypes.blacksmith = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.BLACKSMITH_ID)
          .setModelTexture("blacksmith", 1)
          .setMaleModel(new ModelEntityBlacksmithMale())
          .setFemaleModel(new ModelEntityBlacksmithFemale())
          .build();
        reg.register(ModModelTypes.blacksmith);

        ModModelTypes.child = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.CHILD_ID)
          .setModelTexture("child", 4)
          .setMaleModel(new ModelEntityChildMale())
          .setFemaleModel(new ModelEntityChildFemale())
          .build();
        reg.register(ModModelTypes.child);

        ModModelTypes.healer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.HEALER_ID)
          .setModelTexture("healer", 1)
          .setMaleModel(new ModelEntityHealerMale())
          .setFemaleModel(new ModelEntityHealerFemale())
          .build();
        reg.register(ModModelTypes.healer);

        ModModelTypes.teacher = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.TEACHER_ID)
          .setModelTexture("teacher", 1)
          .setMaleModel(new ModelEntityTeacherMale())
          .setFemaleModel(new ModelEntityTeacherFemale())
          .build();
        reg.register(ModModelTypes.teacher);

        ModModelTypes.glassblower = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.GLASSBLOWER_ID)
          .setModelTexture("glassblower", 3)
          .setMaleModel(new ModelEntityGlassblowerMale())
          .setFemaleModel(new ModelEntityGlassblowerFemale())
          .build();
        reg.register(ModModelTypes.glassblower);

        ModModelTypes.dyer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.DYER_ID)
          .setModelTexture("dyer", 3)
          .setMaleModel(new ModelEntityDyerMale())
          .setFemaleModel(new ModelEntityDyerFemale())
          .build();
        reg.register(ModModelTypes.dyer);

        ModModelTypes.mechanist = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.MECHANIST_ID)
          .setModelTexture("mechanist", 1)
          .setMaleModel(new ModelEntityMechanistMale())
          .setFemaleModel(new ModelEntityMechanistFemale())
          .build();
        reg.register(ModModelTypes.mechanist);

        ModModelTypes.fletcher = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.FLETCHER_ID)
          .setModelTexture("fletcher", 1)
          .setMaleModel(new ModelEntityFletcherMale())
          .setFemaleModel(new ModelEntityFletcherFemale())
          .build();
        reg.register(ModModelTypes.fletcher);

        ModModelTypes.concrete_mixer = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.CONCRETE_MIXER_ID)
          .setModelTexture("concretemixer", 1)
          .setMaleModel(new ModelEntityConcreteMixerMale())
          .setFemaleModel(new ModelEntityConcreteMixerFemale())
          .build();
        reg.register(ModModelTypes.concrete_mixer);

        ModModelTypes.rabbit_herder = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.RABBIT_HERDER_ID)
          .setModelTexture("rabbitherder", 1)
          .setMaleModel(new ModelEntityRabbitHerderMale())
          .setFemaleModel(new ModelEntityRabbitHerderFemale())
          .build();
        reg.register(ModModelTypes.rabbit_herder);

        ModModelTypes.planter = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.PLANTER_ID)
          .setModelTexture("planter", 1)
          .setMaleModel(new ModelEntityPlanterMale())
          .setFemaleModel(new ModelEntityPlanterFemale())
          .build();
        reg.register(ModModelTypes.planter);

        ModModelTypes.beekeeper = new ModelTypeEntry.Builder()
          .setRegistryName(ModModelTypes.BEEKEEPER_ID)
          .setModelTexture("beekeeper", 1)
          .setMaleModel(new ModelEntityBeekeeperMale())
          .setFemaleModel(new ModelEntityBeekeeperFemale())
          .build();
        reg.register(ModModelTypes.beekeeper);
    }
}
