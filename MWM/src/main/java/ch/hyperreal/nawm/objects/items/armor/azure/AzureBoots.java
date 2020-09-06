package ch.hyperreal.nawm.objects.items.armor.azure;

import ch.hyperreal.nawm.objects.items.armor.ArmorBase;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AzureBoots extends ArmorItem {
    public AzureBoots() {
        super(ArmorBase.ModArmorMaterial.AZURE, EquipmentSlotType.FEET, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
}
