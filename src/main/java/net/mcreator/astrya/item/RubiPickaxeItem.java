
package net.mcreator.astrya.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.astrya.init.AstryaModTabs;
import net.mcreator.astrya.init.AstryaModItems;

public class RubiPickaxeItem extends PickaxeItem {
	public RubiPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AstryaModItems.RUBIS.get()));
			}
		}, 1, -3f, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
	}
}
