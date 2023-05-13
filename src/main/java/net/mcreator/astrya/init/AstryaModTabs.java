
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AstryaModTabs {
	public static CreativeModeTab TAB_ASTRYA;

	public static void load() {
		TAB_ASTRYA = new CreativeModeTab("tabastrya") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AstryaModItems.SAPHIR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
