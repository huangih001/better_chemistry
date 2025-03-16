
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.restart_chemistry.world.inventory.Shiyantai6Menu;
import net.mcreator.restart_chemistry.world.inventory.Rongyandianjiechi3Menu;
import net.mcreator.restart_chemistry.world.inventory.Dianjiechi4Menu;
import net.mcreator.restart_chemistry.RestartChemistryMod;

public class RestartChemistryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RestartChemistryMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<Rongyandianjiechi3Menu>> RONGYANDIANJIECHI_3 = REGISTRY.register("rongyandianjiechi_3", () -> IMenuTypeExtension.create(Rongyandianjiechi3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Dianjiechi4Menu>> DIANJIECHI_4 = REGISTRY.register("dianjiechi_4", () -> IMenuTypeExtension.create(Dianjiechi4Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Shiyantai6Menu>> SHIYANTAI_6 = REGISTRY.register("shiyantai_6", () -> IMenuTypeExtension.create(Shiyantai6Menu::new));
}
