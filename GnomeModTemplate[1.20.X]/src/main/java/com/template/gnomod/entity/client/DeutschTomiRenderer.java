package com.template.gnomod.entity.client;

import com.template.gnomod.GnoModpack;
import com.template.gnomod.entity.server.DeutschTomiEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeutschTomiRenderer extends MobEntityRenderer<DeutschTomiEntity, DeutschTomiModel<DeutschTomiEntity>> {
    private static final Identifier TEXTURE = new Identifier(GnoModpack.MOD_ID, "textures/entity/deutschtomi.png");

    public DeutschTomiRenderer(EntityRendererFactory.Context context) {
        super(context, new DeutschTomiModel<>(context.getPart(ModModelLayers.DEUTSCHTOMI)), 0.6f);
    }

    @Override
    public Identifier getTexture(DeutschTomiEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(DeutschTomiEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
