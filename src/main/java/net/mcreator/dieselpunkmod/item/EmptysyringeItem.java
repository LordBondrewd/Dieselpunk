
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dieselpunkmod.init.DieselpunkmodModTabs;

import java.util.List;

public class EmptysyringeItem extends Item {
	public EmptysyringeItem() {
		super(new Item.Properties().tab(DieselpunkmodModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u041F\u0443\u0441\u0442\u043E\u0439 \u0448\u043F\u0440\u0438\u0446. \u0411\u0435\u0441\u043F\u043E\u043B\u0435\u0437\u0435\u043D  \u0431\u0435\u0437 \u0441\u0432\u043E\u0435\u0433\u043E \u0441\u043E\u0434\u0435\u0440\u0436\u0438\u043C\u043E\u0433\u043E."));
	}
}
