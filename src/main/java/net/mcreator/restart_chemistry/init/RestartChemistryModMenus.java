
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.world.inventory.Shiyantai5Menu;
import net.mcreator.restart_chemistry.world.inventory.Shiyantai3Menu;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RestartChemistryMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<Shiyantai3Menu>> SHIYANTAI_3 = REGISTRY.register("shiyantai_3", () -> IMenuTypeExtension.create(Shiyantai3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Shiyantai5Menu>> SHIYANTAI_5 = REGISTRY.register("shiyantai_5", () -> IMenuTypeExtension.create(Shiyantai5Menu::new));
}
