package ru.sacrificium.util;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sacrificium.entity.ShieldEntity;

public class SacrificiumEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Constants.MODID);

    // Entity Types
        public static final RegistryObject<EntityType<ShieldEntity>> SHIELD_ENTITY = ENTITY_TYPES.register("shield",
            () -> EntityType.Builder.<ShieldEntity>create(ShieldEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F)
                    .func_233606_a_(4)
                    .func_233608_b_(10)
                    .build(new ResourceLocation(Constants.MODID, "shield").toString()));
//    public static final RegistryObject<EntityType<ShieldEntity>> SHIELD_ENTITY = ENTITY_TYPES.register("shield",
//            () -> EntityType.Builder.create(ShieldEntity::new, EntityClassification.CREATURE)
//                    .size(1.0f, 1.0f) // Hitbox Size
//                    .build(new ResourceLocation(Constants.MODID, "shield").toString()));
}
