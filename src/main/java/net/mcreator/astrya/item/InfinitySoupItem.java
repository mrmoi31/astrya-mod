
package net.mcreator.astrya.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.astrya.init.AstryaModTabs;
import net.mcreator.astrya.init.AstryaModItems;

public class InfinitySoupItem extends Item {
	public InfinitySoupItem() {
		super(new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(20).saturationMod(1f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(AstryaModItems.INFINITY_SOUP.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
