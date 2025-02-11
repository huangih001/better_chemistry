package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.restart_chemistry.init.RestartChemistryModMobEffects;

public class Liusuan1ShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(RestartChemistryModMobEffects.LIUSUAN_2, 200, 3));
	}
}
