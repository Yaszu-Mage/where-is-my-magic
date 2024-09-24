package yaszu.whereismymagic;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yaszu.whereismymagic.block.ModBlocks;
import yaszu.whereismymagic.item.ModItemGroups;
import yaszu.whereismymagic.item.ModItems;
import yaszu.whereismymagic.mobs.ModEntities;
import yaszu.whereismymagic.mobs.client.ModModelLayers;
import yaszu.whereismymagic.mobs.client.Rug;
import yaszu.whereismymagic.mobs.client.RugRenderer;
import yaszu.whereismymagic.mobs.custom.RugEntity;

public class WhereIsMyMagic implements ModInitializer {
	public static final String MOD_ID = "where-is-my-magic";
	public static final Identifier SOUL_TYPE = new Identifier(MOD_ID,"soul_type");
	private Integer Soultypeint = 0;
	// 0 = Soulless, 1 = Determination, 2=Paitience, 3=Animosity
	// 4 = Monster, 5 = Justice, 6 = Bravery, 7 = Integrity
	// 8 = Perserverence, 9 = Kindness
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		FabricDefaultAttributeRegistry.register(ModEntities.RUG, RugEntity.createRugAttributes());
		EntityRendererRegistry.register(ModEntities.RUG,RugRenderer::new);



	}

}