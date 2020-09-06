package ch.hyperreal.nawm.client.render;

import ch.hyperreal.nawm.client.model.RaccoonModel;
import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.entities.Raccoon;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RaccoonRender extends MobRenderer<Raccoon, RaccoonModel<Raccoon>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MinecraftWeaponsMod.MOD_ID,
            "textures/entity/raccoon.png");

    public RaccoonRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RaccoonModel<Raccoon>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(Raccoon entity) {
        return TEXTURE;
    }
}
