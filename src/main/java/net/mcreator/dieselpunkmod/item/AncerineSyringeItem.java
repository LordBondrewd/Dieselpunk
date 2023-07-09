
package net.mcreator.dieselpunkmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.dieselpunkmod.procedures.AncerineSyringeUseProcedure;
import net.mcreator.dieselpunkmod.init.DieselpunkmodModTabs;

public class AncerineSyringeItem extends Item {
	public AncerineSyringeItem() {
		super(new Item.Properties().tab(DieselpunkmodModTabs.TAB_ITEMS).stacksTo(16).rarity(Rarity.COMMON));
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
