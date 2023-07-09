
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dieselpunkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dieselpunkmod.item.RacidiyRawOreItem;
import net.mcreator.dieselpunkmod.item.RacidiyIngotItem;
import net.mcreator.dieselpunkmod.item.EmptysyringeItem;
import net.mcreator.dieselpunkmod.item.DolorineItem;
import net.mcreator.dieselpunkmod.item.CrudeOilItem;
import net.mcreator.dieselpunkmod.item.BroniumRawOreItem;
import net.mcreator.dieselpunkmod.item.BroniumIngotItem;
import net.mcreator.dieselpunkmod.item.BoleniymIngotItem;
import net.mcreator.dieselpunkmod.item.BoleniumRawOreItem;
import net.mcreator.dieselpunkmod.item.AncerineSyringeItem;
import net.mcreator.dieselpunkmod.item.AncerineItem;
import net.mcreator.dieselpunkmod.DieselpunkmodMod;

public class DieselpunkmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DieselpunkmodMod.MODID);
	public static final RegistryObject<Item> ANCERINE_SYRINGE = REGISTRY.register("ancerine_syringe", () -> new AncerineSyringeItem());
	public static final RegistryObject<Item> EMPTYSYRINGE = REGISTRY.register("emptysyringe", () -> new EmptysyringeItem());
	public static final RegistryObject<Item> ANCERINE = REGISTRY.register("ancerine", () -> new AncerineItem());
	public static final RegistryObject<Item> DOLORINE = REGISTRY.register("dolorine", () -> new DolorineItem());
	public static final RegistryObject<Item> DOLORINE_FLOWER = block(DieselpunkmodModBlocks.DOLORINE_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BOLENIYM_BLOCK = block(DieselpunkmodModBlocks.BOLENIYM_BLOCK, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> BOLENIYM_ORE = block(DieselpunkmodModBlocks.BOLENIYM_ORE, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> BOLENIYM_INGOT = REGISTRY.register("boleniym_ingot", () -> new BoleniymIngotItem());
	public static final RegistryObject<Item> BOLENIUM_RAW_ORE = REGISTRY.register("bolenium_raw_ore", () -> new BoleniumRawOreItem());
	public static final RegistryObject<Item> BRONIUM_ORE = block(DieselpunkmodModBlocks.BRONIUM_ORE, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> BRONIUM_BLOCK = block(DieselpunkmodModBlocks.BRONIUM_BLOCK, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> BRONIUM_INGOT = REGISTRY.register("bronium_ingot", () -> new BroniumIngotItem());
	public static final RegistryObject<Item> BRONIUM_RAW_ORE = REGISTRY.register("bronium_raw_ore", () -> new BroniumRawOreItem());
	public static final RegistryObject<Item> RACIDIY_ORE = block(DieselpunkmodModBlocks.RACIDIY_ORE, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> RACIDIY_BLOCK = block(DieselpunkmodModBlocks.RACIDIY_BLOCK, DieselpunkmodModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> RACIDIY_INGOT = REGISTRY.register("racidiy_ingot", () -> new RacidiyIngotItem());
	public static final RegistryObject<Item> RACIDIY_RAW_ORE = REGISTRY.register("racidiy_raw_ore", () -> new RacidiyRawOreItem());
	public static final RegistryObject<Item> CRUDE_OIL_BUCKET = REGISTRY.register("crude_oil_bucket", () -> new CrudeOilItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
