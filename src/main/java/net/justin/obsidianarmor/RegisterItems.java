package net.justin.obsidianarmor;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class RegisterItems {
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
    public static final Item OBSIDIAN_HELMET = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());
    
    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("obsidianarmor", "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier("obsidianarmor", "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("obsidianarmor", "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("obsidianarmor", "obsidian_boots"), OBSIDIAN_BOOTS);
    }
}

