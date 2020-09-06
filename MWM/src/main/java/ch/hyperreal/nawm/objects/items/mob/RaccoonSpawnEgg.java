package ch.hyperreal.nawm.objects.items.mob;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.init.ModEntityTypes;
import ch.hyperreal.nawm.objects.items.ModSpawnEggItem;

/**
 * @author Lewin Gerber
 * @version 06.09.2020
 * MWM
 */
public class RaccoonSpawnEgg extends ModSpawnEggItem {
    public RaccoonSpawnEgg() {
        super(ModEntityTypes.RACCOON, 0, 0, new Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance).maxStackSize(16));
    }
}
