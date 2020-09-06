package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class AdventureSword extends SwordItem {
    public AdventureSword() {
        super(ToolTier.AdventureTier.ADVENTURE, 7, 5.0F, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
}
