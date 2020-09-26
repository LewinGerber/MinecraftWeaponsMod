package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
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
        super(ToolTier.AdventureTier.ADVENTURE, doDamage(), 3.0F, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
    public static int doDamage(){
       // LivingEntity livingEntity = livingEntity.getCreatureAttribute();
       // return (int)livingEntity.getHealth()/2;
    }
}
