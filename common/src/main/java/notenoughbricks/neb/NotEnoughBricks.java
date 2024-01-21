package notenoughbricks.neb;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

@SuppressWarnings("unused")
public class NotEnoughBricks {
    public static final String MOD_ID = "neb";

    public static void init() {
        final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, RegistryKeys.BLOCK);
        final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

        //BLOCKS
        final RegistrySupplier<Block> help = BLOCKS.register("help", () ->
            new Block(Settings.create().strength(4f)));

        BLOCKS.register();

        //ITEMS
        final RegistrySupplier<BlockItem> help_item = BLOCK_ITEMS.register("help", () ->
            new BlockItem(help.get(), new Item.Settings().maxCount(69)));

        BLOCK_ITEMS.register();

        //OTHER
    }
}
