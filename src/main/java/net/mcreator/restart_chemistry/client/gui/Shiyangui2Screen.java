package net.mcreator.restart_chemistry.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.restart_chemistry.world.inventory.Shiyangui2Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Shiyangui2Screen extends AbstractContainerScreen<Shiyangui2Menu> {
	private final static HashMap<String, Object> guistate = Shiyangui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_qu_xiao_gou_jian;

	public Shiyangui2Screen(Shiyangui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 230;
		this.imageHeight = 216;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("restart_chemistry:textures/screens/shiyangui_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("restart_chemistry:textures/screens/gui2.png"), this.leftPos + 0, this.topPos + -5, 0, 0, 230, 134, 230, 134);

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
	}

	@Override
	public void init() {
		super.init();
		button_qu_xiao_gou_jian = Button.builder(Component.translatable("gui.restart_chemistry.shiyangui_2.button_qu_xiao_gou_jian"), e -> {
		}).bounds(this.leftPos + 177, this.topPos + 132, 46, 20).build();
		guistate.put("button:button_qu_xiao_gou_jian", button_qu_xiao_gou_jian);
		this.addRenderableWidget(button_qu_xiao_gou_jian);
	}
}
