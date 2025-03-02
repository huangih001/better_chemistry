
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.restart_chemistry.fluid.types.XiaosuanjingFluidType;
import net.mcreator.restart_chemistry.fluid.types.QingyanghuanaFluidType;
import net.mcreator.restart_chemistry.fluid.types.LvhuanaFluidType;
import net.mcreator.restart_chemistry.fluid.types.LiusuanryFluidType;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, RestartChemistryMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> QINGYANGHUANA_TYPE = REGISTRY.register("qingyanghuana", () -> new QingyanghuanaFluidType());
	public static final DeferredHolder<FluidType, FluidType> LIUSUANRY_TYPE = REGISTRY.register("liusuanry", () -> new LiusuanryFluidType());
	public static final DeferredHolder<FluidType, FluidType> XIAOSUANJING_TYPE = REGISTRY.register("xiaosuanjing", () -> new XiaosuanjingFluidType());
	public static final DeferredHolder<FluidType, FluidType> LVHUANA_TYPE = REGISTRY.register("lvhuana", () -> new LvhuanaFluidType());
}
