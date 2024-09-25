package yaszu.whereismymagic.souls;

import net.minecraft.entity.player.PlayerEntity;
import yaszu.whereismymagic.util.IEntityDataSaver;

public class soulselectmethod {
    public void soulchoose(PlayerEntity player,String soul ){
        yaszu.whereismymagic.util.souldata.addSoulData(((IEntityDataSaver) player),soul);
    }
}
