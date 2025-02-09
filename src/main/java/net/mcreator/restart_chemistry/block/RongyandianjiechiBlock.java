
package net.mcreator.restart_chemistry.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class RongyandianjiechiBlock extends Block {
	public RongyandianjiechiBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(-16, 5, 0, 4, 26, 32), box(-16, 0, 0, 32, 5, 32), box(6, 5, 4, 30, 21, 30), box(4, 24, 16, 17, 26, 18), box(11, 21, 9, 13, 22, 11), box(10, 22, 8, 14, 23, 12), box(9, 23, 7, 15, 24, 9), box(8, 24, 6, 16, 25, 8),
				box(8, 21, 6, 9, 24, 7), box(15, 21, 6, 16, 24, 7), box(15, 21, 13, 16, 24, 14), box(8, 21, 13, 9, 24, 14), box(8, 21, 16.5, 9, 24, 17.5), box(13, 21, 16.5, 14, 24, 17.5), box(8, 25, 6, 16, 29, 7), box(8, 25, 13, 16, 29, 14),
				box(8, 24, 12, 16, 25, 14), box(9, 23, 11, 15, 24, 13), box(9, 23, 9, 11, 24, 11), box(8, 24, 8, 10, 25, 12), box(13, 23, 9, 15, 24, 11), box(14, 24, 8, 16, 25, 12), box(15, 25, 7, 16, 29, 13), box(8, 25, 7, 9, 29, 13),
				box(17, 21, 16, 19, 26, 18), box(4, 5, 16, 6, 7, 18), box(4, 10, 16, 6, 12, 18));
	}
}
