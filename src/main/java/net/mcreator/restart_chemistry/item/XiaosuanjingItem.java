
package net.mcreator.restart_chemistry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.restart_chemistry.init.RestartChemistryModFluids;

public class XiaosuanjingItem extends BucketItem {
	public XiaosuanjingItem() {
		super(RestartChemistryModFluids.XIAOSUANJING.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
