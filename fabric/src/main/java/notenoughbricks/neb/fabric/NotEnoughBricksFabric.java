package notenoughbricks.neb.fabric;

import net.fabricmc.api.ModInitializer;
import notenoughbricks.neb.NotEnoughBricks;

@SuppressWarnings("unused")
public class NotEnoughBricksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NotEnoughBricks.init();
    }
}