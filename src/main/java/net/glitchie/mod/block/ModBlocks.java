package net.glitchie.mod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.glitchie.mod.GutsNSteel;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(AbstractBlock.Settings.create().strength(4.0F, 5.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block ANTH_COAL_DEEPSLATE_ORE = registerBlock("anth_coal_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(5.5f, 4.0f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block ANTH_COAL_BLOCK = registerBlock("anth_coal_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(5.5f, 6.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GutsNSteel.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GutsNSteel.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GutsNSteel.LOGGER.info("Registering Mod Blocks for " + GutsNSteel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.STEEL_BLOCK);
            entries.add(ModBlocks.RAW_STEEL_BLOCK);

        });
    }
}
