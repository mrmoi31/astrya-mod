package net.mcreator.astrya.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import net.mcreator.astrya.init.AstryaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SteelSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		(new ItemStack(AstryaModItems.STEEL_SWORD.get())).enchant(Enchantments.FIRE_ASPECT, 2);
	}
}
