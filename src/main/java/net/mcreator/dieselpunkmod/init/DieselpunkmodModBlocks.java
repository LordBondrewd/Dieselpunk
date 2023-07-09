
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dieselpunkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.dieselpunkmod.block.RacidiyOreBlock;
import net.mcreator.dieselpunkmod.block.RacidiyBlockBlock;
import net.mcreator.dieselpunkmod.block.DolorineFlowerBlock;
import net.mcreator.dieselpunkmod.block.CrudeOilBlock;
import net.mcreator.dieselpunkmod.block.BroniumOreBlock;
import net.mcreator.dieselpunkmod.block.BroniumBlockBlock;
import net.mcreator.dieselpunkmod.block.BoleniymOreBlock;
import net.mcreator.dieselpunkmod.block.BoleniymBlockBlock;
import net.mcreator.dieselpunkmod.DieselpunkmodMod;

public class DieselpunkmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DieselpunkmodMod.MODID);
	public static final RegistryObject<Block> DOLORINE_FLOWER = REGISTRY.register("dolorine_flower", () -> new DolorineFlowerBlock());
	public static final RegistryObject<Block> BOLENIYM_BLOCK = REGISTRY.register("boleniym_block", () -> new BoleniymBlockBlock());
	public static final RegistryObject<Block> BOLENIYM_ORE = REGISTRY.register("boleniym_ore", () -> new BoleniymOreBlock());
	public static final RegistryObject<Block> BRONIUM_ORE = REGISTRY.register("bronium_ore", () -> new BroniumOreBlock());
	public static final RegistryObject<Block> BRONIUM_BLOCK = REGISTRY.register("bronium_block", () -> new BroniumBlockBlock());
	public static final RegistryObject<Block> RACIDIY_ORE = REGISTRY.register("racidiy_ore", () -> new RacidiyOreBlock());
	public static final RegistryObject<Block> RACIDIY_BLOCK = REGISTRY.register("racidiy_block", () -> new RacidiyBlockBlock());
	public static final RegistryObject<Block> CRUDE_OIL = REGISTRY.register("crude_oil", () -> new CrudeOilBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DolorineFlowerBlock.registerRenderLayer();
		}
	}
}
