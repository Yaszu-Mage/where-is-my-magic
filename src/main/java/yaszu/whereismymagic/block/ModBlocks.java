package yaszu.whereismymagic.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;

public class ModBlocks {

    public static final Block CRACK_BLOCK = registerBlock("crack_block",
            new Block(FabricBlockSettings.copy(Blocks.HAY_BLOCK)));
    public static final Block RAW_CRACK = registerBlock("raw_crack_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_ORE)));
    public static void registerModBlocks() {
        WhereIsMyMagic.LOGGER.info("Registering Modblocks for " + WhereIsMyMagic.MOD_ID);
    }

   private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WhereIsMyMagic.MOD_ID, name), block);
   }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WhereIsMyMagic.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }
}
