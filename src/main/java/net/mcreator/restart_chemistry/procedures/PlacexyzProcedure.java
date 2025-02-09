package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PlacexyzProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, double maxx, double maxy, double maxz, double minx, double miny, double minz) {
		boolean found = false;
		String debugtst = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = minx;
		for (int index0 = 0; index0 < (int) (Math.abs(maxx - minx) + 1); index0++) {
			sy = miny;
			for (int index1 = 0; index1 < (int) (Math.abs(maxy - miny) + 1); index1++) {
				sz = minz;
				for (int index2 = 0; index2 < (int) (Math.abs(maxz - minz) + 1); index2++) {
					if (!(sx == 0 && sy == 0 && sz == 0 || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		return found;
	}
}
