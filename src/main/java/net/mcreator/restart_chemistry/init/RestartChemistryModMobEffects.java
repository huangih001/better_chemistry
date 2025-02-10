
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.potion.Liusuan2MobEffect;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, RestartChemistryMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> LIUSUAN_2 = REGISTRY.register("liusuan_2", () -> new Liusuan2MobEffect());
}
