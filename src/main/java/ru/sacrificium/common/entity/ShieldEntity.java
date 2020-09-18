package ru.sacrificium.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;

public class ShieldEntity extends ProjectileItemEntity {

    public ShieldEntity(EntityType<? extends ShieldEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public ShieldEntity(World worldIn, LivingEntity throwerIn) {
        super(/*SacrificiumEntities.SHIELD_ENTITY.get()*/EntityType.SNOWBALL, throwerIn, worldIn);
        this.setNoGravity(true);
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
    }

    @Override
    public Entity getEntity() {
        return this;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {

    }

    @Override
    public CompoundNBT serializeNBT() {
        return null;
    }

    @Override
    public boolean shouldRiderSit() {
        return false;
    }

    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return null;
    }

    @Override
    public boolean canRiderInteract() {
        return false;
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return false;
    }

    @Override
    public EntityClassification getClassification(boolean forSpawnCount) {
        return null;
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap) {
        return null;
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected float getGravityVelocity() {
        return 0.0F;
    }

    @Override
    public void tick() {
    }
}
