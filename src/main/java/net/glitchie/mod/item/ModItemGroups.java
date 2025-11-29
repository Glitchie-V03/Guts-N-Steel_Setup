package net.glitchie.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.glitchie.mod.GutsNSteel;
import net.glitchie.mod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GUTS_N_STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GutsNSteel.MOD_ID, "guts_n_steel_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                    .displayName(Text.translatable("itemgroup.guts-n-steel.guts-n-steel_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.RAW_STEEL);
                        entries.add(ModItems.PURE_STEEL_INGOT);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_STEEL_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        GutsNSteel.LOGGER.info("registering item groups for " + GutsNSteel.MOD_ID);
    }
}
