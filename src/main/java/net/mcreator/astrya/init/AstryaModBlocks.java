
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.astrya.block.SaphirOreBlock;
import net.mcreator.astrya.block.SaphirBlockBlock;
import net.mcreator.astrya.block.RubisOreBlock;
import net.mcreator.astrya.block.RubisBlockBlock;
import net.mcreator.astrya.block.GreenFireBlock;
import net.mcreator.astrya.block.BlueFireBlock;
import net.mcreator.astrya.block.AstryaLeavesBlock;
import net.mcreator.astrya.block.AstryWorldPortalBlock;
import net.mcreator.astrya.block.AstryWoodWoodBlock;
import net.mcreator.astrya.block.AstryWoodStairsBlock;
import net.mcreator.astrya.block.AstryWoodSlabBlock;
import net.mcreator.astrya.block.AstryWoodPressurePlateBlock;
import net.mcreator.astrya.block.AstryWoodPlanksBlock;
import net.mcreator.astrya.block.AstryWoodLogBlock;
import net.mcreator.astrya.block.AstryWoodFenceGateBlock;
import net.mcreator.astrya.block.AstryWoodFenceBlock;
import net.mcreator.astrya.block.AstryWoodButtonBlock;
import net.mcreator.astrya.block.AstryVinesBlock;
import net.mcreator.astrya.AstryaMod;

public class AstryaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AstryaMod.MODID);
	public static final RegistryObject<Block> ASTRY_WORLD_PORTAL = REGISTRY.register("astry_world_portal", () -> new AstryWorldPortalBlock());
	public static final RegistryObject<Block> SAPHIR_ORE = REGISTRY.register("saphir_ore", () -> new SaphirOreBlock());
	public static final RegistryObject<Block> SAPHIR_BLOCK = REGISTRY.register("saphir_block", () -> new SaphirBlockBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_WOOD = REGISTRY.register("astry_wood_wood", () -> new AstryWoodWoodBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_LOG = REGISTRY.register("astry_wood_log", () -> new AstryWoodLogBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_PLANKS = REGISTRY.register("astry_wood_planks", () -> new AstryWoodPlanksBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_STAIRS = REGISTRY.register("astry_wood_stairs", () -> new AstryWoodStairsBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_SLAB = REGISTRY.register("astry_wood_slab", () -> new AstryWoodSlabBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_BUTTON = REGISTRY.register("astry_wood_button", () -> new AstryWoodButtonBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_PRESSURE_PLATE = REGISTRY.register("astry_wood_pressure_plate", () -> new AstryWoodPressurePlateBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_FENCE = REGISTRY.register("astry_wood_fence", () -> new AstryWoodFenceBlock());
	public static final RegistryObject<Block> ASTRY_WOOD_FENCE_GATE = REGISTRY.register("astry_wood_fence_gate", () -> new AstryWoodFenceGateBlock());
	public static final RegistryObject<Block> ASTRY_VINES = REGISTRY.register("astry_vines", () -> new AstryVinesBlock());
	public static final RegistryObject<Block> ASTRYA_LEAVES = REGISTRY.register("astrya_leaves", () -> new AstryaLeavesBlock());
	public static final RegistryObject<Block> GREEN_FIRE = REGISTRY.register("green_fire", () -> new GreenFireBlock());
	public static final RegistryObject<Block> BLUE_FIRE = REGISTRY.register("blue_fire", () -> new BlueFireBlock());
	public static final RegistryObject<Block> RUBIS_ORE = REGISTRY.register("rubis_ore", () -> new RubisOreBlock());
	public static final RegistryObject<Block> RUBIS_BLOCK = REGISTRY.register("rubis_block", () -> new RubisBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AstryWorldPortalBlock.registerRenderLayer();
			AstryVinesBlock.registerRenderLayer();
			GreenFireBlock.registerRenderLayer();
			BlueFireBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			AstryVinesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			AstryVinesBlock.itemColorLoad(event);
		}
	}
}
