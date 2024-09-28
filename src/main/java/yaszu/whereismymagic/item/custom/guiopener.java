package yaszu.whereismymagic.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yaszu.whereismymagic.souls.soul_selection;

import static yaszu.whereismymagic.WhereIsMyMagic.MOD_ID;

public class guiopener extends Item{
    public guiopener(Item.Settings settings){
        super(settings);
    }
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        MinecraftClient.getInstance().setScreen(
                new soul_selection()
        );
        return ActionResult.SUCCESS;
    }
}
