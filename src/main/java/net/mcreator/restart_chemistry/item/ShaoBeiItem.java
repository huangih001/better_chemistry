
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShaoBeiItem extends Item {
	public ShaoBeiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u70E7\u676F\u2014\u52A0\u70ED\u3001\u6EB6\u89E3\u3001\u6DF7\u5408\u3001\u716E\u6CB8\u3001\u7194\u878D\u3001\u84B8\u53D1\u6D53\u7F29\u7B49"));
		list.add(Component.literal("\u6216\u8BB8\u771F\u7684\u53EF\u4EE5\u5728\u91CC\u9762\u716E\u6CE1\u9762.jpg"));
	}
}
