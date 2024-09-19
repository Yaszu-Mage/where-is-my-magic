package yaszu.whereismymagic.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import yaszu.whereismymagic.block.ModBlocks;
import yaszu.whereismymagic.item.ModItems;

import java.util.function.Supplier;

public enum ModArmor implements ArmorMaterial {
    Crack("crack",555,5,26, SoundEvents.BLOCK_ANVIL_LAND, Ingredient.ofItems(ModItems.CRACK),2,2),
    Marble("marble", 455,4,26,SoundEvents.BLOCK_STONE_BREAK,Ingredient.ofItems(ModBlocks.MARBEL),0,0)
    ;
    private final String name;
    private final int durability;
    private final int protection;
    private final int enchant;
    private final SoundEvent sound;
    private final Ingredient repairingredient;
    private final int toughness;
    private final int knockback;

    ModArmor(String name, int durability, int protection, int enchant, SoundEvent sound, Ingredient repairingredient, int toughness, int knockback) {
        this.name = name;
        this.durability = durability;
        this.protection = protection;
        this.enchant = enchant;
        this.sound = sound;
        this.repairingredient = repairingredient;
        this.toughness = toughness;
        this.knockback = knockback;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return durability;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protection;
    }

    @Override
    public int getEnchantability() {
        return enchant;
    }

    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairingredient;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
