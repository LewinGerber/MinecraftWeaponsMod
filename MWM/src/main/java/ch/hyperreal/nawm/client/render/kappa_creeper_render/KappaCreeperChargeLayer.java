package ch.hyperreal.nawm.client.render.kappa_creeper_render;

import ch.hyperreal.nawm.client.model.KappaCreeperModel;
import ch.hyperreal.nawm.entities.kappa_creeper.KappaCreeperEntity;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.EnergyLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * @author Lewin Gerber
 * @version 28.06.2020
 * nAWM
 */

@OnlyIn(Dist.CLIENT)
public class KappaCreeperChargeLayer extends EnergyLayer<KappaCreeperEntity, KappaCreeperModel<KappaCreeperEntity>> {
    private static final ResourceLocation LIGHTNING_TEXTURE = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    private final KappaCreeperModel<KappaCreeperEntity> creeperModel = new KappaCreeperModel<>(2.0F);

    public KappaCreeperChargeLayer(IEntityRenderer<KappaCreeperEntity, KappaCreeperModel<KappaCreeperEntity>> p_i50947_1_) {
        super(p_i50947_1_);
    }

    protected float func_225634_a_(float p_225634_1_) {
        return p_225634_1_ * 0.01F;
    }

    protected ResourceLocation func_225633_a_() {
        return LIGHTNING_TEXTURE;
    }

    protected EntityModel<KappaCreeperEntity> func_225635_b_() {
        return this.creeperModel;
    }
}
