package com.arnold.pisunium.item;

import com.arnold.pisunium.Pisunium;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static  final Item Pisun = registerItem("penis", new Item(new Item.Settings()));
    public  static  final Item Cal = registerItem("cal", new Item(new Item.Settings()));
    public  static  final Item Svinette = registerItem("svinette", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Pisunium.MOD_ID, name), item);
    }

    public  static  void registerModItems( ){
        Pisunium.LOGGER.info("Registering Mod Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(Pisun);
            fabricItemGroupEntries.add(Cal);
            fabricItemGroupEntries.add(Svinette);
        });
    }
}
