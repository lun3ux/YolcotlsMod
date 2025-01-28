package net.lune.translationmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lune.translationmod.Heroes_armor.HeroesArmorMaterial;
import net.lune.translationmod.TemplateMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new CustomArmorMaterial();
    public static final Item CUSTOM_MATERIAL = registerItem(new CustomMaterialItem(new Item.Settings()), "custom_material");


    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    public static final Item CUSTOM_MATERIAL_HELMET = registerItem(new ArmorItem(HeroesArmorMaterial, EquipmentSlot.HEAD, new Item.Settings()), "heroes_helmet");
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = registerItem(new ArmorItem(HeroesArmorMaterial, EquipmentSlot.CHEST, new Item.Settings()), "heroes_chestplate");
    public static final Item CUSTOM_MATERIAL_LEGGINGS = registerItem(new ArmorItem(HeroesArmorMaterial, EquipmentSlot.LEGS, new Item.Settings()), "heroes_leggings");
    public static final Item CUSTOM_MATERIAL_BOOTS = registerItem(new ArmorItem(HeroesArmorMaterial, EquipmentSlot.FEET, new Item.Settings()), "heroes_boots");

    public static void registerModItems() {
        TemplateMod.LOGGER.info("Registering Items for" + TemplateMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);


    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }
}
