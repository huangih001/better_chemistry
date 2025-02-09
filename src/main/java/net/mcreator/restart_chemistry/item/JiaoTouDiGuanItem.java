
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class JiaoTouDiGuanItem extends Item {
	public JiaoTouDiGuanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u80F6\u5934\u6EF4\u7BA1\u2014\u2014\u662F\u7528\u4E8E\u5438\u53D6\u6216\u6EF4\u52A0\u5C11\u91CF\u6DB2\u4F53\u8BD5\u5242\u7684\u4E00\u79CD\u4EEA\u5668"));
	}
}
