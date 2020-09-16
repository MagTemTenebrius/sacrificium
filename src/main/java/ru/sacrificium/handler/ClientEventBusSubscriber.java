package ru.sacrificium.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ru.sacrificium.Sacrificium;
import ru.sacrificium.entity.ModSpawnEggItem;
//import ru.sacrificium.entity.ShieldRenderer;
import ru.sacrificium.entity.ShieldEntity;
import ru.sacrificium.util.Constants;
import ru.sacrificium.util.SacrificiumEntities;
import ru.sacrificium.util.SacrificiumItems;

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
