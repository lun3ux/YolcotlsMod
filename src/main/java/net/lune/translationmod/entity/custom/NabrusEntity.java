package net.lune.translationmod.entity.custom;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class NabrusEntity extends AnimalEntity {
    protected NabrusEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public class EntityTesting implements ModInitializer {

        public static final EntityType<NabrusEntity> NABRUS = Registry.register(
                Registries.ENTITY_TYPE,
                new Identifier("entitytesting", "nabrus"),
                FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NabrusEntity::new)
                        .dimensions(EntityDimensions.fixed(3f, 1f))
                        .build()
        );
        public static DefaultAttributeContainer.Builder createNabrusAttributes() {
            return MobEntity.createMobAttributes()
                    .add(EntityAttributes.GENERIC_MAX_HEALTH, 20)
                    .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1)
                    .add(EntityAttributes.GENERIC_ARMOR, .5)
                    .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1);
        }
        @Override
        public void onInitialize() {
            FabricDefaultAttributeRegistry.register(NABRUS, NabrusEntity.createMobAttributes());

        }

    }
    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
