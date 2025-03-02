
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

import net.mcreator.restart_chemistry.fluid.XiaosuanjingFluid;
import net.mcreator.restart_chemistry.fluid.QingyanghuanaFluid;
import net.mcreator.restart_chemistry.fluid.LvhuanaFluid;
import net.mcreator.restart_chemistry.fluid.LiusuanryFluid;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, RestartChemistryMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> QINGYANGHUANA = REGISTRY.register("qingyanghuana", () -> new QingyanghuanaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_QINGYANGHUANA = REGISTRY.register("flowing_qingyanghuana", () -> new QingyanghuanaFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> LIUSUANRY = REGISTRY.register("liusuanry", () -> new LiusuanryFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIUSUANRY = REGISTRY.register("flowing_liusuanry", () -> new LiusuanryFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> XIAOSUANJING = REGISTRY.register("xiaosuanjing", () -> new XiaosuanjingFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_XIAOSUANJING = REGISTRY.register("flowing_xiaosuanjing", () -> new XiaosuanjingFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> LVHUANA = REGISTRY.register("lvhuana", () -> new LvhuanaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LVHUANA = REGISTRY.register("flowing_lvhuana", () -> new LvhuanaFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(QINGYANGHUANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QINGYANGHUANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIUSUANRY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIUSUANRY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(XIAOSUANJING.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_XIAOSUANJING.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LVHUANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LVHUANA.get(), RenderType.translucent());
		}
	}
}
