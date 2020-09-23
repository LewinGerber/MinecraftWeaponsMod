package ch.hyperreal.nawm.objects.items.armor;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.objects.items.material.Azure;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class ArmorBase {
    public enum ModArmorMaterial implements IArmorMaterial {
        AZURE(MinecraftWeaponsMod.MOD_ID + ":azure", 5, new int[]{8, 11, 15, 9}, 420, SoundEvents.BLOCK_ANVIL_USE, 69.0f, () -> {
            return Ingredient.fromItems(new Azure());
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;


        ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmount, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
            this.name = name;
            this.maxDamageFactor = maxDamageFactor;
            this.damageReductionAmountArray = damageReductionAmount;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.toughness = toughness;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }

    }
}
