
package net.mcreator.dieselpunkmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModFluids;

public class CrudeOilBlock extends LiquidBlock {
	public CrudeOilBlock() {
		super(() -> (FlowingFluid) DieselpunkmodModFluids.CRUDE_OIL.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
