package ch.hyperreal.nawm.client.model;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import ch.hyperreal.nawm.entities.Raccoon;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class RaccoonModel<T extends Raccoon> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer mane;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer leg4;
    private final ModelRenderer tail;

    public RaccoonModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(1.0F, 13.5F, -7.0F);
        head.setTextureOffset(20, 24).addBox(-4.0F, -1.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(0.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(23, 0).addBox(-2.5F, 1.98F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 14.0F, 2.0F);
        setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
        body.setTextureOffset(0, 13).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 8.0F, 5.0F, 1.0F, false);

        mane = new ModelRenderer(this);
        mane.setRotationPoint(1.0F, 14.0F, 2.0F);
        mane.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -7.0F, 8.0F, 6.0F, 7.0F, 1.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(2.5F, 16.0F, 7.0F);
        leg1.setTextureOffset(0, 28).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-0.5F, 16.0F, 7.0F);
        leg2.setTextureOffset(0, 28).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leg3 = new ModelRenderer(this);
        leg3.setRotationPoint(2.5F, 16.0F, -4.0F);
        leg3.setTextureOffset(0, 28).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leg4 = new ModelRenderer(this);
        leg4.setRotationPoint(-0.5F, 16.0F, -4.0F);
        leg4.setTextureOffset(0, 28).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(1.0F, 12.0F, 8.0F);
        tail.setTextureOffset(24, 13).addBox(-2.0F, 2.0F, -1.0F, 2.0F, 7.0F, 2.0F, 1.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        mane.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        leg3.render(matrixStack, buffer, packedLight, packedOverlay);
        leg4.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }

    public ModelRenderer getBody() {
        return body;
    }

    public ModelRenderer getHead() {
        return head;
    }

    public ModelRenderer getLeg1() {
        return leg1;
    }

    public ModelRenderer getLeg2() {
        return leg2;
    }

    public ModelRenderer getLeg3() {
        return leg3;
    }

    public ModelRenderer getLeg4() {
        return leg4;
    }

    public ModelRenderer getMane() {
        return mane;
    }

    public ModelRenderer getTail() {
        return tail;
    }
}