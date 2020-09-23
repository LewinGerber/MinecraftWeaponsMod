package ch.hyperreal.nawm.init;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.entities.Raccoon;
import ch.hyperreal.nawm.entities.kappa_creeper.KappaCreeperEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MinecraftWeaponsMod.MOD_ID);

    public static final RegistryObject<EntityType<Raccoon>> RACCOON = ENTITY_TYPES
            .register("raccoon",
                    () -> EntityType.Builder.create(Raccoon::new, EntityClassification.CREATURE)
                            .size(0.6f, 0.85f)
                            .build(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "raccoon").toString())
            );

    public static final RegistryObject<EntityType<KappaCreeperEntity>> KAPPA_CREEPER = ENTITY_TYPES
            .register( "kappa_creeper",
                    () -> EntityType.Builder.create(KappaCreeperEntity::new, EntityClassification.MONSTER)
                        .size(0.6f, 0.85f)
                        .build(new ResourceLocation(MinecraftWeaponsMod.MOD_ID, "kappa_creeper").toString())
            );

    public static SpawnEggItem getKappaCreeperSpawnEgg() {
        return new SpawnEggItem(KAPPA_CREEPER.get(), 0, 1, new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }
}
