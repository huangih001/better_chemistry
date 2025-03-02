package net.mcreator.restart_chemistry.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;
import net.mcreator.restart_chemistry.RestartChemistryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class LiusuanryDangPiLinFangKuaiGengXinShiProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_BLOCK) {
			if ((world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()
					|| (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()
					|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()
					|| (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()
					|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()
					|| (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == RestartChemistryModBlocks.LIUSUANRY.get()) {
				RestartChemistryMod.queueServerWork(100, () -> {
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
		}
	}
}
