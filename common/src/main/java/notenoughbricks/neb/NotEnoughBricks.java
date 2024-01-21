package notenoughbricks.neb;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

@SuppressWarnings("unused")
public class NotEnoughBricks {
    public static final String MOD_ID = "neb";


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, RegistryKeys.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void init() {

        //BLOCKS
        final RegistrySupplier<Block> help = BLOCKS.register("help", () ->
            new Block(Settings.create()));

        final RegistrySupplier<Block> help_stairs = BLOCKS.register("help_stairs", () ->
            new StairsBlock(help.get().getDefaultState(), Settings.create()));

        final RegistrySupplier<Block> help_slab = BLOCKS.register("help_slab", () ->
            new SlabBlock(Settings.create()));

        final RegistrySupplier<Block> help_wall = BLOCKS.register("help_wall", () ->
            new WallBlock(Settings.create()));

        BLOCKS.register();

        //ITEMS
        final RegistrySupplier<BlockItem> help_item = BLOCK_ITEMS.register("help", () ->
            new BlockItem(help.get(), new Item.Settings()));

        final RegistrySupplier<BlockItem> help_stairs_item = BLOCK_ITEMS.register("help_stairs", () ->
            new BlockItem(help_stairs.get(), new Item.Settings()));

        final RegistrySupplier<BlockItem> help_slab_item = BLOCK_ITEMS.register("help_slab", () ->
            new BlockItem(help_slab.get(), new Item.Settings()));

        final RegistrySupplier<BlockItem> help_wall_item = BLOCK_ITEMS.register("help_wall", () ->
            new BlockItem(help_wall.get(), new Item.Settings()));

        BLOCK_ITEMS.register();

        //OTHER
    }
}