 package yaszu.whereismymagic.item;

import software.bernie.geckolib.animatable.GeoItem;
import yaszu.whereismymagic.geo.orca;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.Tools.ModTools;
import yaszu.whereismymagic.WhereIsMyMagic;
import yaszu.whereismymagic.armor.ModArmor;
import yaszu.whereismymagic.item.custom.CrackStaff;
import yaszu.whereismymagic.item.custom.MetalDetectorItem;
import yaszu.whereismymagic.item.custom.guiopener;
import yaszu.whereismymagic.item.custom.sponge_bong;
import yaszu.whereismymagic.trinkets.determinationglove;
import yaszu.whereismymagic.trinkets.ducktape;
import yaszu.whereismymagic.trinkets.highlighter;
import yaszu.whereismymagic.trinkets.patienceaglet;

 public class ModItems {

    public static final Item MANA_DUST = registerItem("mana_dust", new Item(new FabricItemSettings().food((FoodComponents.SUSPICIOUS_STEW))));
    public static final Item CRACK = registerItem("crack", new Item(new FabricItemSettings().food((FoodComponents.SUSPICIOUS_STEW))));
    public static final Item SPONGE_BONG = registerItem("sponge_bong", new Item(new FabricItemSettings()));
     public static final Item SPONGE_BONG_ACTIVE = registerItem("sponge_bong_active", new sponge_bong(new FabricItemSettings()));
    public static final Item BLEACH = registerItem("bleach", new Item(new FabricItemSettings().food((FoodComponents.POISONOUS_POTATO))));
    public static final Item WINDEX = registerItem("windex", new Item(new FabricItemSettings().food(FoodComponents.HONEY_BOTTLE)));
    public static final Item ESTROGEN = registerItem("estrogen", new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_CARROT)));

    public static final Item CRACK_STAFF = registerItem("crack_staff", new CrackStaff(new FabricItemSettings().maxDamage(128)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(128)));
    public static final Item HUMAN_FLESH = registerItem("human_flesh", new Item(new FabricItemSettings().food(FoodComponents.BEEF)));
    public static final Item VOID_INGOT = registerItem("void_ingot", new Item(new FabricItemSettings()));
    public static final Item Cobalt = registerItem("cobalt", new Item(new FabricItemSettings()));


    public static final Item ORCA = registerItem("orca", new orca(new FabricItemSettings()));


    public static final Item PAITIENCEAGLET = registerItem("paitence_aglet", new patienceaglet(new FabricItemSettings()));
    public static final Item DETERMINATIONGLOVE = registerItem("determination_glove", new determinationglove(new FabricItemSettings()));
    public static final Item DUCKTAPE = registerItem("ducktape", new ducktape(new FabricItemSettings()));
    public static final Item HIGHLIGHTER = registerItem("highlighter", new highlighter(new FabricItemSettings()));


    public static final Item GUIOPENER = registerItem("guiopener", new guiopener(new FabricItemSettings()));
     public static final Item INZANITY = registerItem("inzanity", new Item(new FabricItemSettings()));
    public static final Item CRACK_HELMET = registerItem("crack_helmet", new ArmorItem(ModArmor.Crack,ArmorItem.Type.HELMET ,new Item.Settings()));
    public static final Item RUNITE = registerItem("runite", new Item(new FabricItemSettings()));
    public static final Item ARNICITE = registerItem("arnicite",new Item(new FabricItemSettings()));

    public static final Item CRACK_PICKAXE = registerItem("crack_pickaxe", new PickaxeItem(ModTools.CRACK, 2, 2f, new FabricItemSettings()));
    private static void addItemstoIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(MANA_DUST);
        entries.add(CRACK);
        entries.add(SPONGE_BONG);
        entries.add(BLEACH);
        entries.add(WINDEX);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WhereIsMyMagic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WhereIsMyMagic.LOGGER.info("Registering Mod Items for " + WhereIsMyMagic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemstoIngredientTabItemGroup);
    }
}
