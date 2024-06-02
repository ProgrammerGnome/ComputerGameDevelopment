package com.template.gnomod;

import com.template.gnomod.entity.ModEntities;
import com.template.gnomod.entity.server.DeutschTomiEntity;
import com.template.gnomod.entity.server.Benee6Entity;
import com.template.gnomod.item.ModItemGroups;
import com.template.gnomod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GnoModpack implements ModInitializer {
	public static final String MOD_ID = "gnomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		FabricDefaultAttributeRegistry.register(ModEntities.BENEE6, Benee6Entity.createBenee6Attributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DEUTSCHTOMI, DeutschTomiEntity.createBenee6Attributes());

	}
}
