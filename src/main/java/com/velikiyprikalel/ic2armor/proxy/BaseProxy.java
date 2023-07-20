package com.velikiyprikalel.ic2armor.proxy;

import com.velikiyprikalel.ic2armor.Ic2armorMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber(modid = Ic2armorMod.MODID)
public class BaseProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {

    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

    }

    public void registerRenderers() {

    }
}
