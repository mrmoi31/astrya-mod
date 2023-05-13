
package net.mcreator.astrya.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.astrya.init.AstryaModTabs;
import net.mcreator.astrya.init.AstryaModItems;

public abstract class SaphirArmorItem extends ArmorItem {
	public SaphirArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 8, 7, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AstryaModItems.SAPHIR.get()));
			}

			@Override
			public String getName() {
				return "saphir_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SaphirArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "astrya:textures/models/armor/saphir_layer_1.png";
		}
	}

	public static class Chestplate extends SaphirArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "astrya:textures/models/armor/saphir_layer_1.png";
		}
	}

	public static class Leggings extends SaphirArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "astrya:textures/models/armor/saphir_layer_2.png";
		}
	}

	public static class Boots extends SaphirArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "astrya:textures/models/armor/saphir_layer_1.png";
		}
	}
}
