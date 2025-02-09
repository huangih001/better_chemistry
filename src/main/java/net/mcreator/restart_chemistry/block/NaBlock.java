
package net.mcreator.restart_chemistry.block;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.procedures.NaFangKuaiYouXiaoDeFangZhiTiaoJianProcedure;
import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

import java.util.List;

public class NaBlock extends Block {
	public NaBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.9f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u94A0\u5728\u5468\u671F\u8868\u4E2D\u4F4D\u4E8E\u7B2C3\u5468\u671F\u3001\u7B2C\u2160A\u65CF "));
		list.add(Component.literal("\u662F\u78B1\u91D1\u5C5E\u5143\u7D20\u7684\u4EE3\u8868\uFF0C\u8D28\u5730\u67D4\u8F6F"));
		list.add(Component.literal("\u53EF\u4EE5\u8BD5\u8BD5\u5728\u94A0\u5757\u65C1\u8FB9\u5012\u4E00\u6876\u6C34\uFF0C\u4F1A\u6709\u5947\u5999\u7684\u53CD\u5E94"));
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
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(RestartChemistryModBlocks.NA1.get());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		NaFangKuaiYouXiaoDeFangZhiTiaoJianProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
