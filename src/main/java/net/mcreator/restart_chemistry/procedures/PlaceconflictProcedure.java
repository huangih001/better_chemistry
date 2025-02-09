package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;

public class PlaceconflictProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, double maxx, double maxy, double maxz, double minx, double miny, double minz, double y2) {
		Direction wsen = Direction.NORTH;
		double y1 = 0;
		y1 = y2;
		if (-45 < y1 && y1 < 45) {
			wsen = Direction.SOUTH;
		} else if (45 < y1 && y1 < 135) {
			wsen = Direction.WEST;
		} else if (-135 < y1 && y1 < -45) {
			wsen = Direction.EAST;
		} else {
			wsen = Direction.NORTH;
		}
		if (wsen == Direction.SOUTH) {
			return PlacexyzProcedure.execute(world, x, y, z, maxx, maxy, maxz, minx, miny, minz);
		}
		if (wsen == Direction.WEST) {
			return PlacexyzProcedure.execute(world, x, y, z, minz, maxy, maxx, maxz, miny, minx);
		}
		if (wsen == Direction.EAST) {
			return PlacexyzProcedure.execute(world, x, y, z, 0 - maxz, maxy, 0 - minx, 0 - minz, miny, 0 - maxx);
		}
		return PlacexyzProcedure.execute(world, x, y, z, 0 - minx, maxy, 0 - minz, 0 - maxx, miny, 0 - maxz);
	}
}
