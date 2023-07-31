package com.velikiyprikalel.ic2armor.proxy;

import com.velikiyprikalel.ic2armor.Ic2armorMod;
import com.velikiyprikalel.ic2armor.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Ic2armorMod.MOD_ID)
public abstract class BaseProxy {
    private static final String ELECTRICITY_DAMAGE_TYPE = "electricity";

    protected abstract boolean isServerSide();

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
        event.getRegistry().registerAll(ItemInit.ITEM_LIST.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.ITEM_LIST)
        {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void damagePlayer(LivingHurtEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            if (event.getSource().getDamageType().equals(ELECTRICITY_DAMAGE_TYPE)) {
                if (IsInElectricalInsulationArmor(player)) {
                    Ic2armorMod.Logger().debug("Cancel electricity damage for player " + player.getName());
                    event.setCanceled(true);
                } else {
                    Ic2armorMod.Logger().debug("Get electricity damage by player " + player.getName() + " you need a full antielectricity armor to prevent this damage!");
                }
            }
        }
    }

    private static boolean IsInElectricalInsulationArmor(EntityPlayer player) {
        ItemStack headStack = player.inventory.armorItemInSlot(3);
        ItemStack chestStack = player.inventory.armorItemInSlot(2);
        ItemStack legsStack = player.inventory.armorItemInSlot(1);
        ItemStack feetStack = player.inventory.armorItemInSlot(0);

        return (headStack.getItem().equals(ItemInit.ANTIELECTRICITY_HELMET) &&
            chestStack.getItem().equals(ItemInit.ANTIELECTRICITY_CHESTPLATE) &&
            legsStack.getItem().equals(ItemInit.ANTIELECTRICITY_LEGGINGS) &&
            feetStack.getItem().equals(ItemInit.ANTIELECTRICITY_BOOTS));
    }
}
