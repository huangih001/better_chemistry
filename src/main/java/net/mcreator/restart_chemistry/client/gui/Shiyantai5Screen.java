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

import net.mcreator.restart_chemistry.world.inventory.Shiyantai5Menu;
import net.mcreator.restart_chemistry.network.Shiyantai5ButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Shiyantai5Screen extends AbstractContainerScreen<Shiyantai5Menu> {
	private final static HashMap<String, Object> guistate = Shiyantai5Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kai_shi_shi_yan;

	public Shiyantai5Screen(Shiyantai5Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 216;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("restart_chemistry:textures/screens/shiyantai_5.png");

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

		guiGraphics.blit(ResourceLocation.parse("restart_chemistry:textures/screens/3a62c8ac09e8932c7b180c8b24ebd55f.png"), this.leftPos + -10, this.topPos + -25, 0, 0, 230, 219, 230, 219);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.restart_chemistry.shiyantai_5.label_hua_xue_shi_yan_tai"), 90, -11, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_kai_shi_shi_yan = Button.builder(Component.translatable("gui.restart_chemistry.shiyantai_5.button_kai_shi_shi_yan"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new Shiyantai5ButtonMessage(0, x, y, z));
				Shiyantai5ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 151, this.topPos + 82, 46, 20).build();
		guistate.put("button:button_kai_shi_shi_yan", button_kai_shi_shi_yan);
		this.addRenderableWidget(button_kai_shi_shi_yan);
	}
}
