package net.mcreator.restart_chemistry.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.restart_chemistry.world.inventory.Shiyangui4Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Shiyangui4Screen extends AbstractContainerScreen<Shiyangui4Menu> {
	private final static HashMap<String, Object> guistate = Shiyangui4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_ke_yi_gou_jian;
	ImageButton imagebutton_wu_fa_gou_jian;
	ImageButton imagebutton_ke_yi_gou_jian1;
	ImageButton imagebutton_wu_fa_gou_jian1;
	ImageButton imagebutton_ke_yi_gou_jian2;
	ImageButton imagebutton_wu_fa_gou_jian2;

	public Shiyangui4Screen(Shiyangui4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 230;
		this.imageHeight = 212;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("restart_chemistry:textures/screens/shiyangui_4.png");

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

		guiGraphics.blit(ResourceLocation.parse("restart_chemistry:textures/screens/gui4.png"), this.leftPos + 0, this.topPos + -7, 0, 0, 230, 134, 230, 134);

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
		imagebutton_ke_yi_gou_jian = new ImageButton(this.leftPos + 67, this.topPos + 54, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ke_yi_gou_jian", imagebutton_ke_yi_gou_jian);
		this.addRenderableWidget(imagebutton_ke_yi_gou_jian);
		imagebutton_wu_fa_gou_jian = new ImageButton(this.leftPos + 66, this.topPos + 55, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wu_fa_gou_jian", imagebutton_wu_fa_gou_jian);
		this.addRenderableWidget(imagebutton_wu_fa_gou_jian);
		imagebutton_ke_yi_gou_jian1 = new ImageButton(this.leftPos + 108, this.topPos + 55, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ke_yi_gou_jian1", imagebutton_ke_yi_gou_jian1);
		this.addRenderableWidget(imagebutton_ke_yi_gou_jian1);
		imagebutton_wu_fa_gou_jian1 = new ImageButton(this.leftPos + 107, this.topPos + 54, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wu_fa_gou_jian1", imagebutton_wu_fa_gou_jian1);
		this.addRenderableWidget(imagebutton_wu_fa_gou_jian1);
		imagebutton_ke_yi_gou_jian2 = new ImageButton(this.leftPos + 149, this.topPos + 55, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/ke_yi_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ke_yi_gou_jian2", imagebutton_ke_yi_gou_jian2);
		this.addRenderableWidget(imagebutton_ke_yi_gou_jian2);
		imagebutton_wu_fa_gou_jian2 = new ImageButton(this.leftPos + 149, this.topPos + 55, 14, 14,
				new WidgetSprites(ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png"), ResourceLocation.parse("restart_chemistry:textures/screens/wu_fa_gou_jian_.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wu_fa_gou_jian2", imagebutton_wu_fa_gou_jian2);
		this.addRenderableWidget(imagebutton_wu_fa_gou_jian2);
	}
}
