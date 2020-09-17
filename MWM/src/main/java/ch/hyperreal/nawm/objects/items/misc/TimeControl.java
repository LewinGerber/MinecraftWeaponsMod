package ch.hyperreal.nawm.objects.items.misc;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
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

        if (worldIn.getGameTime() < 12000) {
            worldIn.setGameTime(13000);
        } else {
            worldIn.setGameTime(1000);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
