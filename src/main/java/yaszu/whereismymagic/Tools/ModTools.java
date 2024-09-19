package yaszu.whereismymagic.Tools;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import yaszu.whereismymagic.block.ModBlocks;
import yaszu.whereismymagic.item.ModItems;

import java.util.function.Supplier;

public enum ModTools implements ToolMaterial {
    CRACK(MiningLevels.IRON,455,4.5f,3.5f,26, () -> Ingredient.ofItems(ModItems.CRACK)),
    MARBEL(MiningLevels.STONE,255,3.5f,3.5f,26, () -> Ingredient.ofItems(ModBlocks.MARBEL)),
    HUMAN(MiningLevels.STONE,1000,10.5f,1.0f,32, () -> Ingredient.ofItems(ModItems.HUMAN_FLESH)),
    VOID(MiningLevels.NETHERITE, 1987, 10.5f,8.0f,28,() -> Ingredient.ofItems(ModItems.VOID_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModTools(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
