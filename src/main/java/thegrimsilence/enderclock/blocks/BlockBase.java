package thegrimsilence.enderclock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import thegrimsilence.enderclock.EnderClock;
import thegrimsilence.enderclock.init.ModBlocks;
import thegrimsilence.enderclock.init.ModItems;
import thegrimsilence.enderclock.util.IHasModel;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		EnderClock.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
