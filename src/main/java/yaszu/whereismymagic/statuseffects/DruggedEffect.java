package yaszu.whereismymagic.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class DruggedEffect extends StatusEffect {
 protected DruggedEffect() {
     super(StatusEffectCategory.HARMFUL, 0xe9b8b3);
 }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean isInstant() {
        return super.isInstant();
    }

    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {

    }
}
