package ch.hyperreal.nawm.objects.items.tools;

import ch.hyperreal.nawm.objects.items.misc.BasicItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

/**
 * @author Elias Mehran, Lewin Gerber
 * @version 17.06.2020
 * nAWM
 */
public class ToolTier {

    //Adventure Time like Tier
    public enum AdventureTier implements IItemTier {

        ADVENTURE(4, 2000, 15.0F, 7.0F, 420, () -> {
            return Ingredient.fromItems(new BasicItem());
        }),
        HALF_SWORD(0, 2000, 0.0F, -0.999F, 420, () -> {
            return Ingredient.fromItems(new BasicItem());
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private AdventureTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }
}
