package notenoughbricks.neb.forge;

import dev.architectury.platform.forge.EventBuses;
import notenoughbricks.neb.NotEnoughBricks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NotEnoughBricks.MOD_ID)
public class NotEnoughBricksForge {
    public NotEnoughBricksForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(NotEnoughBricks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        NotEnoughBricks.init();
    }
}