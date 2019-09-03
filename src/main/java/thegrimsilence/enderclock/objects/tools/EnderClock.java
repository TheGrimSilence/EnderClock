package thegrimsilence.enderclock.objects.tools;

import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import thegrimsilence.enderclock.items.ItemBase;

public class EnderClock extends ItemBase {
	Boolean isActive;

	public EnderClock(String name) {
		super(name);
		setNoRepair();
		setMaxStackSize(1);
		setMaxDamage(8);
		this.isActive = false;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		ResourceLocation location = new ResourceLocation("enderclock", "change_time");
		SoundEvent event = new SoundEvent(location);

		item.damageItem(1, playerIn);
		playerIn.playSound(event, 1.0F, 1.0F);

		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				worldIn.setWorldTime(worldIn.getWorldTime() + 12000);
				isActive = false;
			}
		}, 4000);

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

}
