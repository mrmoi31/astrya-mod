
package net.mcreator.astrya.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.astrya.init.AstryaModTabs;

public class IronStickItem extends Item {
	public IronStickItem() {
		super(new Item.Properties().tab(AstryaModTabs.TAB_ASTRYA).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
