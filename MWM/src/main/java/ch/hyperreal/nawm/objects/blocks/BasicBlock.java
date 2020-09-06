package ch.hyperreal.nawm.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Lewin Gerber
 * @version 18.06.2020
 * nAWM
 */

public class BasicBlock extends Block {
    public BasicBlock() {
        super(Properties.create(Material.LEAVES));
    }
}
