package ch.hyperreal.nawm.objects.items.special;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 19.06.2020
 * nAWM
 */

public class IceCastle extends Item {
    public IceCastle() {
        super(new Properties().maxDamage(10).group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.getHeldItem(handIn).damageItem(1, playerIn, (entity) -> entity.sendBreakAnimation(handIn));
        double posX = playerIn.getPosX();
        double posY = playerIn.getPosY();
        double posZ = playerIn.getPosZ();

        worldIn.setBlockState(new BlockPos(posX, posY,posZ), Blocks.WATER.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY-1,posZ), Blocks.PACKED_ICE.getDefaultState());

        //square shape
        worldIn.setBlockState(new BlockPos(posX+1, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ), Blocks.SNOW_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ-1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX+1, posY,posZ+1), Blocks.PODZOL.getDefaultState());
        //tree
        worldIn.setBlockState(new BlockPos(posX+1, posY+1,posZ+1), Blocks.SPRUCE_SAPLING.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX+1, posY,posZ-1), Blocks.SNOW_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ-1), Blocks.PACKED_ICE.getDefaultState());

        //outter cross
        worldIn.setBlockState(new BlockPos(posX+2, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        //tall icicle 1
        worldIn.setBlockState(new BlockPos(posX+2, posY+1,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX+2, posY+2,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ+2), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ-2), Blocks.PODZOL.getDefaultState());
        //tree
        worldIn.setBlockState(new BlockPos(posX, posY+1,posZ-2), Blocks.SPRUCE_SAPLING.getDefaultState());
        //tall icicle 2
        worldIn.setBlockState(new BlockPos(posX-2, posY,posZ-1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY+1,posZ-1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY+2,posZ-1), Blocks.PACKED_ICE.getDefaultState());
        //tall icicle 3
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY+1,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY+2,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY+3,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY+4,posZ+1), Blocks.PACKED_ICE.getDefaultState());

        //extra ice
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ-2), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY+1,posZ+2), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY-1,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY-1,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY-2,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY-2,posZ), Blocks.PACKED_ICE.getDefaultState());
        // 3/4 cross below
        worldIn.setBlockState(new BlockPos(posX+1, posY-1,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY-1,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY-1,posZ-1), Blocks.PACKED_ICE.getDefaultState());

        worldIn.setBlockState(new BlockPos(posX-1, posY-1,posZ-1), Blocks.PACKED_ICE.getDefaultState());

        //cobweb part
        worldIn.setBlockState(new BlockPos(posX-2, posY,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY+1,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-2, posY+2,posZ+1), Blocks.COBWEB.getDefaultState());

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
