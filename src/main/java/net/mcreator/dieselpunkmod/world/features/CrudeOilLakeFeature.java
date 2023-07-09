
package net.mcreator.dieselpunkmod.world.features;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModBlocks;

import java.util.Set;
import java.util.List;

public class CrudeOilLakeFeature extends LakeFeature {
	public static CrudeOilLakeFeature FEATURE = null;
	public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CrudeOilLakeFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("dieselpunkmod:crude_oil_lake", FEATURE,
				new LakeFeature.Configuration(BlockStateProvider.simple(DieselpunkmodModBlocks.CRUDE_OIL.get().defaultBlockState()), BlockStateProvider.simple(Blocks.DEEPSLATE.defaultBlockState())));
		PLACED_FEATURE = PlacementUtils.register("dieselpunkmod:crude_oil_lake", CONFIGURED_FEATURE, List.of(HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public CrudeOilLakeFeature() {
		super(LakeFeature.Configuration.CODEC);
	}
}
