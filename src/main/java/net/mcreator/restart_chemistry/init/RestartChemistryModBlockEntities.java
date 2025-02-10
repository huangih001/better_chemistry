
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.restart_chemistry.block.entity.ShiyanTaiBlockEntity;
import net.mcreator.restart_chemistry.block.entity.Nafire1BlockEntity;
import net.mcreator.restart_chemistry.RestartChemistryMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RestartChemistryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RestartChemistryMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SHIYAN_TAI = register("shiyan_tai", RestartChemistryModBlocks.SHIYAN_TAI, ShiyanTaiBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> NAFIRE_1 = register("nafire_1", RestartChemistryModBlocks.NAFIRE_1, Nafire1BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SHIYAN_TAI.get(), (blockEntity, side) -> ((ShiyanTaiBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NAFIRE_1.get(), (blockEntity, side) -> ((Nafire1BlockEntity) blockEntity).getItemHandler());
	}
}
