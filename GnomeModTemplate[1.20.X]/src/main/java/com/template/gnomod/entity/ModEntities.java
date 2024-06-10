package com.template.gnomod.entity;

import com.template.gnomod.GnoModpack;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import com.template.gnomod.entity.server.Benee6Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<Benee6Entity> BENEE6 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(GnoModpack.MOD_ID, "benee6"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Benee6Entity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

}
