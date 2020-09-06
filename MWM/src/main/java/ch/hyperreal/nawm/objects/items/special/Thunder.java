package ch.hyperreal.nawm.objects.items.special;

import ch.hyperreal.nawm.util.helpers.KeyboardHelper;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Thunder extends Item {
    public Thunder() {
        super(new Item.Properties().maxDamage(100).group(MinecraftWeaponsMod.WeaponItemGroup.instance));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Show them your WRATH!"));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " SHIFT " + "\u00A77" + "for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        worldIn.isThundering();
        worldIn.setThunderStrength(1.0f);
        playerIn.getHeldItem(handIn).damageItem(4, playerIn, (entity) -> entity.sendBreakAnimation(handIn));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
