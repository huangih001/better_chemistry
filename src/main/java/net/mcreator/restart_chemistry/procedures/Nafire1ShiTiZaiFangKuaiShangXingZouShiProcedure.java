package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.entity.Entity;

public class Nafire1ShiTiZaiFangKuaiShangXingZouShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(5);
	}
}
