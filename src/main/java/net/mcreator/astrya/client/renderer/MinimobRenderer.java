
package net.mcreator.astrya.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.astrya.entity.MinimobEntity;

public class MinimobRenderer extends MobRenderer<MinimobEntity, SlimeModel<MinimobEntity>> {
	public MinimobRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinimobEntity entity) {
		return new ResourceLocation("astrya:textures/entities/slime.png");
	}
}
