package com.velikiyprikalel.ic2armor.init;

import com.velikiyprikalel.ic2armor.Ic2armorMod;
import com.velikiyprikalel.ic2armor.item.*;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import ic2.core.item.type.IngotResourceType;

public class ItemInit {
    public static final IngotResourceType bronze = IngotResourceType.bronze; // Just to check that can be imported.

    public static final List<Item> ITEM_LIST = new ArrayList();

    // Armor materials
    public static final ArmorMaterial TIN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "armor_tin",
            Ic2armorMod.MOD_ID + ":tin",
            1500,
            new int[] { 4, 7, 9, 5 }, // TODO: adjust. (с ног до головы)
            17,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F);
    public static final ArmorMaterial LEAD_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "armor_lead",
            Ic2armorMod.MOD_ID + ":lead",
            1500,
            new int[] { 4, 7, 9, 5 },
            17,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F);

    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "armor_copper",
            Ic2armorMod.MOD_ID + ":copper",
            1500,
            new int[] { 4, 7, 9, 5 },
            17,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F);

    // Armor items : tin
    public static final Item TIN_HELMET = new ArmorBase("helmet_tin", TIN_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item TIN_CHESTPLATE = new ArmorBase("chestplate_tin", TIN_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item TIN_LEGGINGS = new ArmorBase("leggings_tin", TIN_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item TIN_BOOTS = new ArmorBase("boots_tin", TIN_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);

    // Armor items : lead
    public static final Item LEAD_HELMET = new ArmorBase("helmet_lead", LEAD_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LEAD_CHESTPLATE = new ArmorBase("chestplate_lead", LEAD_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEAD_LEGGINGS = new ArmorBase("leggings_lead", LEAD_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LEAD_BOOTS = new ArmorBase("boots_lead", LEAD_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);

    // Armor items : copper
    public static final Item COPPER_HELMET = new ArmorBase("helmet_copper", COPPER_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item COPPER_CHESTPLATE = new ArmorBase("chestplate_copper", COPPER_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item COPPER_LEGGINGS = new ArmorBase("leggings_copper", COPPER_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item COPPER_BOOTS = new ArmorBase("boots_copper", COPPER_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);
}