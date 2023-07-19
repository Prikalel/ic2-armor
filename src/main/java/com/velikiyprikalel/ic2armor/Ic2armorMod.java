package com.velikiyprikalel.ic2armor;

import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.Logger;

import com.velikiyprikalel.ic2armor.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ic2armorMod.MODID, name = Ic2armorMod.NAME, version = Ic2armorMod.VERSION)
public class Ic2armorMod {
    public static final String MODID = "ic2armor";
    public static final String NAME = "Industrial craft 2 Armor";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        ItemInit.registerItems();
    }
}