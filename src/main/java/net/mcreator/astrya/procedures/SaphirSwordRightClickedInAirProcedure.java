package net.mcreator.astrya.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.mcreator.astrya.init.AstryaModBlocks;

public class SaphirSwordRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("saphir"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (world instanceof ServerLevel _level)
			FallingBlockEntity.fall(_level, new BlockPos(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState());
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (x + 1), (y + 0), (z + 1), new ItemStack(AstryaModBlocks.SAPHIR_ORE.get()));
			entityToSpawn.setPickUpDelay(10);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
