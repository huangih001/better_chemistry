
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class AllyszqbItem extends Item {
	public AllyszqbItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u5DF2\u7ECF\u63A2\u7D22\u5B8C\u4E16\u754C\u79D1\u6280\u5E76\u8BB0\u5F55\u7740\u6240\u6709\u5B9E\u9A8C\u8BB0\u5F55\u7684\u7EC8\u7AEF"));
	}
}
