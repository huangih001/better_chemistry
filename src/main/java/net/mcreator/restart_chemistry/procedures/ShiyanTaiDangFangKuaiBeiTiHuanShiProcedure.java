package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

public class ShiyanTaiDangFangKuaiBeiTiHuanShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x + 1, y, z))) == Blocks.AIR.defaultBlockState()) == ((world.getBlockState(BlockPos.containing(x - 1, y, z))) == Blocks.AIR.defaultBlockState())) {
			world.setBlock(BlockPos.containing(x, y, z), RestartChemistryModBlocks.SHIYAN_TAI.get().defaultBlockState(), 3);
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RestartChemistryModBlocks.SHIYAN_TAI.get()));
				entityToSpawn.setPickUpDelay(60);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
