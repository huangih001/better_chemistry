
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import net.mcreator.restart_chemistry.procedures.HandnaDangWanJiaDiuQiWuPinShiProcedure;

import java.util.List;

public class HandnaItem extends Item {
	public HandnaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u94A0\u5728\u5468\u671F\u8868\u4E2D\u4F4D\u4E8E\u7B2C3\u5468\u671F\u3001\u7B2C\u2160A\u65CF "));
		list.add(Component.literal("\u662F\u78B1\u91D1\u5C5E\u5143\u7D20\u7684\u4EE3\u8868\uFF0C\u8D28\u5730\u67D4\u8F6F"));
		list.add(Component.literal("\u6216\u8BB8\u9047\u6C34\u4F1A\u53D1\u751F\u4E9B\u53CD\u5E94..........."));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		HandnaDangWanJiaDiuQiWuPinShiProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
