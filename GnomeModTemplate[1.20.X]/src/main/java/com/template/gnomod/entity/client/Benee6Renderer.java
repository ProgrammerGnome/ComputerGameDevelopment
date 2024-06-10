package com.template.gnomod.entity.client;

import com.template.gnomod.GnoModpack;
import com.template.gnomod.entity.server.Benee6Entity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class Benee6Renderer extends MobEntityRenderer<Benee6Entity, Benee6Model<Benee6Entity>> {
    private static final Identifier TEXTURE = new Identifier(GnoModpack.MOD_ID, "textures/entity/benee6.png");

    public Benee6Renderer(EntityRendererFactory.Context context) {
        super(context, new Benee6Model<>(context.getPart(ModModelLayers.BENEE6)), 0.6f);
    }

    @Override
    public Identifier getTexture(Benee6Entity entity) {
        return TEXTURE;
    }

    @Override
    public void render(Benee6Entity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
