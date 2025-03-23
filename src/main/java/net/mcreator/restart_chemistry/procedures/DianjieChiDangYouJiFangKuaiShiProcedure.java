package net.mcreator.restart_chemistry.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.restart_chemistry.init.RestartChemistryModItems;

import java.util.function.Supplier;
import java.util.Map;

public class DianjieChiDangYouJiFangKuaiShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGJIAN.get()), new ItemStack(Items.IRON_SWORD));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJNGCHAN.get()), new ItemStack(Items.IRON_SHOVEL));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGFU.get()), new ItemStack(Items.IRON_AXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGCHU.get()), new ItemStack(Items.IRON_HOE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGGAO.get()), new ItemStack(Items.IRON_PICKAXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.JINGTIEJIA_HELMET.get()), new ItemStack(Items.IRON_HELMET));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.JINGTIEJIA_CHESTPLATE.get()), new ItemStack(Items.IRON_CHESTPLATE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.JINGTIEJIA_LEGGINGS.get()), new ItemStack(Items.IRON_LEGGINGS));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.JINGTIEJIA_BOOTS.get()), new ItemStack(Items.IRON_BOOTS));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANJIA_HELMET.get()), new ItemStack(Items.DIAMOND_HELMET));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANJIA_CHESTPLATE.get()), new ItemStack(Items.DIAMOND_CHESTPLATE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANJIA_LEGGINGS.get()), new ItemStack(Items.DIAMOND_LEGGINGS));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANJIA_BOOTS.get()), new ItemStack(Items.DIAMOND_BOOTS));
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == RestartChemistryModItems.LVHUANA_BUCKET
				.get() && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == RestartChemistryModItems.FUDADIANDUI
						.get()) {
			if (entity instanceof Player _player && _player.level() instanceof ServerLevel _serverLevel && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack stack = ((Slot) _slots.get(3)).getItem();
				if (stack != null) {
					stack.hurtAndBreak(2, _serverLevel, null, _stkprov -> {
					});
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(RestartChemistryModItems.QINGYANGHUANA_BUCKET.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANJIAN.get()), new ItemStack(Items.DIAMOND_SWORD));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANQIU.get()), new ItemStack(Items.DIAMOND_SHOVEL));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANGAO.get()), new ItemStack(Items.DIAMOND_PICKAXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANFU.get()), new ItemStack(Items.DIAMOND_AXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGZUANCHU.get()), new ItemStack(Items.DIAMOND_HOE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGJIAN.get()), new ItemStack(Items.NETHERITE_SWORD));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGQIU.get()), new ItemStack(Items.NETHERITE_SHOVEL));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGGAO.get()), new ItemStack(Items.NETHERITE_PICKAXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGFU.get()), new ItemStack(Items.NETHERITE_AXE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGCHU.get()), new ItemStack(Items.NETHERITE_HOE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGJIA_HELMET.get()), new ItemStack(Items.NETHERITE_HELMET));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGJIA_CHESTPLATE.get()), new ItemStack(Items.NETHERITE_CHESTPLATE));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGJIA_LEGGINGS.get()), new ItemStack(Items.NETHERITE_LEGGINGS));
		DianjiepeifangProcedure.execute(entity, new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.XIAOSUANJING_BUCKET.get()), new ItemStack(RestartChemistryModItems.FUDADIANDUI.get()),
				new ItemStack(Items.GOLD_INGOT), new ItemStack(RestartChemistryModItems.DUJINGHEJINGJIA_BOOTS.get()), new ItemStack(Items.NETHERITE_BOOTS));
	}
}
