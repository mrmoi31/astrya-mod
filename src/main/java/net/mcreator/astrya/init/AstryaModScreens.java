
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.astrya.client.gui.TestScreen;
import net.mcreator.astrya.client.gui.Test3Screen;
import net.mcreator.astrya.client.gui.Test2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AstryaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AstryaModMenus.TEST, TestScreen::new);
			MenuScreens.register(AstryaModMenus.TEST_2, Test2Screen::new);
			MenuScreens.register(AstryaModMenus.TEST_3, Test3Screen::new);
		});
	}
}
