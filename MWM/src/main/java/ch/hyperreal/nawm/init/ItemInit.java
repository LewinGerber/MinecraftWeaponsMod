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
import ch.hyperreal.nawm.objects.items.tools.AdventureSword;
import ch.hyperreal.nawm.objects.items.tools.AmaterasuBow;
import ch.hyperreal.nawm.objects.items.tools.ArrowThrower;
import ch.hyperreal.nawm.objects.items.tools.Scythe;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Item> BASIC_ITEM = ITEMS.register("basic_item", () -> new BasicItem());
    public static final RegistryObject<Item> ICE_CASTLE = ITEMS.register("ice_castle", () -> new IceCastle());
    public static final RegistryObject<Item> CLOAKING_DEVICE = ITEMS.register("cloaking_device", () -> new CloakingDevice());
    public static final RegistryObject<Item> TIME_CONTROL = ITEMS.register("time_control", () -> new TimeControl());

    //spawn eggs
    public static final RegistryObject<ModSpawnEggItem> KAPPA_CREEPER_SPAWN_EGG = ITEMS.register("kappa_creeper_spawn_egg", () -> new KappaCreeperSpawnEgg());
    public static final RegistryObject<ModSpawnEggItem> RACCOON_SPAWN_EGG = ITEMS.register("raccoon_spawn_egg", () -> new RaccoonSpawnEgg());

    //material
    public static final RegistryObject<Item> AZURE = ITEMS.register("azure", () -> new Azure());

    //food
    public static final RegistryObject<Item> MAGIC_MUSHROOM = ITEMS.register("magic_mushroom", () -> new MagicMushroom());

    //armor
    public static final RegistryObject<Item> AZURE_HELMET = ITEMS.register("azure_helmet", () -> new AzureHelmet());
    public static final RegistryObject<Item> AZURE_CHESTPLATE = ITEMS.register("azure_chestplate", () -> new AzureChestplate());
    public static final RegistryObject<Item> AZURE_LEGGINGS = ITEMS.register("azure_leggings", () -> new AzureLeggings());
    public static final RegistryObject<Item> AZURE_BOOTS = ITEMS.register("azure_boots", () -> new AzureBoots());

    //tools
    public static final RegistryObject<Item> ADVENTURE_SWORD = ITEMS.register("adventure_sword", () -> new AdventureSword());
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", () -> new Scythe());
    public static final RegistryObject<Item> AMATERASU_BOW = ITEMS.register("amaterasu_bow", () -> new AmaterasuBow());
    public static final RegistryObject<Item> ARROW_THROWER = ITEMS.register("arrow_thrower", () -> new ArrowThrower());

    //seed
    public static final RegistryObject<Item> MAGIC_MUSHROOM_SEED = ITEMS.register("magic_mushroom_seed", () -> new MagicMushroomSeed());
}
