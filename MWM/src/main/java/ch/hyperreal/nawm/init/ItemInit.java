package ch.hyperreal.nawm.init;

import ch.hyperreal.nawm.objects.items.ModSpawnEggItem;
import ch.hyperreal.nawm.objects.items.mob.KappaCreeperSpawnEgg;
import ch.hyperreal.nawm.objects.items.mob.RaccoonSpawnEgg;
import ch.hyperreal.nawm.objects.items.misc.*;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.objects.blocks.seeds.MagicMushroomSeed;
import ch.hyperreal.nawm.objects.items.armor.azure.AzureBoots;
import ch.hyperreal.nawm.objects.items.armor.azure.AzureChestplate;
import ch.hyperreal.nawm.objects.items.armor.azure.AzureHelmet;
import ch.hyperreal.nawm.objects.items.armor.azure.AzureLeggings;
import ch.hyperreal.nawm.objects.items.foods.MagicMushroom;
import ch.hyperreal.nawm.objects.items.material.Azure;
import ch.hyperreal.nawm.objects.items.tools.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Lewin Gerber, Elias Mehran, Simon Tobler
 * @version 06.09.2020
 * (n)AWM
 */

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MinecraftWeaponsMod.MOD_ID);

    //misc
    public static final RegistryObject<Item> BASIC_ITEM = ITEMS.register("basic_item", BasicItem::new);
    public static final RegistryObject<Item> ICE_CASTLE = ITEMS.register("ice_castle", IceCastle::new);
    public static final RegistryObject<Item> CLOAKING_DEVICE = ITEMS.register("cloaking_device", CloakingDevice::new);
    public static final RegistryObject<Item> TIME_CONTROL = ITEMS.register("time_control", TimeControl::new);
    public static final RegistryObject<Item> HEALTH_PACK = ITEMS.register("health_pack", HealthPack::new);

    //spawn eggs
    public static final RegistryObject<ModSpawnEggItem> KAPPA_CREEPER_SPAWN_EGG = ITEMS.register("kappa_creeper_spawn_egg", KappaCreeperSpawnEgg::new);
    public static final RegistryObject<ModSpawnEggItem> RACCOON_SPAWN_EGG = ITEMS.register("raccoon_spawn_egg", RaccoonSpawnEgg::new);

    //material
    public static final RegistryObject<Item> AZURE = ITEMS.register("azure", Azure::new);

    //food
    public static final RegistryObject<Item> MAGIC_MUSHROOM = ITEMS.register("magic_mushroom", MagicMushroom::new);

    //armor
    public static final RegistryObject<Item> AZURE_HELMET = ITEMS.register("azure_helmet", AzureHelmet::new);
    public static final RegistryObject<Item> AZURE_CHESTPLATE = ITEMS.register("azure_chestplate", AzureChestplate::new);
    public static final RegistryObject<Item> AZURE_LEGGINGS = ITEMS.register("azure_leggings", AzureLeggings::new);
    public static final RegistryObject<Item> AZURE_BOOTS = ITEMS.register("azure_boots", AzureBoots::new);

    //tools
    public static final RegistryObject<Item> ADVENTURE_SWORD = ITEMS.register("adventure_sword", AdventureSword::new);
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", Scythe::new);
    public static final RegistryObject<Item> AMATERASU_BOW = ITEMS.register("amaterasu_bow", AmaterasuBow::new);
    public static final RegistryObject<Item> ARROW_THROWER = ITEMS.register("arrow_thrower", ArrowThrower::new);
    public static final RegistryObject<Item> HALF_SWORD = ITEMS.register("half_sword", HalfSword::new);

    //seed
    public static final RegistryObject<Item> MAGIC_MUSHROOM_SEED = ITEMS.register("magic_mushroom_seed", MagicMushroomSeed::new);
}
