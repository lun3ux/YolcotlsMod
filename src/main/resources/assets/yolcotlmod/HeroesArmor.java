
package net.lune.translationmod.item;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public static final ArmorMaterial HEROESARMOR = new ArmorMaterial(
        BASE_DURABILITY,
        Map.of(
                EquipmentType.HELMET, 3,
                EquipmentType.CHESTPLATE, 8,
                EquipmentType.LEGGINGS, 6,
                EquipmentType.BOOTS, 3
        ),
        5,
        SoundEvents.ITEM_ARMOR_EQUIP_IRON,
        0.0F,
        0.0F,
        REPAIRS_GUIDITE_ARMOR,
        GUIDITE_ARMOR_MATERIAL_KEY
);