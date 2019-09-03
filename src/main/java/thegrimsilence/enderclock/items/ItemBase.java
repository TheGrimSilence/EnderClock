package thegrimsilence.enderclock.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thegrimsilence.enderclock.EnderClock;
import thegrimsilence.enderclock.init.ModItems;
import thegrimsilence.enderclock.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		EnderClock.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
