
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.astrya.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.astrya.client.renderer.Mob1Renderer;
import net.mcreator.astrya.client.renderer.MinimobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AstryaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AstryaModEntities.MINIMOB.get(), MinimobRenderer::new);
		event.registerEntityRenderer(AstryaModEntities.BLUE_ZOMBIE.get(), Mob1Renderer::new);
		event.registerEntityRenderer(AstryaModEntities.THUNDER_BOW.get(), ThrownItemRenderer::new);
	}
}
