package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class NaFangKuaiYouXiaoDeFangZhiTiaoJianProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN || (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN
				|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN || (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN
				|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN || (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN
				|| (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			RestartChemistryMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z))) == RestartChemistryModBlocks.NA1.get().defaultBlockState()) {
					TntProcedure.execute(world, x, y, z, 5);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 6, Level.ExplosionInteraction.TNT);
					world.setBlock(BlockPos.containing(x, y, z), RestartChemistryModBlocks.QINGYANGHUANA.get().defaultBlockState(), 3);
				}
			});
		} else {
			RestartChemistryMod.queueServerWork(300, () -> {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
				if ((world.getBlockState(BlockPos.containing(x, y, z))) == RestartChemistryModBlocks.NA1.get().defaultBlockState()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RestartChemistryModBlocks.SODIUMOXIDEBLOCK.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			});
		}
	}
}
