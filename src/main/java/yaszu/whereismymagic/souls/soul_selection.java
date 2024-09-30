package yaszu.whereismymagic.souls;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import yaszu.whereismymagic.block.ModBlocks;
import yaszu.whereismymagic.item.ModItems;
import yaszu.whereismymagic.util.IEntityDataSaver;
import yaszu.whereismymagic.util.souldata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class soul_selection extends BaseOwoScreen<FlowLayout> {
    
    public ArrayList<Component> uichildren = new ArrayList<Component>();
    
    public PlayerEntity player = MinecraftClient.getInstance().player;

    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }
    public static Object soul_selection_swaptype(Component component, String soultypegui, Integer current){
        ArrayList<Component> children = new ArrayList<>();
        if (soultypegui.compareTo("Determination") == 0) {

         component = Containers.verticalFlow(Sizing.fill(50),Sizing.fill(50)).children(0,children);
         children.add(
                 Components.item(ModItems.CRACK.getDefaultStack())
         );
         children.add(
                 Components.textBox(Sizing.fill(10),"kys")
         );
        }


        return component;
    }
    @Override
    protected void build(FlowLayout rootComponent) {
        // TODO Fix UI bugs
        // TODO Figure out how to fix some buggy bugs
        rootComponent
                .surface(Surface.VANILLA_TRANSLUCENT)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .verticalAlignment(VerticalAlignment.CENTER);
        rootComponent.children(uichildren);}}