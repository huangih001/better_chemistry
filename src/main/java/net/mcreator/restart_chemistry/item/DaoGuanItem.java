
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DaoGuanItem extends Item {
	public DaoGuanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u73BB\u7483\u5BFC\u7BA1-\u8FDE\u63A5\u53CD\u5E94\u88C5\u7F6E\u7684\u597D\u4E1C\u897F"));
		list.add(Component.literal("\u5F88\u8106\u5F31\uFF0C\u5BF9\u5F85\u5B83\u5E94\u8BE5\u50CF\u5BF9\u5F85\u521D\u604B\u4E00\u6837\u5C0F\u5FC3"));
	}
}
