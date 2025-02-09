package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RangeProcedure {
	public static boolean execute(LevelAccessor world, double C11) {
		boolean logc = false;
		if (!world.isClientSide()) {
			logc = Math.random() < C11;
		}
		return logc;
	}
}
