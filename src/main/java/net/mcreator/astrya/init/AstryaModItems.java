
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.astrya.item.SteelSwordItem;
import net.mcreator.astrya.item.SteelPickaxeItem;
import net.mcreator.astrya.item.SteelItem;
import net.mcreator.astrya.item.SaphirSwordItem;
import net.mcreator.astrya.item.SaphirShovelItem;
import net.mcreator.astrya.item.SaphirPickaxeItem;
import net.mcreator.astrya.item.SaphirItem;
import net.mcreator.astrya.item.SaphirHoeItem;
import net.mcreator.astrya.item.SaphirAxeItem;
import net.mcreator.astrya.item.SaphirArmorItem;
import net.mcreator.astrya.item.RubisItem;
import net.mcreator.astrya.item.RubiSwordItem;
import net.mcreator.astrya.item.RubiShovelItem;
import net.mcreator.astrya.item.RubiPickaxeItem;
import net.mcreator.astrya.item.RubiHoeItem;
import net.mcreator.astrya.item.RubiAxeItem;
import net.mcreator.astrya.item.MagicPowderItem;
import net.mcreator.astrya.item.IronStickItem;
import net.mcreator.astrya.item.IronBackpackItemItem;
import net.mcreator.astrya.item.DiamondBackpackItem;
import net.mcreator.astrya.item.BackpackItem;
import net.mcreator.astrya.item.AstryWorldItem;
import net.mcreator.astrya.AstryaMod;

public class AstryaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AstryaMod.MODID);
	public static final RegistryObject<Item> SAPHIR = REGISTRY.register("saphir", () -> new SaphirItem());
	public static final RegistryObject<Item> SAPHIR_SWORD = REGISTRY.register("saphir_sword", () -> new SaphirSwordItem());
	public static final RegistryObject<Item> SAPHIR_PICKAXE = REGISTRY.register("saphir_pickaxe", () -> new SaphirPickaxeItem());
	public static final RegistryObject<Item> SAPHIR_AXE = REGISTRY.register("saphir_axe", () -> new SaphirAxeItem());
	public static final RegistryObject<Item> SAPHIR_SHOVEL = REGISTRY.register("saphir_shovel", () -> new SaphirShovelItem());
	public static final RegistryObject<Item> SAPHIR_HOE = REGISTRY.register("saphir_hoe", () -> new SaphirHoeItem());
	public static final RegistryObject<Item> SAPHIR_ARMOR_HELMET = REGISTRY.register("saphir_armor_helmet", () -> new SaphirArmorItem.Helmet());
	public static final RegistryObject<Item> SAPHIR_ARMOR_CHESTPLATE = REGISTRY.register("saphir_armor_chestplate", () -> new SaphirArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPHIR_ARMOR_LEGGINGS = REGISTRY.register("saphir_armor_leggings", () -> new SaphirArmorItem.Leggings());
	public static final RegistryObject<Item> SAPHIR_ARMOR_BOOTS = REGISTRY.register("saphir_armor_boots", () -> new SaphirArmorItem.Boots());
	public static final RegistryObject<Item> ASTRY_WORLD = REGISTRY.register("astry_world", () -> new AstryWorldItem());
	public static final RegistryObject<Item> SAPHIR_ORE = block(AstryaModBlocks.SAPHIR_ORE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> SAPHIR_BLOCK = block(AstryaModBlocks.SAPHIR_BLOCK, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_WOOD = block(AstryaModBlocks.ASTRY_WOOD_WOOD, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_LOG = block(AstryaModBlocks.ASTRY_WOOD_LOG, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_PLANKS = block(AstryaModBlocks.ASTRY_WOOD_PLANKS, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_STAIRS = block(AstryaModBlocks.ASTRY_WOOD_STAIRS, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_SLAB = block(AstryaModBlocks.ASTRY_WOOD_SLAB, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_BUTTON = block(AstryaModBlocks.ASTRY_WOOD_BUTTON, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_PRESSURE_PLATE = block(AstryaModBlocks.ASTRY_WOOD_PRESSURE_PLATE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_FENCE = block(AstryaModBlocks.ASTRY_WOOD_FENCE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_WOOD_FENCE_GATE = block(AstryaModBlocks.ASTRY_WOOD_FENCE_GATE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRY_VINES = block(AstryaModBlocks.ASTRY_VINES, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> ASTRYA_LEAVES = block(AstryaModBlocks.ASTRYA_LEAVES, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> GREEN_FIRE = block(AstryaModBlocks.GREEN_FIRE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> MINIMOB_SPAWN_EGG = REGISTRY.register("minimob_spawn_egg", () -> new ForgeSpawnEggItem(AstryaModEntities.MINIMOB, -16711936, -10027162, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA)));
	public static final RegistryObject<Item> BLUE_ZOMBIE_SPAWN_EGG = REGISTRY.register("blue_zombie_spawn_egg", () -> new ForgeSpawnEggItem(AstryaModEntities.BLUE_ZOMBIE, -16777063, -16777012, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA)));
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> MAGIC_POWDER = REGISTRY.register("magic_powder", () -> new MagicPowderItem());
	public static final RegistryObject<Item> IRON_STICK = REGISTRY.register("iron_stick", () -> new IronStickItem());
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> IRON_BACKPACK_ITEM = REGISTRY.register("iron_backpack_item", () -> new IronBackpackItemItem());
	public static final RegistryObject<Item> DIAMOND_BACKPACK = REGISTRY.register("diamond_backpack", () -> new DiamondBackpackItem());
	public static final RegistryObject<Item> BLUE_FIRE = block(AstryaModBlocks.BLUE_FIRE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> RUBIS = REGISTRY.register("rubis", () -> new RubisItem());
	public static final RegistryObject<Item> RUBIS_ORE = block(AstryaModBlocks.RUBIS_ORE, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> RUBIS_BLOCK = block(AstryaModBlocks.RUBIS_BLOCK, AstryaModTabs.TAB_ASTRYA);
	public static final RegistryObject<Item> RUBI_PICKAXE = REGISTRY.register("rubi_pickaxe", () -> new RubiPickaxeItem());
	public static final RegistryObject<Item> RUBI_AXE = REGISTRY.register("rubi_axe", () -> new RubiAxeItem());
	public static final RegistryObject<Item> RUBI_SWORD = REGISTRY.register("rubi_sword", () -> new RubiSwordItem());
	public static final RegistryObject<Item> RUBI_SHOVEL = REGISTRY.register("rubi_shovel", () -> new RubiShovelItem());
	public static final RegistryObject<Item> RUBI_HOE = REGISTRY.register("rubi_hoe", () -> new RubiHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
