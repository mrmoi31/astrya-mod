
package net.mcreator.astrya.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.astrya.init.AstryaModTabs;
import net.mcreator.astrya.init.AstryaModItems;

public class SaphirHoeItem extends HoeItem {
	public SaphirHoeItem() {
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
				return Ingredient.of(new ItemStack(AstryaModItems.SAPHIR.get()));
			}
		}, 0, -3f, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
	}
}
