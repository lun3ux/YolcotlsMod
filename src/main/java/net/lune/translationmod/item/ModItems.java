package net.lune.translationmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lune.translationmod.TemplateMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    public static final RegistryKey<Item> GUIDITE_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, "guidite_helmet"));
    public static final Item GUIDITE_HELMET = register(new ArmorItem(GuiditeArmorMaterial.INSTANCE, EquipmentType.HELMET, new Item.Settings().registryKey(GUIDITE_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(HEROESARMOR.BASE_DURABILITY))), GUIDITE_HELMET_KEY);

    public static final RegistryKey<Item> GUIDITE_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, "guidite_chestplate"));
    public static final Item GUIDITE_CHESTPLATE = register(new ArmorItem(GuiditeArmorMaterial.INSTANCE, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(GUIDITE_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(HEROESARMOR.BASE_DURABILITY))), GUIDITE_CHESTPLATE_KEY);

    public static final RegistryKey<Item> GUIDITE_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, "guidite_leggings"));
    public static final Item GUIDITE_LEGGINGS = register(new ArmorItem(GuiditeArmorMaterial.INSTANCE, EquipmentType.LEGGINGS, new Item.Settings().registryKey(GUIDITE_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(HEROESARMOR.BASE_DURABILITY))), GUIDITE_LEGGINGS_KEY);

    public static final RegistryKey<Item> GUIDITE_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, "guidite_boots"));
    public static final Item GUIDITE_BOOTS = register(new ArmorItem(GuiditeArmorMaterial.INSTANCE, EquipmentType.BOOTS, new Item.Settings().registryKey(GUIDITE_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(HEROESARMOR.BASE_DURABILITY))), GUIDITE_BOOTS_KEY);

    public static void registerModItems() {
        TemplateMod.LOGGER.info("Registering Items for" + TemplateMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);


    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }
}
