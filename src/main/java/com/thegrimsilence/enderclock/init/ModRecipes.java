package com.thegrimsilence.enderclock.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.ENDER_BLOCK, new ItemStack(ModItems.ENDER_CLOCK, 1), 1.5F);
	}
}
