package yaszu.whereismymagic.util;

import net.minecraft.nbt.NbtCompound;

public class souldata {
    public static String addSoulData(IEntityDataSaver player, String soultype) {
        NbtCompound nbt = player.getPersistentData();
        String soul = soultype;
        nbt.putString("soul", soul);
        return soul;
    }
    public static String readSoulData(IEntityDataSaver player){
        NbtCompound nbt = player.getPersistentData();
        String soul = nbt.getString("soul");
        return soul;
    }



}