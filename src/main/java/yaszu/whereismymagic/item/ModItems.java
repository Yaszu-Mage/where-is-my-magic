package yaszu.whereismymagic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;

public class ModItems {

    public static final Item MANA_DUST = registerItem("mana_dust", new Item(new FabricItemSettings().food((FoodComponents.SUSPICIOUS_STEW))));
    public static final Item CRACK = registerItem("crack", new Item(new FabricItemSettings().food((FoodComponents.SUSPICIOUS_STEW))));
    public static final Item SPONGE_BONG = registerItem("sponge_bong", new Item(new FabricItemSettings()));
    public static final Item BLEACH = registerItem("bleach", new Item(new FabricItemSettings().food((FoodComponents.POISONOUS_POTATO))));
    public static final Item RAW_CRACK = registerItem("raw_crack", new Item(new FabricItemSettings()));

    private static void addItemstoIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(MANA_DUST);
        entries.add(CRACK);
        entries.add(SPONGE_BONG);
        entries.add(BLEACH);
        entries.add(RAW_CRACK);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WhereIsMyMagic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WhereIsMyMagic.LOGGER.info("Registering Mod Items for " + WhereIsMyMagic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemstoIngredientTabItemGroup);
    }
}
