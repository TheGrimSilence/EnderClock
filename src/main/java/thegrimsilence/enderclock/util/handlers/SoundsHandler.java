package thegrimsilence.enderclock.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import thegrimsilence.enderclock.util.Reference;

public class SoundsHandler {
	public static SoundEvent CHANGE_TIME;

	public static void registerSounds() {
		CHANGE_TIME = registerSound("change_time");
	}

	private static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
