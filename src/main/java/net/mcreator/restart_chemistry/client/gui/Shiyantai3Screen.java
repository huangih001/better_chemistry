package net.mcreator.restart_chemistry.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.restart_chemistry.world.inventory.Shiyantai3Menu;
import net.mcreator.restart_chemistry.network.Shiyantai3ButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Shiyantai3Screen extends AbstractContainerScreen<Shiyantai3Menu> {
	private final static HashMap<String, Object> guistate = Shiyantai3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kai_shi_shi_yan;

	public Shiyantai3Screen(Shiyantai3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 197;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("restart_chemistry:textures/screens/shiyantai_3.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.restart_chemistry.shiyantai_3.label_hua_xue_shi_yan_tai"), 131, 22, -16737895, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.restart_chemistry.shiyantai_3.label_fan_ying_tiao_jian"), 131, 67, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_kai_shi_shi_yan = Button.builder(Component.translatable("gui.restart_chemistry.shiyantai_3.button_kai_shi_shi_yan"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new Shiyantai3ButtonMessage(0, x, y, z));
				Shiyantai3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 176, this.topPos + 76, 46, 20).build();
		guistate.put("button:button_kai_shi_shi_yan", button_kai_shi_shi_yan);
		this.addRenderableWidget(button_kai_shi_shi_yan);
	}
}
