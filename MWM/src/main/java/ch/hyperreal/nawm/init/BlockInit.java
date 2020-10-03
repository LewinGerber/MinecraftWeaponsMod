package ch.hyperreal.nawm.init;

import ch.hyperreal.nawm.objects.blocks.BasicBlock;
import ch.hyperreal.nawm.objects.blocks.crops.MagicMushroomCrop;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Lewin Gerber, Simon Tobler, Elias Mehlram
 * @version 07.07.2020
 * nAWM
 */

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MinecraftWeaponsMod.MOD_ID);

    public static final RegistryObject<Block> MAGIC_MUSHROOM_CROP = BLOCKS.register("magic_mushroom_crop", MagicMushroomCrop::new);
    public static final RegistryObject<Block> BASIC_BLOCK = BLOCKS.register("basic_block", MagicMushroomCrop::new);
}
