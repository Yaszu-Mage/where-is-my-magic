package yaszu.whereismymagic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.debug.DebugRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import yaszu.whereismymagic.mobs.ModEntities;
import yaszu.whereismymagic.mobs.client.ModModelLayers;
import yaszu.whereismymagic.mobs.client.Rug;
import yaszu.whereismymagic.mobs.client.RugRenderer;
import yaszu.whereismymagic.mobs.custom.RugEntity;

public class WhereIsMyMagicClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RUG, Rug::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.RUG, (context) -> {
            return new RugRenderer(context);
        });
    }
}
