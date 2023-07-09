
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dieselpunkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.dieselpunkmod.fluid.CrudeOilFluid;
import net.mcreator.dieselpunkmod.DieselpunkmodMod;

public class DieselpunkmodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DieselpunkmodMod.MODID);
	public static final RegistryObject<Fluid> CRUDE_OIL = REGISTRY.register("crude_oil", () -> new CrudeOilFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CRUDE_OIL = REGISTRY.register("flowing_crude_oil", () -> new CrudeOilFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CRUDE_OIL.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CRUDE_OIL.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
