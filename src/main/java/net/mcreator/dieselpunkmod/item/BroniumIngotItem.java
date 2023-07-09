
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModTabs;

public class BroniumIngotItem extends Item {
	public BroniumIngotItem() {
		super(new Item.Properties().tab(DieselpunkmodModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
