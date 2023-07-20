package com.velikiyprikalel.ic2armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Ic2armorTab extends CreativeTabs {

    public Ic2armorTab() {
		super("ic2armortab");
		this.setBackgroundImageName("ic2armor.png");
	}

    @Override
    public ItemStack getTabIconItem() {
        // TODO: add tab translation.
        return new ItemStack(Items.IRON_INGOT);
    }
    
}
