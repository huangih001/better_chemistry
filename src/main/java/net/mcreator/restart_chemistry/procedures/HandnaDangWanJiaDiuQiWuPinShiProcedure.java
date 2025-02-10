package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

public class HandnaDangWanJiaDiuQiWuPinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			world.setBlock(BlockPos.containing(x, y, z), RestartChemistryModBlocks.NAFIRE_1.get().defaultBlockState(), 3);
		}
	}
}
