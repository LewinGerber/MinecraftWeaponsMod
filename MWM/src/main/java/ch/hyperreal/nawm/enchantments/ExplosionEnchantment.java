package ch.hyperreal.nawm.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 26.06.2020
 * nAWM
 */

public class ExplosionEnchantment extends Enchantment {
    private static final int MIN_LVL = 1;
    private static final int MAX_LVL = 3;

    public ExplosionEnchantment () {
        super(
                Rarity.COMMON,
                EnchantmentType.WEAPON,
                new EquipmentSlotType[]{EquipmentSlotType.CHEST.MAINHAND}
                );
    }

    /*
        Creates an explosion as soon as the weapon hits an entity
    */
    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        super.onEntityDamaged(user, target, level);
        World world = target.getEntityWorld();
        //determine the type of explosion
        Explosion.Mode explosionMode = null;
        switch (level) {
            case 1:
                explosionMode = Explosion.Mode.NONE;
                break;
            case 2:
                explosionMode = Explosion.Mode.BREAK;
                break;
            case 3:
                explosionMode = Explosion.Mode.DESTROY;
                break;
        }
        user.setInvulnerable(true);
        world.createExplosion(target, target.getPosX(), target.getPosY(), target.getPosZ(), level*2, explosionMode);
        user.setInvulnerable(false);
    }

    //GETTER & SETTER

    /**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     */
    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 10 + enchantmentLevel * 5;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return this.getMinEnchantability(enchantmentLevel) + 10;
    }

    @Override
    public int getMaxLevel() {
        return MAX_LVL;
    }

    @Override
    public int getMinLevel() {
        return MIN_LVL;
    }
}
