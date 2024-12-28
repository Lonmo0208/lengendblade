package com.dinzeer.legendblade.entity;

import com.dinzeer.legendblade.regsitry.other.LBEntiteRegristrys;
import com.exfantasy.mclib.Utils.EntityPointer;
import mods.flammpfeil.slashblade.ability.StunManager;
import mods.flammpfeil.slashblade.entity.EntityAbstractSummonedSword;
import mods.flammpfeil.slashblade.entity.Projectile;
import mods.flammpfeil.slashblade.util.KnockBacks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.PlayMessages;
import org.joml.Vector3f;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumonSwordEntityEXSeven extends EntityAbstractSummonedSword {
    private static final EntityDataAccessor<Boolean> IT_FIRED = SynchedEntityData.defineId(SumonSwordEntityEXSeven.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Float> SPEED = SynchedEntityData.defineId(SumonSwordEntityEXSeven.class, EntityDataSerializers.FLOAT);

    private static final EntityDataAccessor<Vector3f> OFFSET = SynchedEntityData.defineId(SumonSwordEntityEXSeven.class, EntityDataSerializers.VECTOR3);
    long fireTime = -1;

    public SumonSwordEntityEXSeven(EntityType<? extends Projectile> entityTypeIn, Level worldIn) {
        super(entityTypeIn, worldIn);

        this.setPierce((byte) 5);
    }

    public static SumonSwordEntityEXSeven createInstance(PlayMessages.SpawnEntity packet, Level worldIn) {
        return new SumonSwordEntityEXSeven(LBEntiteRegristrys.ssexs, worldIn);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();

        this.entityData.define(IT_FIRED, false);
        this.entityData.define(SPEED, 3.0f);
        this.entityData.define(OFFSET, Vec3.ZERO.toVector3f());
    }

    public void doFire() {
        this.getEntityData().set(IT_FIRED, true);
    }

    public boolean itFired() {
        return this.getEntityData().get(IT_FIRED);
    }

    public void setSpeed(float speed) {
        this.getEntityData().set(SPEED, speed);
    }

    public float getSpeed() {
        return this.getEntityData().get(SPEED);
    }

    public void setOffset(Vec3 offset) {
        this.getEntityData().set(OFFSET, offset.toVector3f());
    }

    public Vec3 getOffset() {
        return new Vec3(this.getEntityData().get(OFFSET));
    }

    @Override
    public void tick() {
        final Vec3 _center = this.position();
        List<Entity> _entfound1 = this.level().getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), a -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
        for (Entity entity : _entfound1) {
            if (entity == getOwner()) {
                if (entity.level() instanceof ServerLevel)
                    EntityPointer.sendParticleCircle((ServerLevel) entity.level(), entity, ParticleTypes.FLASH, 3, 5);
                //EntityPointer.sendParticleCircle((ServerLevel) entity.level(), entity, ParticleTypes.END_ROD, 3, 3);
                List<Entity> _entfound = entity.level().getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), a -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    if (entityiterator instanceof LivingEntity) {
                        entityiterator.invulnerableTime = 0;

                            if (entityiterator.level() instanceof ServerLevel)
                                EntityPointer.sendParticleCircle((ServerLevel) entityiterator.level(), entityiterator, ParticleTypes.ENCHANTED_HIT, 1, 2);

                        ((LivingEntity) entityiterator).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 3, (false), (false)));
                        entityiterator.hurt(new DamageSource(entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), entity), (float) ((((LivingEntity) entity).getAttributeValue(Attributes.ATTACK_DAMAGE)) * 12.3f));

                    }


                }
                this.remove(RemovalReason.DISCARDED);
            }
        }
        if (!itFired() && level().isClientSide() && getVehicle() == null)
            startRiding(this.getOwner(), true);


        super.tick();
    }

    @Override
    public void rideTick()
    {
        if (itFired() && fireTime <= tickCount)
        {
            faceEntityStandby();
            Entity vehicle = getVehicle();
            Vec3 dir = this.getViewVector(0);
            if (!(vehicle instanceof LivingEntity))
            {
                this.shoot(dir.x, dir.y, dir.z, getSpeed(), 1.0f);
                return;
            }

            LivingEntity sender = (LivingEntity) getVehicle();
            this.stopRiding();

            this.tickCount = 0;

            Level worldIn = sender.level();








            final Vec3 _center = new Vec3(this.getX(), this.getY(), this.getZ());
            Optional<Entity> livingEntity = Optional.of(getOwner());
            Vec3 targetPos = livingEntity.map((e) -> new Vec3(e.getX(), e.getY() + e.getEyeHeight() * 0.5, e.getZ()))
                    .orElseGet(() ->
                    {
                        Vec3 start = sender.getEyePosition(1.0f);
                        Vec3 end = start.add(sender.getLookAngle().scale(40));
                        HitResult result = worldIn.clip(new ClipContext(start, end, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, sender));
                        return result.getLocation();
                    });
                Vec3 pos = this.getPosition(0.0f);
                dir = targetPos.subtract(pos).normalize();
                this.shoot(dir.x , dir.y , dir.z,getSpeed(),1f );


            if (canUpdate()) this.baseTick();

            if (sender instanceof ServerPlayer)
            {
                ((ServerPlayer) sender).playNotifySound(SoundEvents.ENDER_DRAGON_FLAP, SoundSource.PLAYERS, 1.0F, 1.0F);
            }

            return;
        }

        this.setDeltaMovement(Vec3.ZERO);
        if (canUpdate()) this.baseTick();

        faceEntityStandby();

        // lifetime check
        if (!itFired() && getVehicle() instanceof LivingEntity)
        {
            if (tickCount >= getDelay())
            {
                fireTime = tickCount + getDelay();
                doFire();
            }
        }
    }


        protected void faceEntityStandby ()
        {
            Vec3 pos = this.getVehicle().position();
            Vec3 offset = this.getOffset();

            if (this.getVehicle() == null) {
                doFire();
                return;
            }

            offset = offset.xRot((float) Math.toRadians(-this.getVehicle().getXRot()));
            offset = offset.yRot((float) Math.toRadians(-this.getVehicle().getYRot()));

            pos = pos.add(offset);

            this.xRotO = this.getXRot();
            this.yRotO = this.getYRot();


            setPos(pos);
            setRot(-this.getVehicle().getYRot(), -this.getVehicle().getXRot());
        }
    protected void onHitEntity(EntityHitResult p_213868_1_) {
        Entity entity = p_213868_1_.getEntity();

        if (entity instanceof LivingEntity a) {
            KnockBacks.cancel.action.accept((LivingEntity)entity);
            StunManager.setStun((LivingEntity)entity);
            a.invulnerableTime=0;
        }

        super.onHitEntity(p_213868_1_);
    }



}