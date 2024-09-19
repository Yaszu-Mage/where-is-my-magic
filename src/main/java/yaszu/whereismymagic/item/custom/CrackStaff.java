package yaszu.whereismymagic.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import yaszu.whereismymagic.item.ModItems;

public class CrackStaff extends Item {
    public CrackStaff(Settings settings) {
        super(settings);
    }



    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        user.addCritParticles(entity);
        entity.eatFood(entity.getWorld(), ModItems.CRACK.getDefaultStack());
        entity.disablesShield();

        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,120,5));
       entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 120,5));
       entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 120,2));
       stack.damage(1,user,playerEntity -> user.sendToolBreakStatus(user.getActiveHand()));
        return ActionResult.SUCCESS;
    }
}
