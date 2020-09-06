package ch.hyperreal.nawm.objects.blocks.seeds;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MagicMushroomSeed extends BlockItem {
    public MagicMushroomSeed() {
        super(BlockInit.MAGIC_MUSHROOM_CROP.get(), new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
}
