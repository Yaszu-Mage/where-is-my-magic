package yaszu.whereismymagic.mobs.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;
import yaszu.whereismymagic.mobs.custom.RugEntity;

public class RugRenderer extends MobEntityRenderer<RugEntity,Rug<RugEntity>> {
    private static final Identifier TEXTURE = new Identifier(WhereIsMyMagic.MOD_ID, "textures/entity/rug.png");
    public RugRenderer(EntityRendererFactory.Context context, Rug<RugEntity> entityModel, float f) {
        super(context, new Rug(context.getPart(ModModelLayers.RUG)), 0.6f);
    }

    public RugRenderer(EntityRendererFactory.Context context) {
        super(context,new Rug(context.getPart(ModModelLayers.RUG)),0.6f);
    }

    @Override
    public Identifier getTexture(RugEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RugEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);

        }else{
            matrixStack.scale(1f,1f,1f);
        }
        super.render(mobEntity, f,g, matrixStack,vertexConsumerProvider,i);
    }
}
