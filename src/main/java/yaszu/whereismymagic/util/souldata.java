package yaszu.whereismymagic.util;

import net.minecraft.nbt.NbtCompound;

public class souldata {
    public static String addSoulData(IEntityDataSaver player, String soultype) {
        NbtCompound nbt = player.getPersistentData();
        String soul = soultype;
        nbt.putString("soul", soul);
        return soul;
    }



}