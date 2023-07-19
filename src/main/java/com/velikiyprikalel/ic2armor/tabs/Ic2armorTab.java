package com.velikiyprikalel.ic2armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Ic2armorTab extends CreativeTabs {

    public Ic2armorTab() 
	{
		super("creativetab");
		this.setBackgroundImageName("creativetab.png");
	}

    @Override
    public ItemStack getTabIconItem() {
        // TODO Set item to show + add tab translation.
        return new ItemStack(ItemInit.OBSIDIAN_INGOT);
    }
    
}
