package net.glitchie.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.glitchie.mod.GutsNSteel;
import net.glitchie.mod.item.custom.ChiselItem;
import net.glitchie.mod.item.custom.SandPaperItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new Item.Settings()));
    public static final Item PURE_STEEL_INGOT = registerItem("pure_steel_ingot", new Item(new Item.Settings()));
    public static final Item ANTH_COAL = registerItem("anth_coal", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item SANDPAPER = registerItem("sandpaper", new SandPaperItem(new Item.Settings().maxDamage(32)));



private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(GutsNSteel.MOD_ID, name), item);
}


    public static void registerModItems() {
        GutsNSteel.LOGGER.info("registering mod items for " + GutsNSteel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_INGOT);
            fabricItemGroupEntries.add(RAW_STEEL);
            fabricItemGroupEntries.add(PURE_STEEL_INGOT);
            fabricItemGroupEntries.add(ANTH_COAL);
        });
    }
}
