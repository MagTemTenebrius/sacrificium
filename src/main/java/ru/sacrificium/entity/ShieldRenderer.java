//package ru.sacrificium.entity;
//
//import net.minecraft.client.renderer.entity.EntityRendererManager;
//import net.minecraft.client.renderer.entity.MobRenderer;
//import net.minecraft.util.ResourceLocation;
//import ru.sacrificium.util.Constants;
//
//public class ShieldRenderer extends MobRenderer<ShieldEntity, ShieldModel<ShieldEntity>> {
//
//    protected static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID, "textures/entity/shield.png");
//
//    public ShieldRenderer(EntityRendererManager renderManagerIn) {
//        super(renderManagerIn, new ShieldModel<>(), 0.7f);
//    }
//
//    @Override
//    public ResourceLocation getEntityTexture(ShieldEntity entity) {
//        return TEXTURE;
//    }
//}