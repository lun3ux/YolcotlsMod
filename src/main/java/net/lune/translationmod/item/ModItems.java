package net.lune.translationmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lune.translationmod.Heroes_armor.Heroes_armor;
import net.lune.translationmod.TemplateMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.entity.EquipmentSlot;

public class ModItems {


    private static Item registerItem(Item item, String name) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }
    public static final ArmorMaterial Heroes_armor = new Heroes_armor();
    public static final Item RUBY = registerItem(new Item(new FabricItemSettings()), "ruby");

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    public static final Item BLAKES_MATERIAL_HELMET = registerItem(new ArmorItem(Heroes_armor, ArmorItem.Type.HELMET, new Item.Settings()), "blakes_material_helmet");
    public static final Item BLAKES_MATERIAL_CHESTPLATE = registerItem(new ArmorItem(Heroes_armor, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "heroes_chestplate");
    public static final Item BLAKES_MATERIAL_LEGGINGS = registerItem(new ArmorItem(Heroes_armor, ArmorItem.Type.LEGGINGS, new Item.Settings()), "heroes_leggings");
    public static final Item BLAKES_MATERIAL_BOOTS = registerItem(new ArmorItem(Heroes_armor, ArmorItem.Type.BOOTS, new Item.Settings()), "heroes_boots");

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TemplateMod.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.DIAMOND_SWORD))
            .displayName(Text.translatable("itemGroup.fabric_docs_reference"))
            .build();


    public static void registerModItems() {
        TemplateMod.LOGGER.info("Registering Items for" + TemplateMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(ItemGroup -> {
            ItemGroup.add(ModItems.BLAKES_MATERIAL_HELMET);
            ItemGroup.add(ModItems.BLAKES_MATERIAL_CHESTPLATE);
            ItemGroup.add(ModItems.BLAKES_MATERIAL_LEGGINGS);
            ItemGroup.add(ModItems.BLAKES_MATERIAL_BOOTS);
        });

    }
}


