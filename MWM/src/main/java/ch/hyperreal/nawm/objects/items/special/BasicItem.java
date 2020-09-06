package ch.hyperreal.nawm.objects.items.special;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.init.SoundInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 14.06.2020
 * newEdition
 */
public class BasicItem extends Item {
    public BasicItem() {
        //Hello World 2.0
        super(new Item.Properties().maxDamage(25).group(MinecraftWeaponsMod.WeaponItemGroup.instance));

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.jump();
        playerIn.getHeldItem(handIn).damageItem(1, playerIn, (entity) -> entity.sendBreakAnimation(handIn));
        //sound
        worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), getFlySound(), SoundCategory.HOSTILE, 2.0F, 1.0F, true);
        //particles
        for(int i = 0; i < 100; i++){
            worldIn.addParticle(ParticleTypes.DRIPPING_LAVA, playerIn.getPosX()+0.5, playerIn.getPosY()+1, playerIn.getPosZ(),10,-15,0);
            worldIn.addParticle(ParticleTypes.DRIPPING_LAVA, playerIn.getPosX(), playerIn.getPosY()+1, playerIn.getPosZ(),10,-15,0);
            worldIn.addParticle(ParticleTypes.DRIPPING_LAVA, playerIn.getPosX(), playerIn.getPosY()+1, playerIn.getPosZ()+0.5,10,-15,0);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public SoundEvent getFlySound() {
        return SoundInit.FLY.get();
    }
}
