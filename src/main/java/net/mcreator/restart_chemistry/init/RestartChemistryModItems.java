
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.restart_chemistry.item.YszqbItem;
import net.mcreator.restart_chemistry.item.YanghuanaItem;
import net.mcreator.restart_chemistry.item.XiaosuanjingItem;
import net.mcreator.restart_chemistry.item.StrangezdItem;
import net.mcreator.restart_chemistry.item.ShiGuanItem;
import net.mcreator.restart_chemistry.item.ShaoPingItem;
import net.mcreator.restart_chemistry.item.ShaoBeiItem;
import net.mcreator.restart_chemistry.item.SaltItem;
import net.mcreator.restart_chemistry.item.QingyanghuanaItem;
import net.mcreator.restart_chemistry.item.LvqiItem;
import net.mcreator.restart_chemistry.item.LvhuanaItem;
import net.mcreator.restart_chemistry.item.LouDouItem;
import net.mcreator.restart_chemistry.item.LogoItem;
import net.mcreator.restart_chemistry.item.LiusuanryItem;
import net.mcreator.restart_chemistry.item.LiudanzhiItem;
import net.mcreator.restart_chemistry.item.JiuJingDengItem;
import net.mcreator.restart_chemistry.item.JiqipingzheguangyetiItem;
import net.mcreator.restart_chemistry.item.JiqipingqitiItem;
import net.mcreator.restart_chemistry.item.JingtiejiaItem;
import net.mcreator.restart_chemistry.item.JiiqipingyetiItem;
import net.mcreator.restart_chemistry.item.JiaoTouDiGuanItem;
import net.mcreator.restart_chemistry.item.HandnaItem;
import net.mcreator.restart_chemistry.item.FudadianduiItem;
import net.mcreator.restart_chemistry.item.DujngchanItem;
import net.mcreator.restart_chemistry.item.DujingjianItem;
import net.mcreator.restart_chemistry.item.DujinggaoItem;
import net.mcreator.restart_chemistry.item.DujingfuItem;
import net.mcreator.restart_chemistry.item.DujingchuItem;
import net.mcreator.restart_chemistry.item.DaoGuanItem;
import net.mcreator.restart_chemistry.item.CreativeyszqbItem;
import net.mcreator.restart_chemistry.item.AllyszqbItem;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RestartChemistryMod.MODID);
	public static final DeferredItem<Item> NA1 = block(RestartChemistryModBlocks.NA1);
	public static final DeferredItem<Item> LOGO = REGISTRY.register("logo", LogoItem::new);
	public static final DeferredItem<Item> YSZQB = REGISTRY.register("yszqb", YszqbItem::new);
	public static final DeferredItem<Item> CREATIVEYSZQB = REGISTRY.register("creativeyszqb", CreativeyszqbItem::new);
	public static final DeferredItem<Item> STRANGEZD = REGISTRY.register("strangezd", StrangezdItem::new);
	public static final DeferredItem<Item> ALLYSZQB = REGISTRY.register("allyszqb", AllyszqbItem::new);
	public static final DeferredItem<Item> SHIYAN_TAI = block(RestartChemistryModBlocks.SHIYAN_TAI);
	public static final DeferredItem<Item> HANDNA = REGISTRY.register("handna", HandnaItem::new);
	public static final DeferredItem<Item> DIANJIE_CHI = block(RestartChemistryModBlocks.DIANJIE_CHI);
	public static final DeferredItem<Item> SODIUMOXIDEBLOCK = block(RestartChemistryModBlocks.SODIUMOXIDEBLOCK);
	public static final DeferredItem<Item> RONGYANDIANJIECHI = block(RestartChemistryModBlocks.RONGYANDIANJIECHI);
	public static final DeferredItem<Item> SHI_GUAN = REGISTRY.register("shi_guan", ShiGuanItem::new);
	public static final DeferredItem<Item> DAO_GUAN = REGISTRY.register("dao_guan", DaoGuanItem::new);
	public static final DeferredItem<Item> JIU_JING_DENG = REGISTRY.register("jiu_jing_deng", JiuJingDengItem::new);
	public static final DeferredItem<Item> LOU_DOU = REGISTRY.register("lou_dou", LouDouItem::new);
	public static final DeferredItem<Item> SHAO_BEI = REGISTRY.register("shao_bei", ShaoBeiItem::new);
	public static final DeferredItem<Item> SHAO_PING = REGISTRY.register("shao_ping", ShaoPingItem::new);
	public static final DeferredItem<Item> JIAO_TOU_DI_GUAN = REGISTRY.register("jiao_tou_di_guan", JiaoTouDiGuanItem::new);
	public static final DeferredItem<Item> SALT = REGISTRY.register("salt", SaltItem::new);
	public static final DeferredItem<Item> YANGHUANA = REGISTRY.register("yanghuana", YanghuanaItem::new);
	public static final DeferredItem<Item> QINGYANGHUANA_BUCKET = REGISTRY.register("qingyanghuana_bucket", QingyanghuanaItem::new);
	public static final DeferredItem<Item> LIUKUAI = block(RestartChemistryModBlocks.LIUKUAI);
	public static final DeferredItem<Item> LIUKUANG = block(RestartChemistryModBlocks.LIUKUANG);
	public static final DeferredItem<Item> LIUDANZHI = REGISTRY.register("liudanzhi", LiudanzhiItem::new);
	public static final DeferredItem<Item> JIQIPINGQITI = REGISTRY.register("jiqipingqiti", JiqipingqitiItem::new);
	public static final DeferredItem<Item> JIIQIPINGYETI = REGISTRY.register("jiiqipingyeti", JiiqipingyetiItem::new);
	public static final DeferredItem<Item> JIQIPINGZHEGUANGYETI = REGISTRY.register("jiqipingzheguangyeti", JiqipingzheguangyetiItem::new);
	public static final DeferredItem<Item> LIUSUANRY_BUCKET = REGISTRY.register("liusuanry_bucket", LiusuanryItem::new);
	public static final DeferredItem<Item> XIAOSUANJING_BUCKET = REGISTRY.register("xiaosuanjing_bucket", XiaosuanjingItem::new);
	public static final DeferredItem<Item> FUDADIANDUI = REGISTRY.register("fudadiandui", FudadianduiItem::new);
	public static final DeferredItem<Item> JINGTIEJIA_HELMET = REGISTRY.register("jingtiejia_helmet", JingtiejiaItem.Helmet::new);
	public static final DeferredItem<Item> JINGTIEJIA_CHESTPLATE = REGISTRY.register("jingtiejia_chestplate", JingtiejiaItem.Chestplate::new);
	public static final DeferredItem<Item> JINGTIEJIA_LEGGINGS = REGISTRY.register("jingtiejia_leggings", JingtiejiaItem.Leggings::new);
	public static final DeferredItem<Item> JINGTIEJIA_BOOTS = REGISTRY.register("jingtiejia_boots", JingtiejiaItem.Boots::new);
	public static final DeferredItem<Item> DUJINGGAO = REGISTRY.register("dujinggao", DujinggaoItem::new);
	public static final DeferredItem<Item> DUJINGJIAN = REGISTRY.register("dujingjian", DujingjianItem::new);
	public static final DeferredItem<Item> DUJNGCHAN = REGISTRY.register("dujngchan", DujngchanItem::new);
	public static final DeferredItem<Item> DUJINGFU = REGISTRY.register("dujingfu", DujingfuItem::new);
	public static final DeferredItem<Item> DUJINGCHU = REGISTRY.register("dujingchu", DujingchuItem::new);
	public static final DeferredItem<Item> LVHUANA_BUCKET = REGISTRY.register("lvhuana_bucket", LvhuanaItem::new);
	public static final DeferredItem<Item> LVQI = REGISTRY.register("lvqi", LvqiItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
