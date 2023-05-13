package net.mcreator.astrya.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.astrya.init.AstryaModBlocks;

public class FlintsaphirRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), AstryaModBlocks.GREEN_FIRE.get().defaultBlockState(), 3);
	}
}
