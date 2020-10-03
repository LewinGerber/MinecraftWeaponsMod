package ch.hyperreal.nawm.objects.items.misc;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;

import java.util.Date;

/**
 * @author Lewin Gerber
 * @version 02.10.2020
 * MWM
 */
public class HealthPack extends Item {

    public HealthPack() {
        super(new Properties().maxDamage(1).group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.clearActivePotions();
        playerIn.setHealth(playerIn.getHealth() + 10.0F);
        playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 75));
        playerIn.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100));
        playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100));
        worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.VOICE, 2.0F, 1.0F, true);
        playerIn.getHeldItem(handIn).damageItem(1, playerIn, (entity) -> entity.sendBreakAnimation(handIn));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
