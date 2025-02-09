
package net.mcreator.restart_chemistry.block;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;

public class DianjieChiBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DianjieChiBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("block.restart_chemistry.dianjie_chi.description_0"));
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
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(-11, 17, 7, 9, 19, 9), box(-16, 0, 0, 16, 8, 16), box(9, 8, 11, 11, 20, 15), box(9, 15, 5, 11, 20, 11), box(9, 8, 1, 11, 20, 5), box(11, 8, 1, 15, 20, 15), box(9, -0.46716, 14.67878, 15, 13.53284, 17.67878),
					box(9, 13.49582, 13.99267, 15, 20.49582, 16.49267));
			case NORTH -> Shapes.or(box(7, 17, 7, 27, 19, 9), box(0, 0, 0, 32, 8, 16), box(5, 8, 1, 7, 20, 5), box(5, 15, 5, 7, 20, 11), box(5, 8, 11, 7, 20, 15), box(1, 8, 1, 5, 20, 15), box(1, -0.46716, -1.67878, 7, 13.53284, 1.32122),
					box(1, 13.49582, -0.49267, 7, 20.49582, 2.00733));
			case EAST -> Shapes.or(box(7, 17, 7, 9, 19, 27), box(0, 0, 0, 16, 8, 32), box(11, 8, 5, 15, 20, 7), box(5, 15, 5, 11, 20, 7), box(1, 8, 5, 5, 20, 7), box(1, 8, 1, 15, 20, 5), box(14.67878, -0.46716, 1, 17.67878, 13.53284, 7),
					box(13.99267, 13.49582, 1, 16.49267, 20.49582, 7));
			case WEST -> Shapes.or(box(7, 17, -11, 9, 19, 9), box(0, 0, -16, 16, 8, 16), box(1, 8, 9, 5, 20, 11), box(5, 15, 9, 11, 20, 11), box(11, 8, 9, 15, 20, 11), box(1, 8, 11, 15, 20, 15), box(-1.67878, -0.46716, 9, 1.32122, 13.53284, 15),
					box(-0.49267, 13.49582, 9, 2.00733, 20.49582, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
