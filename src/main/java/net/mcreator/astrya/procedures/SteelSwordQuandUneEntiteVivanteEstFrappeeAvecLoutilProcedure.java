package net.mcreator.astrya.procedures;

import net.minecraft.world.entity.Entity;

public class SteelSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
