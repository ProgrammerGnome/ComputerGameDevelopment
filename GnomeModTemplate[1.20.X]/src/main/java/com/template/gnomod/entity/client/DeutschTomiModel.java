package com.template.gnomod.entity.client;

import com.template.gnomod.entity.animation.ModAnimations;
import com.template.gnomod.entity.server.DeutschTomiEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class DeutschTomiModel<T extends DeutschTomiEntity> extends SinglePartEntityModel<T> {
    private final ModelPart DTmod;

    public DeutschTomiModel(ModelPart root) {
        this.DTmod = root.getChild("DTmod");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData DTmod = modelPartData.addChild("DTmod", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData left_leg = DTmod.addChild("left_leg", ModelPartBuilder.create().uv(38, 38).cuboid(-4.0F, -2.0F, -4.0F, 3.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 37).cuboid(-4.0F, -10.0F, -2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_leg = DTmod.addChild("right_leg", ModelPartBuilder.create().uv(14, 37).cuboid(1.0F, -2.0F, -4.0F, 3.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(36, 0).cuboid(1.0F, -10.0F, -2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = DTmod.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -22.0F, -4.0F, 10.0F, 12.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = DTmod.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -23.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 20).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 9.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData hair = head.addChild("hair", ModelPartBuilder.create().uv(50, 0).cuboid(4.0F, -32.0F, -3.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 49).cuboid(-5.0F, -32.0F, -3.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(47, 28).cuboid(5.0F, -31.0F, -3.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(47, 21).cuboid(-6.0F, -31.0F, -2.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(47, 14).cuboid(4.0F, -29.0F, -3.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(47, 7).cuboid(5.0F, -28.0F, -2.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(46, 46).cuboid(-5.0F, -29.0F, -4.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(34, 46).cuboid(-6.0F, -28.0F, -3.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(9, 45).cuboid(-7.0F, -26.0F, -2.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(27, 44).cuboid(6.0F, -26.0F, -4.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(40, 25).cuboid(-5.0F, -26.0F, -4.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(40, 12).cuboid(4.0F, -26.0F, -2.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_arm = DTmod.addChild("left_arm", ModelPartBuilder.create().uv(32, 30).cuboid(-7.0F, -22.0F, -2.0F, 2.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_arm = DTmod.addChild("right_arm", ModelPartBuilder.create().uv(32, 16).cuboid(5.0F, -22.0F, -2.0F, 2.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData mouth_grp = DTmod.addChild("mouth_grp", ModelPartBuilder.create().uv(0, 1).cuboid(-2.0F, -26.0F, -5.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        DTmod.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return DTmod;
    }

    @Override
    public void setAngles(DeutschTomiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.animateMovement(ModAnimations.DEUTSCHTOMI_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        //
    }

}