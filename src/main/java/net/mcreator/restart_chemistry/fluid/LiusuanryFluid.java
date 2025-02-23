
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

public abstract class LiusuanryFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RestartChemistryModFluidTypes.LIUSUANRY_TYPE.get(), () -> RestartChemistryModFluids.LIUSUANRY.get(),
			() -> RestartChemistryModFluids.FLOWING_LIUSUANRY.get()).explosionResistance(100f).bucket(() -> RestartChemistryModItems.LIUSUANRY_BUCKET.get()).block(() -> (LiquidBlock) RestartChemistryModBlocks.LIUSUANRY.get());

	private LiusuanryFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends LiusuanryFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiusuanryFluid {
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
