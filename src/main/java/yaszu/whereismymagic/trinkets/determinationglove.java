package yaszu.whereismymagic.trinkets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.UUID;

import static org.apache.commons.lang3.BooleanUtils.and;

public class determinationglove extends TrinketItem {

    public determinationglove(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute,EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack,slot,entity,uuid);
        if (entity.isDead() & entity instanceof PlayerEntity ) {
            ((PlayerEntity) entity).getItemCooldownManager().set(this,1000);
            if (!((PlayerEntity) entity).getItemCooldownManager().isCoolingDown(this)) {
                entity.setHealth(5.0f);
                entity.clearStatusEffects();
                entity.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.REGENERATION, 900, 1));
                entity.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.ABSORPTION, 100, 1
                ));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,800, 0));
                entity.getWorld().sendEntityStatus(entity, (byte)35);
                if (entity instanceof PlayerEntity) {
                    ((PlayerEntity) entity).getItemCooldownManager().set(this,1000);
                }
            }
        }

        return modifiers;
    }
}