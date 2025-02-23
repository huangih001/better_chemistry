
package net.mcreator.restart_chemistry.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.restart_chemistry.procedures.LiusuanryShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure;
import net.mcreator.restart_chemistry.init.RestartChemistryModFluids;

public class LiusuanryBlock extends LiquidBlock {
	public LiusuanryBlock() {
		super(RestartChemistryModFluids.LIUSUANRY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LiusuanryShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure.execute(entity);
	}
}
