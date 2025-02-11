
package net.mcreator.restart_chemistry.potion;

import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.restart_chemistry.procedures.ZhongduDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

import java.util.Set;

public class ZhongduMobEffect extends MobEffect {
	public ZhongduMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.PROTECTED_BY_TOTEM);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ZhongduDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level(), entity);
	}
}
