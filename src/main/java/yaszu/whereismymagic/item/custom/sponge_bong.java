package yaszu.whereismymagic.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import yaszu.whereismymagic.item.ModItems;

public class sponge_bong extends Item {
    public sponge_bong(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,50,1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 50,1));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,50,1));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 50,1));
        if (stack.isOf(ModItems.SPONGE_BONG_ACTIVE)) {
            if (stack.isOf(ModItems.SPONGE_BONG_ACTIVE)) {
                stack.setCount(0);
                user.giveItemStack(ModItems.SPONGE_BONG.getDefaultStack());
            }
            return ActionResult.SUCCESS;
        }else{
            return ActionResult.FAIL;
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().getBlockState(context.getBlockPos()).isOf(Blocks.AIR)) {
            context.getPlayer().addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,50,1));
            context.getPlayer().addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 50,1));
            if (context.getStack().isOf(ModItems.SPONGE_BONG_ACTIVE)) {
                context.getStack().setCount(0);
                context.getPlayer().giveItemStack(ModItems.SPONGE_BONG.getDefaultStack());
            }
            return ActionResult.SUCCESS;

        }else{
            return ActionResult.PASS;
        }

    }
}
