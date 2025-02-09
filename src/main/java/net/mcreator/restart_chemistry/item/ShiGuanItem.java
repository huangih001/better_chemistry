
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShiGuanItem extends Item {
	public ShiGuanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u8BD5\u7BA1\u2014\u5316\u5B66\u5B9E\u9A8C\u5BA4\u5E38\u7528\u7684\u4EEA\u5668 "));
		list.add(Component.literal("\u7ECF\u5E38\u7528\u4F5C\u4E8E\u5C11\u91CF\u8BD5\u5242\u7684\u53CD\u5E94\u5BB9\u5668"));
	}
}
