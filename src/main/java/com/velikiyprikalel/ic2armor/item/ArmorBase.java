package com.velikiyprikalel.ic2armor.item;

import com.velikiyprikalel.ic2armor.Ic2armorMod;
import com.velikiyprikalel.ic2armor.init.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Ic2armorMod.MOD_TAB);

        ItemInit.ITEM_LIST.add(this);
    }
}
