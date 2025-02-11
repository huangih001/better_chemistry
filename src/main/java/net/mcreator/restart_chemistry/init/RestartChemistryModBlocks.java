
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.restart_chemistry.block.SodiumoxideblockBlock;
import net.mcreator.restart_chemistry.block.ShiyanTaiBlock;
import net.mcreator.restart_chemistry.block.RongyandianjiechiBlock;
import net.mcreator.restart_chemistry.block.QingyanghuanaBlock;
import net.mcreator.restart_chemistry.block.Nafire1Block;
import net.mcreator.restart_chemistry.block.NaBlock;
import net.mcreator.restart_chemistry.block.Liusuan1Block;
import net.mcreator.restart_chemistry.block.LiukuangBlock;
import net.mcreator.restart_chemistry.block.LiukuaiBlock;
import net.mcreator.restart_chemistry.block.DianjieChiBlock;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RestartChemistryMod.MODID);
	public static final DeferredBlock<Block> NA1 = REGISTRY.register("na1", NaBlock::new);
	public static final DeferredBlock<Block> SHIYAN_TAI = REGISTRY.register("shiyan_tai", ShiyanTaiBlock::new);
	public static final DeferredBlock<Block> DIANJIE_CHI = REGISTRY.register("dianjie_chi", DianjieChiBlock::new);
	public static final DeferredBlock<Block> SODIUMOXIDEBLOCK = REGISTRY.register("sodiumoxideblock", SodiumoxideblockBlock::new);
	public static final DeferredBlock<Block> RONGYANDIANJIECHI = REGISTRY.register("rongyandianjiechi", RongyandianjiechiBlock::new);
	public static final DeferredBlock<Block> QINGYANGHUANA = REGISTRY.register("qingyanghuana", QingyanghuanaBlock::new);
	public static final DeferredBlock<Block> LIUKUAI = REGISTRY.register("liukuai", LiukuaiBlock::new);
	public static final DeferredBlock<Block> LIUKUANG = REGISTRY.register("liukuang", LiukuangBlock::new);
	public static final DeferredBlock<Block> NAFIRE_1 = REGISTRY.register("nafire_1", Nafire1Block::new);
	public static final DeferredBlock<Block> LIUSUAN_1 = REGISTRY.register("liusuan_1", Liusuan1Block::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
