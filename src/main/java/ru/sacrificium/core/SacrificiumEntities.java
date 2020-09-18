package ru.sacrificium.core;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sacrificium.common.entity.ShieldEntity;
import ru.sacrificium.util.Constants;

public class SacrificiumEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Constants.MODID);

    // Entity Types
        public static final RegistryObject<EntityType<ShieldEntity>> SHIELD_ENTITY = ENTITY_TYPES.register("shield_type",
            () -> EntityType.Builder.<ShieldEntity>create(ShieldEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F).func_233606_a_(4).func_233608_b_(10)
                    .build(new ResourceLocation(Constants.MODID, "shield_type").toString()));

}
