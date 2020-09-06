package ch.hyperreal.nawm.enchantments;

import ch.hyperreal.nawm.init.ItemInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

/**
 * @author Simon Tobler
 * @version 22.06.2020
 */

public class AmaterasuEnchantment extends Enchantment {

    public AmaterasuEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentType.create("amaterasu_bow", item -> item.equals(ItemInit.AMATERASU_BOW.get())),
                new EquipmentSlotType[]{EquipmentSlotType.CHEST.MAINHAND});
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    /*  @Override
      public int calcDamagByCreature(int level) {

          return super.calcModifierDamage(1, DamageSource.ON_FIRE.setDamageIsAbsolute().setFireDamage().setExplosion().setMagicDamage());
      }
      */
    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        LivingEntity e = (LivingEntity)target;
        e.addPotionEffect(new EffectInstance(Effects.WITHER,45000,5));
        target.setFire(1000);
        target.isImmuneToFire();

    }

}
