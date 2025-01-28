 package net.lune.translationmod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.lune.translationmod.entity.client.Nabrus;
import net.lune.translationmod.entity.custom.NabrusEntity;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    }
}

        /*
        @Environment(EnvType.CLIENT)
        public class EntityTestingClient implements ClientModInitializer {
            public static final EntityModelLayer MODEL_NABRUS_LAYER = new EntityModelLayer(new Identifier("entitytesting", "cube"), "main");
            @Override
            public void onInitializeClient() {
                /*
                 * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
                 *
                 * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
                 */
/*
                EntityRendererRegistry.INSTANCE.register(NabrusEntity.EntityTesting.NABRUS, (context) -> {
                    return new NabrusRenderer(context);
                });
                // In 1.17, use EntityRendererRegistry.register (seen below) instead of EntityRendererRegistry.INSTANCE.register (seen above)

                EntityModelLayerRegistry.registerModelLayer(MODEL_NABRUS_LAYER, Nabrus::getTexturedModelData);
            }
        }
    } */
