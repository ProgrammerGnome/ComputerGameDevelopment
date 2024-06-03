package com.template.gnomod.entity.server;

import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier CUSTOM_ANIMAL_WALK_ID = new Identifier("gnomod", "deutschtomi_walk");
    public static final SoundEvent CUSTOM_ANIMAL_WALK = SoundEvent.of(CUSTOM_ANIMAL_WALK_ID);

    public static void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, CUSTOM_ANIMAL_WALK_ID, CUSTOM_ANIMAL_WALK);
    }
}
