
package net.mcreator.astrya.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.astrya.procedures.RedAppleLeJoueurTermineDutiliserLitemProcedure;
import net.mcreator.astrya.init.AstryaModTabs;

public class RedAppleItem extends Item {
	public RedAppleItem() {
		super(new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RedAppleLeJoueurTermineDutiliserLitemProcedure.execute(entity, itemstack);
		return retval;
	}
}
