package yaszu.whereismymagic.item;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;
import yaszu.whereismymagic.WhereIsMyMagic;
import yaszu.whereismymagic.geo.orca;

public class AnimatedItemModel extends GeoModel<yaszu.whereismymagic.geo.orca> {

    @Override
    public Identifier getModelResource(orca animatable) {
        return new Identifier(WhereIsMyMagic.MOD_ID, "geo/orca.geo.json");
    }

    @Override
    public Identifier getTextureResource(orca animatable) {
        return new Identifier(WhereIsMyMagic.MOD_ID, "textures/geo/orca.png");
    }

    @Override
    public Identifier getAnimationResource(orca animatable) {
        return null;
    }
}
