package thegrimsilence.enderclock.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thegrimsilence.enderclock.blocks.EnderBlock;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block ENDER_BLOCK = new EnderBlock("ender_block", Material.ROCK);
}
