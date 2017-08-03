package primal_tech;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModSounds {
	public static SoundEvent BREAKING_STUFF;

	public static void init() {
		BREAKING_STUFF = new SoundEvent(new ResourceLocation("primal_tech", "breaking_stuff")).setRegistryName("primal_tech", "breaking_stuff");
	}

	@Mod.EventBusSubscriber(modid = "primal_tech")
	public static class RegistrationHandlerSounds {
		@SubscribeEvent
		public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
			event.getRegistry().registerAll(BREAKING_STUFF);
		}
	}
}