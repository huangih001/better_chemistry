package net.mcreator.restart_chemistry.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.restart_chemistry.init.RestartChemistryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FangkuaipandingProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.getBlock() == RestartChemistryModBlocks.SHIYAN_TAI.get()) {
			if (PlaceconflictProcedure.execute(world, x, y, z, 1, 0, 0, -1, 0, 0, entity.getYRot())) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		} else if (blockstate.getBlock() == RestartChemistryModBlocks.RONGYANDIANJIECHI.get()) {
			if (PlaceconflictProcedure.execute(world, x, y, z, -1, 1, 1, 1, 0, -1, entity.getYRot())) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		} else if (blockstate.getBlock() == RestartChemistryModBlocks.DIANJIE_CHI.get()) {
			if (PlaceconflictProcedure.execute(world, x, y, z, 1, 0, 0, 0, 0, 0, entity.getYRot())) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
	}
}
