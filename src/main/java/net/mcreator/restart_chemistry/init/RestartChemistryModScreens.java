
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.restart_chemistry.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.restart_chemistry.client.gui.Shiyantai5Screen;
import net.mcreator.restart_chemistry.client.gui.Shiyantai3Screen;
import net.mcreator.restart_chemistry.client.gui.Dianjiechi3Screen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RestartChemistryModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RestartChemistryModMenus.SHIYANTAI_3.get(), Shiyantai3Screen::new);
		event.register(RestartChemistryModMenus.SHIYANTAI_5.get(), Shiyantai5Screen::new);
		event.register(RestartChemistryModMenus.DIANJIECHI_3.get(), Dianjiechi3Screen::new);
	}
}
