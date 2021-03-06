package ch.hyperreal.nawm.objects.items.misc;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.init.SoundInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * @author : Elias Mehran
 * @version : 17.09.2020
 **/

public class TimeControl extends Item {
    public TimeControl() {
        super(new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), getTimeSound(), SoundCategory.VOICE, 2.0F, 1.0F, true);

        if (worldIn.getDayTime() < 12750) {
            worldIn.setDayTime(13500);
        } else {
            worldIn.setDayTime(1000);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public SoundEvent getTimeSound() {
        return SoundInit.TIME.get();
    }
}
