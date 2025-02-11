
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RestartChemistryMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_CHEMISTRY = REGISTRY.register("better_chemistry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.restart_chemistry.better_chemistry")).icon(() -> new ItemStack(RestartChemistryModItems.LOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RestartChemistryModBlocks.NA1.get().asItem());
				tabData.accept(RestartChemistryModItems.YSZQB.get());
				tabData.accept(RestartChemistryModItems.CREATIVEYSZQB.get());
				tabData.accept(RestartChemistryModItems.STRANGEZD.get());
				tabData.accept(RestartChemistryModItems.ALLYSZQB.get());
				tabData.accept(RestartChemistryModBlocks.SHIYAN_TAI.get().asItem());
				tabData.accept(RestartChemistryModItems.HANDNA.get());
				tabData.accept(RestartChemistryModBlocks.DIANJIE_CHI.get().asItem());
				tabData.accept(RestartChemistryModBlocks.SODIUMOXIDEBLOCK.get().asItem());
				tabData.accept(RestartChemistryModBlocks.RONGYANDIANJIECHI.get().asItem());
				tabData.accept(RestartChemistryModItems.SHI_GUAN.get());
				tabData.accept(RestartChemistryModItems.DAO_GUAN.get());
				tabData.accept(RestartChemistryModItems.JIU_JING_DENG.get());
				tabData.accept(RestartChemistryModItems.LOU_DOU.get());
				tabData.accept(RestartChemistryModItems.SHAO_BEI.get());
				tabData.accept(RestartChemistryModItems.SHAO_PING.get());
				tabData.accept(RestartChemistryModItems.JIAO_TOU_DI_GUAN.get());
				tabData.accept(RestartChemistryModItems.SALT.get());
				tabData.accept(RestartChemistryModItems.YANGHUANA.get());
				tabData.accept(RestartChemistryModItems.QINGYANGHUANA_BUCKET.get());
				tabData.accept(RestartChemistryModBlocks.LIUKUAI.get().asItem());
				tabData.accept(RestartChemistryModBlocks.LIUKUANG.get().asItem());
				tabData.accept(RestartChemistryModItems.LIUDANZHI.get());
				tabData.accept(RestartChemistryModItems.JIQIPINGQITI.get());
				tabData.accept(RestartChemistryModItems.JIIQIPINGYETI.get());
				tabData.accept(RestartChemistryModItems.JIQIPINGZHEGUANGYETI.get());
				tabData.accept(RestartChemistryModBlocks.NAFIRE_1.get().asItem());
				tabData.accept(RestartChemistryModItems.LIUSUAN_1_BUCKET.get());
			}).build());
}
