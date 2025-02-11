
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.restart_chemistry.fluid.QingyanghuanaFluid;
import net.mcreator.restart_chemistry.fluid.Liusuan1Fluid;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, RestartChemistryMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> QINGYANGHUANA = REGISTRY.register("qingyanghuana", () -> new QingyanghuanaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_QINGYANGHUANA = REGISTRY.register("flowing_qingyanghuana", () -> new QingyanghuanaFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> LIUSUAN_1 = REGISTRY.register("liusuan_1", () -> new Liusuan1Fluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIUSUAN_1 = REGISTRY.register("flowing_liusuan_1", () -> new Liusuan1Fluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(QINGYANGHUANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QINGYANGHUANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIUSUAN_1.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIUSUAN_1.get(), RenderType.translucent());
		}
	}
}
