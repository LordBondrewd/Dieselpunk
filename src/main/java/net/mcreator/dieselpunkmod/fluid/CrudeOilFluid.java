
package net.mcreator.dieselpunkmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModItems;
import net.mcreator.dieselpunkmod.init.DieselpunkmodModFluids;
import net.mcreator.dieselpunkmod.init.DieselpunkmodModBlocks;

public abstract class CrudeOilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DieselpunkmodModFluids.CRUDE_OIL, DieselpunkmodModFluids.FLOWING_CRUDE_OIL,
			FluidAttributes.builder(new ResourceLocation("dieselpunkmod:blocks/crudeoilstill"), new ResourceLocation("dieselpunkmod:blocks/crudeoilflow"))

					.viscosity(3000)

	).explosionResistance(100f)

			.tickRate(20)

			.bucket(DieselpunkmodModItems.CRUDE_OIL_BUCKET).block(() -> (LiquidBlock) DieselpunkmodModBlocks.CRUDE_OIL.get());

	private CrudeOilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CrudeOilFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CrudeOilFluid {
		public Flowing() {
			super();
		}

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
