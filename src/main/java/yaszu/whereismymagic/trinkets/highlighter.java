package yaszu.whereismymagic.trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class highlighter extends TrinketItem {
    public highlighter(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.isPlayer()) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 25, 2));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 25, 2));
        }
    }
}
