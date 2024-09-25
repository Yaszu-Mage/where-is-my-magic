package yaszu.whereismymagic.souls;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import yaszu.whereismymagic.util.IEntityDataSaver;
import yaszu.whereismymagic.util.souldata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class soul_selection extends BaseOwoScreen<FlowLayout> {
    
   
    public ArrayList<Component> children = new ArrayList<Component>();
    
    public PlayerEntity player = this.client.player;
    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }

    @Override
    protected void build(FlowLayout rootComponent) {
        children.add(Components.button(
                Text.literal("Determination"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Patience"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Bravery"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Justice"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Perseverance"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Kindness"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.button(
                Text.literal("Monster"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        children.add(Components.textArea(
                Sizing.content(),
                Sizing.content(),
                "WARNING CHOOSING SOUL-LESS WILL MAKE YOU UNABLE TO USE MAGIC"
                ));

        children.add(Components.button(
                Text.literal("Soul-less"),
                button -> yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),"determination")
        ));
        // TODO make UI shit
        
        rootComponent
                .surface(Surface.VANILLA_TRANSLUCENT)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .verticalAlignment(VerticalAlignment.CENTER);
        rootComponent.child(
                Containers.verticalFlow(Sizing.content(),Sizing.content())
                        .child(Components.textArea(Sizing.content(),Sizing.content()))
                        .children(1, children)
                                
                
                        
                        );
                    
                        
                

        

        rootComponent.child(
                Components.textArea(Sizing.fill(25),Sizing.fill(25),"Soul Selection")
        );
    }




}
