package com.velikiyprikalel.ic2armor;

import com.velikiyprikalel.ic2armor.proxy.BaseProxy;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

import com.velikiyprikalel.ic2armor.tabs.Ic2armorTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Ic2armorMod.MOD_ID, name = Ic2armorMod.NAME, version = Ic2armorMod.VERSION)
public class Ic2armorMod {
    public static final String MOD_ID = "ic2armor";
    public static final String NAME = "Industrial craft 2 Armor";
    public static final String VERSION = "1.1";

    public static final CreativeTabs MOD_TAB = new Ic2armorTab();

    private static Logger logger;

    public static Logger Logger() {
        return logger;
    }

    @SidedProxy(clientSide = "com.velikiyprikalel.ic2armor.proxy.ClientProxy", serverSide = "com.velikiyprikalel.ic2armor.proxy.ServerProxy")
    private static BaseProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}