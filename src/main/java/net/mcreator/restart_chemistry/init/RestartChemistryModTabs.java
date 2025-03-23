
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.RestartChemistryMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
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
				tabData.accept(RestartChemistryModItems.LIUSUANRY_BUCKET.get());
				tabData.accept(RestartChemistryModItems.XIAOSUANJING_BUCKET.get());
				tabData.accept(RestartChemistryModItems.FUDADIANDUI.get());
				tabData.accept(RestartChemistryModItems.JINGTIEJIA_HELMET.get());
				tabData.accept(RestartChemistryModItems.JINGTIEJIA_CHESTPLATE.get());
				tabData.accept(RestartChemistryModItems.JINGTIEJIA_LEGGINGS.get());
				tabData.accept(RestartChemistryModItems.JINGTIEJIA_BOOTS.get());
				tabData.accept(RestartChemistryModItems.DUJINGGAO.get());
				tabData.accept(RestartChemistryModItems.DUJINGJIAN.get());
				tabData.accept(RestartChemistryModItems.DUJNGCHAN.get());
				tabData.accept(RestartChemistryModItems.DUJINGFU.get());
				tabData.accept(RestartChemistryModItems.DUJINGCHU.get());
				tabData.accept(RestartChemistryModItems.LVHUANA_BUCKET.get());
				tabData.accept(RestartChemistryModItems.LVQI.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_HELMET.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_CHESTPLATE.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_LEGGINGS.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_BOOTS.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_HELMET.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_CHESTPLATE.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_LEGGINGS.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_BOOTS.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANGAO.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANFU.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANCHU.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANQIU.get());
				tabData.accept(RestartChemistryModItems.DUJINGZUANJIAN.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGGAO.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGFU.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGCHU.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGQIU.get());
				tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIAN.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RestartChemistryModItems.JINGTIEJIA_HELMET.get());
			tabData.accept(RestartChemistryModItems.JINGTIEJIA_CHESTPLATE.get());
			tabData.accept(RestartChemistryModItems.JINGTIEJIA_LEGGINGS.get());
			tabData.accept(RestartChemistryModItems.JINGTIEJIA_BOOTS.get());
			tabData.accept(RestartChemistryModItems.DUJINGJIAN.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_HELMET.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_CHESTPLATE.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_LEGGINGS.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANJIA_BOOTS.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_HELMET.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_CHESTPLATE.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_LEGGINGS.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIA_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RestartChemistryModItems.DUJINGGAO.get());
			tabData.accept(RestartChemistryModItems.DUJNGCHAN.get());
			tabData.accept(RestartChemistryModItems.DUJINGFU.get());
			tabData.accept(RestartChemistryModItems.DUJINGCHU.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANGAO.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANFU.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANCHU.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANQIU.get());
			tabData.accept(RestartChemistryModItems.DUJINGZUANJIAN.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGGAO.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGFU.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGCHU.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGQIU.get());
			tabData.accept(RestartChemistryModItems.DUJINGHEJINGJIAN.get());
		}
	}
}
