
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class StrangezdItem extends Item {
	public StrangezdItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u4E00\u4E2A\u5947\u602A\u7684\u7EC8\u7AEF\uFF0C\u53F3\u952E\u6216\u8BB8\u4F1A\u51FA\u73B0\u4E9B\u4EC0\u4E48"));
	}
}
