package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.item.*;

/**
 * @author Simon TObler
 * @version 26.06.2020
 */
public class AmaterasuBow extends BowItem {
    // muss sound effekt von amaterasu einfügen
    public AmaterasuBow() {
        super(new Item.Properties().maxDamage(8).group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

}
