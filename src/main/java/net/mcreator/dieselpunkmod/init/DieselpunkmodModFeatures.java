
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dieselpunkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.dieselpunkmod.world.features.plants.DolorineFlowerFeature;
import net.mcreator.dieselpunkmod.world.features.ores.RacidiyOreFeature;
import net.mcreator.dieselpunkmod.world.features.ores.BroniumOreFeature;
import net.mcreator.dieselpunkmod.world.features.ores.BoleniymOreFeature;
import net.mcreator.dieselpunkmod.world.features.CrudeOilLakeFeature;
import net.mcreator.dieselpunkmod.DieselpunkmodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DieselpunkmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DieselpunkmodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DOLORINE_FLOWER = register("dolorine_flower", DolorineFlowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DolorineFlowerFeature.GENERATE_BIOMES, DolorineFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOLENIYM_ORE = register("boleniym_ore", BoleniymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BoleniymOreFeature.GENERATE_BIOMES, BoleniymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BRONIUM_ORE = register("bronium_ore", BroniumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BroniumOreFeature.GENERATE_BIOMES, BroniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RACIDIY_ORE = register("racidiy_ore", RacidiyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RacidiyOreFeature.GENERATE_BIOMES, RacidiyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRUDE_OIL_LAKE = register("crude_oil_lake", CrudeOilLakeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.FLUID_SPRINGS, CrudeOilLakeFeature.GENERATE_BIOMES, CrudeOilLakeFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
