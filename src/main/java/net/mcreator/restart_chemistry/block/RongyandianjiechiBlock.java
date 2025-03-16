
package net.mcreator.restart_chemistry.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.world.inventory.Rongyandianjiechi3Menu;
import net.mcreator.restart_chemistry.block.entity.RongyandianjiechiBlockEntity;

import io.netty.buffer.Unpooled;

public class RongyandianjiechiBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public RongyandianjiechiBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
			default -> Shapes.or(box(20.72391, 2.04659, 6.48545, 27.35487, 11.40634, 15.98163), box(-0.86777, 1.06026, 3.14502, 3.58784, 14.35185, 6.25626), box(0.0435, 1.06026, 2.23376, 4.49911, 14.35185, 5.345),
					box(1.33222, 1.06026, -0.87749, 4.44346, 14.35185, 3.57812), box(2.24348, 1.06026, 0.03377, 5.35472, 14.35185, 4.48938), box(4.01036, 1.06026, 1.32249, 8.46597, 14.35185, 4.43374),
					box(3.0991, 1.06026, 2.23376, 7.55471, 14.35185, 5.345), box(3.15474, 1.06026, 4.00064, 6.26599, 14.35185, 8.45624), box(2.24348, 1.06026, 3.08937, 5.35472, 14.35185, 7.54498),
					box(2.24348, 1.06026, 10.58937, 5.35472, 14.35185, 15.04498), box(3.15474, 1.06026, 11.50064, 6.26599, 14.35185, 15.95624), box(3.0991, 1.06026, 9.73376, 7.55471, 14.35185, 12.845),
					box(4.01036, 1.06026, 8.82249, 8.46597, 14.35185, 11.93374), box(2.24348, 1.06026, 7.53377, 5.35472, 14.35185, 11.98938), box(1.33222, 1.06026, 6.62251, 4.44346, 14.35185, 11.07812),
					box(0.0435, 1.06026, 9.73376, 4.49911, 14.35185, 12.845), box(-0.86777, 1.06026, 10.64502, 3.58784, 14.35185, 13.75626), box(22.66607, 2.04659, 8.42761, 29.29703, 11.40634, 17.9238),
					box(22.50382, 2.04659, 4.66188, 32, 11.40634, 11.29284), box(22.50382, 2.04659, -1.94341, 32, 11.40634, 4.68754), box(20.72391, 2.04659, -0.02691, 27.35487, 11.40634, 9.46927),
					box(18.78175, 2.04659, -1.96907, 25.4127, 11.40634, 7.52711), box(16.03512, 2.04659, 4.66188, 25.5313, 11.40634, 11.29284), box(14.09295, 2.04659, 6.60405, 23.58914, 11.40634, 13.235),
					box(7.5, 2.04659, -0.03163, 18.85606, 11.25625, 16), box(7.5, 11.18544, -0.02904, 18.85606, 14.39176, 12.86449), box(7.5, 19.60815, 8.94982, 18.85606, 23.36023, 13.3841), box(0, 0, -0.03163, 32, 2.04659, 16),
					box(23.81363, 11.25625, 7.13144, 25.17803, 12.96175, 8.49583), box(18.35606, 12.96175, 7.13144, 25.17803, 14.32614, 8.49583));
			case NORTH -> Shapes.or(box(-11.35487, 2.04659, 0.01837, -4.72391, 11.40634, 9.51455), box(12.41216, 1.06026, 9.74374, 16.86777, 14.35185, 12.85498), box(11.50089, 1.06026, 10.655, 15.9565, 14.35185, 13.76624),
					box(11.55654, 1.06026, 12.42188, 14.66778, 14.35185, 16.87749), box(10.64528, 1.06026, 11.51062, 13.75652, 14.35185, 15.96623), box(7.53403, 1.06026, 11.56626, 11.98964, 14.35185, 14.67751),
					box(8.44529, 1.06026, 10.655, 12.9009, 14.35185, 13.76624), box(9.73401, 1.06026, 7.54376, 12.84526, 14.35185, 11.99936), box(10.64528, 1.06026, 8.45502, 13.75652, 14.35185, 12.91063),
					box(10.64528, 1.06026, 0.95502, 13.75652, 14.35185, 5.41063), box(9.73401, 1.06026, 0.04376, 12.84526, 14.35185, 4.49936), box(8.44529, 1.06026, 3.155, 12.9009, 14.35185, 6.26624),
					box(7.53403, 1.06026, 4.06626, 11.98964, 14.35185, 7.17751), box(10.64528, 1.06026, 4.01062, 13.75652, 14.35185, 8.46623), box(11.55654, 1.06026, 4.92188, 14.66778, 14.35185, 9.37749),
					box(11.50089, 1.06026, 3.155, 15.9565, 14.35185, 6.26624), box(12.41216, 1.06026, 2.24374, 16.86777, 14.35185, 5.35498), box(-13.29703, 2.04659, -1.9238, -6.66607, 11.40634, 7.57239),
					box(-16, 2.04659, 4.70716, -6.50382, 11.40634, 11.33812), box(-16, 2.04659, 11.31246, -6.50382, 11.40634, 17.94341), box(-11.35487, 2.04659, 6.53073, -4.72391, 11.40634, 16.02691),
					box(-9.4127, 2.04659, 8.47289, -2.78175, 11.40634, 17.96907), box(-9.5313, 2.04659, 4.70716, -0.03512, 11.40634, 11.33812), box(-7.58914, 2.04659, 2.765, 1.90705, 11.40634, 9.39595),
					box(-2.85606, 2.04659, 0, 8.5, 11.25625, 16.03163), box(-2.85606, 11.18544, 3.13551, 8.5, 14.39176, 16.02904), box(-2.85606, 19.60815, 2.6159, 8.5, 23.36023, 7.05018), box(-16, 0, 0, 16, 2.04659, 16.03163),
					box(-9.17803, 11.25625, 7.50417, -7.81363, 12.96175, 8.86856), box(-9.17803, 12.96175, 7.50417, -2.35606, 14.32614, 8.86856));
			case EAST -> Shapes.or(box(6.48545, 2.04659, -11.35487, 15.98163, 11.40634, -4.72391), box(3.14502, 1.06026, 12.41216, 6.25626, 14.35185, 16.86777), box(2.23376, 1.06026, 11.50089, 5.345, 14.35185, 15.9565),
					box(-0.87749, 1.06026, 11.55654, 3.57812, 14.35185, 14.66778), box(0.03377, 1.06026, 10.64528, 4.48938, 14.35185, 13.75652), box(1.32249, 1.06026, 7.53403, 4.43374, 14.35185, 11.98964),
					box(2.23376, 1.06026, 8.44529, 5.345, 14.35185, 12.9009), box(4.00064, 1.06026, 9.73401, 8.45624, 14.35185, 12.84526), box(3.08937, 1.06026, 10.64528, 7.54498, 14.35185, 13.75652),
					box(10.58937, 1.06026, 10.64528, 15.04498, 14.35185, 13.75652), box(11.50064, 1.06026, 9.73401, 15.95624, 14.35185, 12.84526), box(9.73376, 1.06026, 8.44529, 12.845, 14.35185, 12.9009),
					box(8.82249, 1.06026, 7.53403, 11.93374, 14.35185, 11.98964), box(7.53377, 1.06026, 10.64528, 11.98938, 14.35185, 13.75652), box(6.62251, 1.06026, 11.55654, 11.07812, 14.35185, 14.66778),
					box(9.73376, 1.06026, 11.50089, 12.845, 14.35185, 15.9565), box(10.64502, 1.06026, 12.41216, 13.75626, 14.35185, 16.86777), box(8.42761, 2.04659, -13.29703, 17.9238, 11.40634, -6.66607),
					box(4.66188, 2.04659, -16, 11.29284, 11.40634, -6.50382), box(-1.94341, 2.04659, -16, 4.68754, 11.40634, -6.50382), box(-0.02691, 2.04659, -11.35487, 9.46927, 11.40634, -4.72391),
					box(-1.96907, 2.04659, -9.4127, 7.52711, 11.40634, -2.78175), box(4.66188, 2.04659, -9.5313, 11.29284, 11.40634, -0.03512), box(6.60405, 2.04659, -7.58914, 13.235, 11.40634, 1.90705),
					box(-0.03163, 2.04659, -2.85606, 16, 11.25625, 8.5), box(-0.02904, 11.18544, -2.85606, 12.86449, 14.39176, 8.5), box(8.94982, 19.60815, -2.85606, 13.3841, 23.36023, 8.5), box(-0.03163, 0, -16, 16, 2.04659, 16),
					box(7.13144, 11.25625, -9.17803, 8.49583, 12.96175, -7.81363), box(7.13144, 12.96175, -9.17803, 8.49583, 14.32614, -2.35606));
			case WEST -> Shapes.or(box(0.01837, 2.04659, 20.72391, 9.51455, 11.40634, 27.35487), box(9.74374, 1.06026, -0.86777, 12.85498, 14.35185, 3.58784), box(10.655, 1.06026, 0.0435, 13.76624, 14.35185, 4.49911),
					box(12.42188, 1.06026, 1.33222, 16.87749, 14.35185, 4.44346), box(11.51062, 1.06026, 2.24348, 15.96623, 14.35185, 5.35472), box(11.56626, 1.06026, 4.01036, 14.67751, 14.35185, 8.46597),
					box(10.655, 1.06026, 3.0991, 13.76624, 14.35185, 7.55471), box(7.54376, 1.06026, 3.15474, 11.99936, 14.35185, 6.26599), box(8.45502, 1.06026, 2.24348, 12.91063, 14.35185, 5.35472),
					box(0.95502, 1.06026, 2.24348, 5.41063, 14.35185, 5.35472), box(0.04376, 1.06026, 3.15474, 4.49936, 14.35185, 6.26599), box(3.155, 1.06026, 3.0991, 6.26624, 14.35185, 7.55471),
					box(4.06626, 1.06026, 4.01036, 7.17751, 14.35185, 8.46597), box(4.01062, 1.06026, 2.24348, 8.46623, 14.35185, 5.35472), box(4.92188, 1.06026, 1.33222, 9.37749, 14.35185, 4.44346),
					box(3.155, 1.06026, 0.0435, 6.26624, 14.35185, 4.49911), box(2.24374, 1.06026, -0.86777, 5.35498, 14.35185, 3.58784), box(-1.9238, 2.04659, 22.66607, 7.57239, 11.40634, 29.29703),
					box(4.70716, 2.04659, 22.50382, 11.33812, 11.40634, 32), box(11.31246, 2.04659, 22.50382, 17.94341, 11.40634, 32), box(6.53073, 2.04659, 20.72391, 16.02691, 11.40634, 27.35487),
					box(8.47289, 2.04659, 18.78175, 17.96907, 11.40634, 25.4127), box(4.70716, 2.04659, 16.03512, 11.33812, 11.40634, 25.5313), box(2.765, 2.04659, 14.09295, 9.39595, 11.40634, 23.58914),
					box(0, 2.04659, 7.5, 16.03163, 11.25625, 18.85606), box(3.13551, 11.18544, 7.5, 16.02904, 14.39176, 18.85606), box(2.6159, 19.60815, 7.5, 7.05018, 23.36023, 18.85606), box(0, 0, 0, 16.03163, 2.04659, 32),
					box(7.50417, 11.25625, 23.81363, 8.86856, 12.96175, 25.17803), box(7.50417, 12.96175, 18.35606, 8.86856, 14.32614, 25.17803));
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

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player) {
			player.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("熔盐电解池");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new Rongyandianjiechi3Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new RongyandianjiechiBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof RongyandianjiechiBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof RongyandianjiechiBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
