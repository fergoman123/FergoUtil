package fergoman123.mods.fergoutil.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface ITool {

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo);
}
