package com.template.gnomod;

import com.template.gnomod.entity.ModEntities;
import com.template.gnomod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class GnoModpackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.BENEE6, Benee6Renderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BENEE6, Benee6Model::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.DEUTSCHTOMI, DeutschTomiRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DEUTSCHTOMI, DeutschTomiModel::getTexturedModelData);

    }
}
