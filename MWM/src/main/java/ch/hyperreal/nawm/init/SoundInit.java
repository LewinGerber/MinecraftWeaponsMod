package ch.hyperreal.nawm.init;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Lewin Gerber
 * @version 28.06.2020
 * nAWM
 */
public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
            MinecraftWeaponsMod.MOD_ID);

    public static final RegistryObject<SoundEvent> KAPPA = SOUNDS.register("entity.kappa_creeper.kappa_creeper_entity.kappa",
            ()-> new SoundEvent(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "entity.kappa_creeper.kappa_creeper_entity.kappa")));

    public static final RegistryObject<SoundEvent> FLY = SOUNDS.register("item.basic_item.fly",
            ()-> new SoundEvent(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "item.basic_item.fly")));

    public static final RegistryObject<SoundEvent> CLOAK = SOUNDS.register("item.cloaking_device.cloak",
            ()-> new SoundEvent(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "item.cloaking_device.cloak")));
    public static final RegistryObject<SoundEvent> AMATERASU = SOUNDS.register("item.amaterasu_bow.amaterasu",
            () ->new SoundEvent(new ResourceLocation(MinecraftWeaponsMod.MOD_ID,"item.amaterasu_bow.amaterasu")));

    public static final RegistryObject<SoundEvent> TIME = SOUNDS.register("item.time_control.time",
            ()-> new SoundEvent(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "item.time_control.time")));

}
