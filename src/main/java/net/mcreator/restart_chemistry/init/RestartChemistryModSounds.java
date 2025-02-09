
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RestartChemistryMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CHEMISTRY = REGISTRY.register("chemistry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("restart_chemistry", "chemistry")));
}
