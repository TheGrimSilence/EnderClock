package thegrimsilence.enderclock.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnderBlock extends BlockBase {
	public EnderBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(5.0F);
		setResistance(15.0F);
		// It will only drop an item with a pick as strong as iron or tougher
		setHarvestLevel("pickaxe", 2);
		// As bright as a Beacon
		setLightLevel(1.0F);

	}
}
