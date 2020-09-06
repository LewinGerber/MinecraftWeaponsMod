package ch.hyperreal.nawm.client.render.kappa_creeper_render;

import ch.hyperreal.nawm.client.model.KappaCreeperModel;
import ch.hyperreal.nawm.entities.kappa_creeper.KappaCreeperEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

/**
 * @author Lewin Gerber
 * @version 27.06.2020
 * nAWM
 */

public class KappaCreeperRender extends MobRenderer<KappaCreeperEntity, KappaCreeperModel<KappaCreeperEntity>> {
    private static final ResourceLocation CREEPER_TEXTURES = new ResourceLocation("textures/entity/creeper/creeper.png");

    public KappaCreeperRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new KappaCreeperModel<>(), 0.5F);
        this.addLayer(new KappaCreeperChargeLayer(this));
    }

    protected void preRenderCallback(KappaCreeperEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        float f = entitylivingbaseIn.getCreeperFlashIntensity(partialTickTime);
        float f1 = 1.0F + MathHelper.sin(f * 100.0F) * f * 0.01F;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        f = f * f;
        f = f * f;
        float f2 = (1.0F + f * 0.4F) * f1;
        float f3 = (1.0F + f * 0.1F) / f1;
        matrixStackIn.scale(f2, f3, f2);
    }

    protected float getOverlayProgress(CreeperEntity livingEntityIn, float partialTicks) {
        float f = livingEntityIn.getCreeperFlashIntensity(partialTicks);
        return (int)(f * 10.0F) % 2 == 0 ? 0.0F : MathHelper.clamp(f, 0.5F, 1.0F);
    }

    /**
     * Returns the location of an entity's texture.
     */

    @Override
    public ResourceLocation getEntityTexture(KappaCreeperEntity entity) {
        return CREEPER_TEXTURES;
    }
}
