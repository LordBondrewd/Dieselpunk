
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dieselpunkmod.procedures.DolorinePowderEatenProcedure;
import net.mcreator.dieselpunkmod.init.DieselpunkmodModTabs;

import java.util.List;

public class DolorineItem extends Item {
	public DolorineItem() {
		super(new Item.Properties().tab(DieselpunkmodModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u041D\u0435\u043E\u0447\u0438\u0449\u0435\u043D\u043D\u044B\u0439 \u043F\u043E\u0440\u043E\u0448\u043E\u043A \u0434\u043E\u043B\u043E\u0440\u0438\u043D\u0430. \u042F\u0434\u043E\u0432\u0438\u0442 \u0432 \u0447\u0438\u0441\u0442\u043E\u043C \u0432\u0438\u0434\u0435"));
		list.add(new TextComponent(
				"\u043D\u043E \u043F\u0440\u0438\u043C\u0435\u043D\u044F\u0435\u0442\u0441\u044F \u0434\u043B\u044F \u043F\u0440\u0438\u0433\u043E\u0442\u043E\u0432\u043B\u0435\u043D\u0438\u044F \u0434\u043E\u043B\u0433\u043E\u0434\u0435\u0439\u0441\u0442\u0432\u0443\u044E\u0449\u0438\u0445 \u0431\u043E\u0435\u0432\u044B\u0445 \u0441\u0442\u0438\u043C\u0443\u043B\u044F\u0442\u043E\u0440\u043E\u0432."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DolorinePowderEatenProcedure.execute(entity);
		return retval;
	}
}
