
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.restart_chemistry.client.gui.Shiyantai6Screen;
import net.mcreator.restart_chemistry.client.gui.Shiyangui4Screen;
import net.mcreator.restart_chemistry.client.gui.Shiyangui3Screen;
import net.mcreator.restart_chemistry.client.gui.Shiyangui2Screen;
import net.mcreator.restart_chemistry.client.gui.Shiyangui1Screen;
import net.mcreator.restart_chemistry.client.gui.Rongyandianjiechi3Screen;
import net.mcreator.restart_chemistry.client.gui.Dianjiechi4Screen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RestartChemistryModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RestartChemistryModMenus.RONGYANDIANJIECHI_3.get(), Rongyandianjiechi3Screen::new);
		event.register(RestartChemistryModMenus.DIANJIECHI_4.get(), Dianjiechi4Screen::new);
		event.register(RestartChemistryModMenus.SHIYANTAI_6.get(), Shiyantai6Screen::new);
		event.register(RestartChemistryModMenus.SHIYANGUI_1.get(), Shiyangui1Screen::new);
		event.register(RestartChemistryModMenus.SHIYANGUI_2.get(), Shiyangui2Screen::new);
		event.register(RestartChemistryModMenus.SHIYANGUI_3.get(), Shiyangui3Screen::new);
		event.register(RestartChemistryModMenus.SHIYANGUI_4.get(), Shiyangui4Screen::new);
	}
}
