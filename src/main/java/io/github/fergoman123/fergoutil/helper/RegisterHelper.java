package io.github.fergoman123.fergoutil.helper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public final class RegisterHelper
{
    public static void registerWorldGenerator(IWorldGenerator generator, int weight)
    {
        GameRegistry.registerWorldGenerator(generator, weight);
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, NameHelper.getUnwrappedUnlocalizedNameForRegistry(item.getUnlocalizedName()));
    }

    public static Block registerBlock(Block block)
    {
        return GameRegistry.registerBlock(block, NameHelper.getUnwrappedUnlocalizedNameForRegistry(block.getUnlocalizedName()));
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass)
    {
        return GameRegistry.registerBlock(block, itemBlockClass, NameHelper.getUnwrappedUnlocalizedNameForRegistry(block.getUnlocalizedName()));
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id)
    {
        GameRegistry.registerTileEntity(tileEntityClass, id);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }

    public static void registerOre(String name, Item ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, Block ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, ItemStack ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerGuiHandler(Object modInstance, IGuiHandler handler)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(modInstance, handler);
    }

    public static int getFuelValue(ItemStack stack)
    {
        return GameRegistry.getFuelValue(stack);
    }

    public static void registerEvent(Object event)
    {
        MinecraftForge.EVENT_BUS.register(event);
    }

}
