package yaszu.whereismymagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;
import yaszu.whereismymagic.WhereIsMyMagic;
import yaszu.whereismymagic.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MAGIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WhereIsMyMagic.MOD_ID, "magic"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.where-is-my-magic.magic"))
                    .icon(() -> new ItemStack(ModItems.CRACK)).entries((displayContext, entries) ->  {
                    entries.add(ModItems.CRACK);
                    entries.add(ModItems.BLEACH);
                    entries.add(ModItems.MANA_DUST);
                    entries.add(ModItems.SPONGE_BONG);
                    entries.add(ModBlocks.RAW_CRACK);
                    entries.add(ModBlocks.CRACK_BLOCK);
                    entries.add(ModItems.WINDEX);
                    entries.add(ModItems.CRACK_PICKAXE);
                    entries.add(ModBlocks.MARBEL);
                    entries.add(ModBlocks.POLISHED_MARBEL);
                    entries.add(ModItems.METAL_DETECTOR);
                    entries.add(ModItems.CRACK_STAFF);
                    entries.add(ModItems.CRACK_HELMET);
                    entries.add(ModItems.ESTROGEN);
                    entries.add(ModItems.DETERMINATIONGLOVE);
                    entries.add(ModItems.PAITIENCEAGLET);

                    }).build());


    public static void registerItemGroups() {
        WhereIsMyMagic.LOGGER.info("Reigstering Item Groups for " + WhereIsMyMagic.MOD_ID);
    }

}
