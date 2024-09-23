package yaszu.whereismymagic.mobs.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;

public class ModModelLayers {
    public static final EntityModelLayer RUG =
            new EntityModelLayer(new Identifier(WhereIsMyMagic.MOD_ID, "rug"), "main");
}
