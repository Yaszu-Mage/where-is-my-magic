package yaszu.whereismymagic.souls;

import com.eliotlash.mclib.math.functions.classic.Mod;
import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.BoxComponent;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.component.EntityComponent;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import io.wispforest.owo.util.pond.OwoEntityRenderDispatcherExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
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
    public ArrayList<String> soulcyclearray = new ArrayList<>();
    public ArrayList<Component> uichildren = new ArrayList<Component>();
    public ArrayList<Component> currentui = new ArrayList<>();
    public PlayerEntity player = MinecraftClient.getInstance().player;
    public String currentsoul = "Perseverance";
    public boolean addedsouls = false;

    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        swapcurrent(currentui,"Perseverance");
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
    public void soulcycle(ArrayList soulcyclearray, String currentsoul, boolean next){
        int indexofsouls = 0;
        for (int x = 1; soulcyclearray.size() == x; x++) {
            if (soulcyclearray.get(x) == currentsoul){
                indexofsouls = x;
                break;
            }else{
                continue;
            }}
        String nextsoul;
        if (next) {
            nextsoul = getnextsoul(soulcyclearray,currentsoul,indexofsouls);
        }else{
            nextsoul = getprevsoul(soulcyclearray, currentsoul, indexofsouls);
        }
        swapcurrent(soulcyclearray,nextsoul);
    }
    public String getprevsoul(ArrayList soulcyclearray, String currentsoul,Integer indexofsouls){
        if (soulcyclearray.get(indexofsouls - 1) == null){
            return soulcyclearray.get(soulcyclearray.size()).toString();
        }else{
            return soulcyclearray.get(indexofsouls - 1).toString();
        }
    }
    public String getnextsoul(ArrayList soulcyclearray, String currentsoul,Integer indexofsouls){
        if (soulcyclearray.get(indexofsouls + 1) == null){
            return soulcyclearray.get(0).toString();
        }else{
            return soulcyclearray.get(indexofsouls + 1).toString();
        }
    }

    public void soulcycleadd(ArrayList soulcyclearray) {
        if (!addedsouls) {
            soulcyclearray.add(
                    "Perseverance"
            );
            soulcyclearray.add(
                    "Justice"
            );
            soulcyclearray.add(
                    "Bravery"
            );
            soulcyclearray.add(
                    "Kindness"
            );
            soulcyclearray.add(
                    "Patience"
            );
            soulcyclearray.add(
                    "Integrity"
            );
            soulcyclearray.add(
                    "Monster"
            );
            addedsouls = true;
        }}
    public void swapcurrent(ArrayList<Component> currentui,String soultype){
        if (soultype != null) {
            currentui.clear();
            if (soultype.equals("Perseverance")) {
                ItemStack chest = this.player.getEquippedStack(EquipmentSlot.CHEST);
                ItemStack chest2 = chest;
                this.player.getInventory().getArmorStack(1).setCount(0);
                this.player.equipStack(EquipmentSlot.CHEST,ModItems.CRACK.getDefaultStack());
                currentui.add(
                        Components.textBox(
                                Sizing.fill(25),
                                "Perseverance"
                        )
                );
                currentui.add(
                        Components.textBox(
                                Sizing.fill(5),
                                "Doing Something Despite Diffuculty or delay in achieving success"
                        )
                );

                currentui.add(
                        Components.entity(
                                Sizing.fill(25),
                                this.player.getInventory().player
                                ).showNametag(false)
                );

            }else{
                currentui.add(
                        Components.textBox(
                                Sizing.fill(25),
                                "Perseverance"
                        )
                );
                currentui.add(
                        Components.textBox(
                                Sizing.fill(5),
                                "Doing Something Despite Diffuculty or delay in achieving success"
                        )
                );
            }
        }
    }
    @Override
    protected void build(FlowLayout rootComponent) {
        // TODO Fix UI bugs
        // TODO Figure out how to fix some buggy bugs
        // TODO UI ARRAY CREATION
        soulcycleadd(soulcyclearray);
        rootComponent
                .surface(Surface.VANILLA_TRANSLUCENT)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .verticalAlignment(VerticalAlignment.CENTER);
        rootComponent.child(
                Components.button(
                        Text.literal("<"),
                        button -> soulcycle(soulcyclearray,currentsoul,false)
                )
        );
        rootComponent.child(
                Components.box(
                        Sizing.content(),
                        Sizing.content()
                )
                        .color(Color.BLACK)
                        .fill(true)
                        .direction(BoxComponent.GradientDirection.TOP_TO_BOTTOM)
                        .startColor(Color.RED)
                        .endColor(Color.BLACK)


        ).children(uichildren);
        rootComponent.child(
                Components.button(
                        Text.literal(">"),
                        button -> soulcycle(soulcyclearray,currentsoul,true)
                ));}}