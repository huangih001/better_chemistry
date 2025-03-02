
package net.mcreator.restart_chemistry.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.restart_chemistry.init.RestartChemistryModFluids;

public class LvhuanaBlock extends LiquidBlock {
	public LvhuanaBlock() {
		super(RestartChemistryModFluids.LVHUANA.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
