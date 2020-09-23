package ch.hyperreal.nawm.init;

import ch.hyperreal.nawm.enchantments.AmaterasuEnchantment;
import ch.hyperreal.nawm.enchantments.ExplosionEnchantment;
import ch.hyperreal.nawm.enchantments.LifeStealEnchantment;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, MinecraftWeaponsMod.MOD_ID);

    public static final RegistryObject<Enchantment> AMATERASU = ENCHANTMENTS
            .register("amaterasu", AmaterasuEnchantment::new);

    public static final RegistryObject<Enchantment> EXPLOSION = ENCHANTMENTS
            .register("explosion", ExplosionEnchantment::new);

    public static final RegistryObject<Enchantment> LIFE_STEAL = ENCHANTMENTS
            .register("life_steal", LifeStealEnchantment::new);
}
