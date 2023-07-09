
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class AncerineSyringeItem extends Item {

	public AncerineSyringeItem() {
		super(new Item.Properties().tab(DieselpunkmodModTabs.TAB_ITEMS).stacksTo(16).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"Ancerine Syringe\u0412\u0435\u0449\u0435\u0441\u0442\u0432\u043E \u0436\u0451\u043B\u0442\u043E\u0433\u043E \u043E\u0442\u0442\u0435\u043D\u043A\u0430 \u043E\u0431\u043B\u0430\u0434\u0430\u044E\u0449\u0438\u0435 \u0441\u0442\u0438\u043C\u0443\u043B\u0438\u0440\u0443\u044E\u0449\u0438\u043C\u0438 \u0441\u0432\u043E\u0439\u0441\u0442\u0432\u0430\u043C\u0438. \u0414\u043E\u0431\u044B\u0432\u0430\u0435\u0442\u0441\u044F \u0438\u0437 \u0447\u0435\u0440\u043D\u0438\u043B \u0440\u0435\u0434\u043A\u043E\u0433\u043E \u043C\u043E\u0440\u0441\u043A\u043E\u0433\u043E \u0436\u0438\u0432\u043E\u0442\u043D\u043E\u0433\u043E \u043D\u0430\u0437\u044B\u0432\u0430\u0435\u043C\u043E\u0433\u043E (\u0430\u043D\u0434\u0440\u0435\u0439 \u0441\u043C\u0435\u043D\u0438 \u043D\u0430\u0437\u0432\u0430\u043D\u0438\u0435)"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AncerineSyringeUseProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

}
