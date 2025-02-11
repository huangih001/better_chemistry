package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.init.RestartChemistryModMobEffects;

public class ZhongduDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		while (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RestartChemistryModMobEffects.ZHONGDU)) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("restart_chemistry:zhongdu_1")))), 4);
		}
	}
}
