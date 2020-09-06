package ch.hyperreal.nawm.objects.items.foods;

import ch.hyperreal.nawm.util.helpers.KeyboardHelper;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;


/**
 * @author Simon TObler
 * @version 19.06.2020
 */
public class MagicMushroom extends Item{

    //macht, dass das item immer glüht, als wäre es verzaubert
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    // wenn man shift drückt, zeigt es informationen über das item an
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Feeling lucky today?"));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " SHIFT " + "\u00A77" + "for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    public MagicMushroom() {
        super(new Item.Properties().group(MinecraftWeaponsMod.WeaponItemGroup.instance).food(new Food.Builder().hunger(6)
                .saturation(1.2f).setAlwaysEdible()
                .effect(new EffectInstance(Effects.ABSORPTION, 4500, 4), 0.999999999999999999999999999999999f)
                .effect(new EffectInstance(Effects.WITHER,4500,4),0.1f).build()));
        //Hello World 2.0
        ;
    }
}
