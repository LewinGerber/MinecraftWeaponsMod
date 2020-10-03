package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;

/**
 * @author Simon Tobler
 * @version 26.09.2020
 */
public class HalfSword extends SwordItem {
    public HalfSword() {
        super(ToolTier.AdventureTier.HALF_SWORD, 0, 0.0F, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        float healthBeg = target.getHealth();
        if(target.getHealth() <= 1.0F) {
            return super.hitEntity(stack, target, attacker);
        }
        target.setHealth(target.getHealth()/2);
        return super.hitEntity(stack, target, attacker);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return 0.0F;
    }
}
