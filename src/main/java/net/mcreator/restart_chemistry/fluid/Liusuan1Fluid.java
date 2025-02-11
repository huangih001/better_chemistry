
package net.mcreator.restart_chemistry.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.restart_chemistry.init.RestartChemistryModItems;
import net.mcreator.restart_chemistry.init.RestartChemistryModFluids;
import net.mcreator.restart_chemistry.init.RestartChemistryModFluidTypes;
import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

public abstract class Liusuan1Fluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RestartChemistryModFluidTypes.LIUSUAN_1_TYPE.get(), () -> RestartChemistryModFluids.LIUSUAN_1.get(),
			() -> RestartChemistryModFluids.FLOWING_LIUSUAN_1.get()).explosionResistance(100f).bucket(() -> RestartChemistryModItems.LIUSUAN_1_BUCKET.get()).block(() -> (LiquidBlock) RestartChemistryModBlocks.LIUSUAN_1.get());

	private Liusuan1Fluid() {
		super(PROPERTIES);
	}

	public static class Source extends Liusuan1Fluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends Liusuan1Fluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
