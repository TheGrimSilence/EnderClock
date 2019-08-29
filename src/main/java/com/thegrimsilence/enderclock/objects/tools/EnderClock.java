package com.thegrimsilence.enderclock.objects.tools;

import java.util.Timer;
import java.util.TimerTask;

import com.thegrimsilence.enderclock.items.ItemBase;
import com.thegrimsilence.enderclock.util.handlers.SoundsHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;;

public class EnderClock extends ItemBase {

	public EnderClock(String name) {
		super(name);
		
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		ResourceLocation location = new ResourceLocation("enderclock", "change_time");
		SoundEvent event = new SoundEvent(location);
		playerIn.playSound(event, 1.0F, 1.0F);
		
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				worldIn.setWorldTime(worldIn.getWorldTime() + 12000);
			}
		}, 4000);
//		worldIn.setWorldTime(worldIn.getWorldTime() + 12000);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
}
