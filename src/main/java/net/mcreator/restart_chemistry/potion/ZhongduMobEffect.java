
package net.mcreator.restart_chemistry.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.restart_chemistry.procedures.ZhongduDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

public class ZhongduMobEffect extends MobEffect {
	public ZhongduMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ZhongduDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level(), entity);
	}
}
