
package net.mcreator.restart_chemistry.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class JiuJingDengItem extends Item {
	public JiuJingDengItem() {
		super(new Item.Properties().durability(30).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u9152\u7CBE\u706F-\u70B9\u71C3\u8DDF\u52A0\u70ED\u64CD\u4F5C\u7684\u597D\u5E2E\u624B"));
		list.add(Component.literal("\u4E0D\u8981\u8BD5\u56FE\u7528\u9152\u7CBE\u706F\u70B9\u71C3\u53E6\u4E00\u4E2A\u9152\u7CBE\u706F"));
	}
}
