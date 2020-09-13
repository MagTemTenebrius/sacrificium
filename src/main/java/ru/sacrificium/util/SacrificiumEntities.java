package ru.sacrificium.util;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sacrificium.entity.ShieldEntity;

public class SacrificiumEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Constants.MODID);

    // Entity Types
    public static final RegistryObject<EntityType<ShieldEntity>> SHIELD_ENTITY = ENTITY_TYPES.register("shield",
            () -> EntityType.Builder.create(ShieldEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f) // Hitbox Size
                    .build(new ResourceLocation(Constants.MODID, "shield").toString()));
}
