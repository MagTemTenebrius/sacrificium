package ru.sacrificium.client.handler;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ru.sacrificium.common.entity.ModSpawnEggItem;
import ru.sacrificium.util.Constants;

@Mod.EventBusSubscriber(modid = Constants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
//        RenderingRegistry.registerEntityRenderingHandler(SacrificiumEntities.SHIELD_ENTITY.get(), ShieldRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(SacrificiumEntities.SHIELD_ENTITY.get(), new IRenderFactory<ShieldEntity>() {
//            @Override
//            public EntityRenderer<? super ShieldEntity> createRenderFor(EntityRendererManager manager) {
//                return null;
//            }
//        });
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
