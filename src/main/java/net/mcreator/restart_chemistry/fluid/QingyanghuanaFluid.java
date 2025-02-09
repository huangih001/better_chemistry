
package net.mcreator.restart_chemistry.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.restart_chemistry.init.RestartChemistryModItems;
import net.mcreator.restart_chemistry.init.RestartChemistryModFluids;
import net.mcreator.restart_chemistry.init.RestartChemistryModFluidTypes;
import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

public abstract class QingyanghuanaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RestartChemistryModFluidTypes.QINGYANGHUANA_TYPE.get(), () -> RestartChemistryModFluids.QINGYANGHUANA.get(),
			() -> RestartChemistryModFluids.FLOWING_QINGYANGHUANA.get()).explosionResistance(100f).tickRate(8).bucket(() -> RestartChemistryModItems.QINGYANGHUANA_BUCKET.get()).block(() -> (LiquidBlock) RestartChemistryModBlocks.QINGYANGHUANA.get());

	private QingyanghuanaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends QingyanghuanaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QingyanghuanaFluid {
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
