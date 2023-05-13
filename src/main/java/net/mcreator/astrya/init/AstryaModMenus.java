
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.astrya.world.inventory.TestMenu;
import net.mcreator.astrya.world.inventory.Test3Menu;
import net.mcreator.astrya.world.inventory.Test2Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstryaModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<TestMenu> TEST = register("test", (id, inv, extraData) -> new TestMenu(id, inv, extraData));
	public static final MenuType<Test2Menu> TEST_2 = register("test_2", (id, inv, extraData) -> new Test2Menu(id, inv, extraData));
	public static final MenuType<Test3Menu> TEST_3 = register("test_3", (id, inv, extraData) -> new Test3Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
