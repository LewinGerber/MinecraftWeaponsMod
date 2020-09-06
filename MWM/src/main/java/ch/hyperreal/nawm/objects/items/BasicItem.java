package ch.hyperreal.nawm.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 14.06.2020
 * newEdition
 */
public class BasicItem extends Item {
    public BasicItem() {
        super(new Item.Properties().group(ItemGroup.MISC));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.jump();
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
