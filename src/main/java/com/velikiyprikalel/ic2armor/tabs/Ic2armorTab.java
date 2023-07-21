package com.velikiyprikalel.ic2armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static com.velikiyprikalel.ic2armor.init.ItemInit.TIN_CHESTPLATE;

public class Ic2armorTab extends CreativeTabs {

    public Ic2armorTab() {
		super("ic2armortab");
		this.setBackgroundImageName("ic2armor.png");
	}

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(TIN_CHESTPLATE);
    }
    
}
