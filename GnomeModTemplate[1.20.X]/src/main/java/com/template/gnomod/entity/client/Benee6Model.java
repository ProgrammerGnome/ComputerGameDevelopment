package com.template.gnomod.entity.client;

import com.template.gnomod.entity.animation.ModAnimations;
import com.template.gnomod.entity.server.Benee6Entity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class Benee6Model<T extends Benee6Entity> extends SinglePartEntityModel<T> {

    private final ModelPart MEE6All;

    public Benee6Model(ModelPart root) {
        this.MEE6All = root.getChild("MEE6All");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        // Becsapós, de kell.
        ModelPartData MEE6All = modelPartData.addChild("MEE6All", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -24.0F, -5.0F, 10.0F, 16.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData left_arm = MEE6All.addChild("left_arm", ModelPartBuilder.create().uv(28, 28).cuboid(6.0F, -3.0F, -8.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-13.0F, -11.0F, 7.0F));

        ModelPartData right_arm = MEE6All.addChild("right_arm", ModelPartBuilder.create().uv(0, 0).cuboid(15.0F, -14.0F, -7.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.0F, 0.0F, 6.0F));

        ModelPartData left_leg = MEE6All.addChild("left_leg", ModelPartBuilder.create().uv(14, 26).cuboid(5.0F, -8.0F, -6.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F))
                .uv(30, 4).cuboid(5.0F, -2.0F, -8.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, 0.0F, 4.0F));

        ModelPartData right_leg = MEE6All.addChild("right_leg", ModelPartBuilder.create().uv(0, 26).cuboid(5.0F, -8.0F, -6.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F))
                .uv(30, 0).cuboid(5.0F, -2.0F, -8.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 0.0F, 4.0F));

        ModelPartData eyebrown = MEE6All.addChild("eyebrown", ModelPartBuilder.create().uv(24, 26).cuboid(5.0F, 0.0F, -8.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(8.0F, -1.0F, -8.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -22.0F, 2.0F));

        ModelPartData hair_antenne = MEE6All.addChild("hair_antenne", ModelPartBuilder.create().uv(34, 8).cuboid(7.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 8).cuboid(8.0F, -5.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 28).cuboid(7.0F, -3.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(6.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 26).cuboid(7.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(6, 0).cuboid(8.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -24.0F, 5.0F));

        ModelPartData right_eye = MEE6All.addChild("right_eye", ModelPartBuilder.create().uv(34, 35).cuboid(7.0F, -2.0F, -8.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, -19.0F, 2.0F));

        ModelPartData left_eye = MEE6All.addChild("left_eye", ModelPartBuilder.create().uv(28, 35).cuboid(7.0F, -2.0F, -8.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -19.0F, 2.0F));

        ModelPartData mouth = MEE6All.addChild("mouth", ModelPartBuilder.create().uv(10, 28).cuboid(8.0F, 0.0F, -8.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 26).cuboid(8.0F, -1.0F, -8.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -17.0F, 2.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        MEE6All.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return MEE6All;
    }

    @Override
    public void setAngles(Benee6Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.animateMovement(ModAnimations.BENEE6_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

}
