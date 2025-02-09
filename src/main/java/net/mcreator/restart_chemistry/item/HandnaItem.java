
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
		list.add(Component.translatable("item.restart_chemistry.handna.description_0"));
		list.add(Component.translatable("item.restart_chemistry.handna.description_1"));
		list.add(Component.translatable("item.restart_chemistry.handna.description_2"));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		HandnaDangWanJiaDiuQiWuPinShiProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
