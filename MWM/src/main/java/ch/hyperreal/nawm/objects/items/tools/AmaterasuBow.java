package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.init.SoundInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * @author Simon TObler
 * @version 26.06.2020
 */
public class AmaterasuBow extends BowItem {
    public AmaterasuBow() {
        super(new Item.Properties().maxDamage(8).group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), getAmaterasuSound(), SoundCategory.HOSTILE, 2.0F, 1.0F, true);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


    // muss sound noch fixen auch in resources
    public SoundEvent getAmaterasuSound() {
       return SoundInit.AMATERASU.get();

    }

}
