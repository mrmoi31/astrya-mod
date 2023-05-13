
package net.mcreator.astrya.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.astrya.procedures.SteelSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;
import net.mcreator.astrya.init.AstryaModTabs;

public class SteelSwordItem extends SwordItem {
	public SteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 128;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SteelSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity);
		return retval;
	}
}
