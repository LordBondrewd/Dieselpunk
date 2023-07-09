
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModTabs;
import net.mcreator.dieselpunkmod.init.DieselpunkmodModFluids;

public class CrudeOilItem extends BucketItem {
	public CrudeOilItem() {
		super(DieselpunkmodModFluids.CRUDE_OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(DieselpunkmodModTabs.TAB_ITEMS));
	}
}
