
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dieselpunkmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DieselpunkmodModTabs {
	public static CreativeModeTab TAB_ITEMS;

	public static void load() {
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DieselpunkmodModItems.EMPTYSYRINGE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
