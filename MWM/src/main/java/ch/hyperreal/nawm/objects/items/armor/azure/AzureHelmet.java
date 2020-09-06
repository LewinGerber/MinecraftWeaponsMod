package ch.hyperreal.nawm.objects.items.armor.azure;

import ch.hyperreal.nawm.objects.items.armor.ArmorBase;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AzureHelmet extends ArmorItem {
    public AzureHelmet() {
    super(ArmorBase.ModArmorMaterial.AZURE, EquipmentSlotType.HEAD, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
}
