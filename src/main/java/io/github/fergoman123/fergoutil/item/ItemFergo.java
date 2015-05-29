package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ItemInfo;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFergo extends Item
{
    private int mod;
    private ItemInfo info;

    public ItemFergo(int mod, CreativeTabs tab, ItemInfo info)
    {
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(info.getName());
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void setMod(int mod)
    {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public ModelResourceLocation getModel()
    {
        return new ModelResourceLocation(this.info.getModel(), "inventory");
    }
}
