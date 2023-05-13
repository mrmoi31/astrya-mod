
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.astrya.entity.ThunderBowEntity;
import net.mcreator.astrya.entity.Mob1Entity;
import net.mcreator.astrya.entity.MinimobEntity;
import net.mcreator.astrya.AstryaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstryaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AstryaMod.MODID);
	public static final RegistryObject<EntityType<MinimobEntity>> MINIMOB = register("minimob",
			EntityType.Builder.<MinimobEntity>of(MinimobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinimobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<Mob1Entity>> BLUE_ZOMBIE = register("blue_zombie",
			EntityType.Builder.<Mob1Entity>of(Mob1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Mob1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThunderBowEntity>> THUNDER_BOW = register("projectile_thunder_bow",
			EntityType.Builder.<ThunderBowEntity>of(ThunderBowEntity::new, MobCategory.MISC).setCustomClientFactory(ThunderBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MinimobEntity.init();
			Mob1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MINIMOB.get(), MinimobEntity.createAttributes().build());
		event.put(BLUE_ZOMBIE.get(), Mob1Entity.createAttributes().build());
	}
}
