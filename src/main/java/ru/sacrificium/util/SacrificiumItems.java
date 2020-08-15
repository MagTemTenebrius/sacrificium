package ru.sacrificium.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class SacrificiumItems {
    public static final RegistryObject<Item> TEST_ITEM = ObjectRegistration.ITEMS.register("test_item", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void itemRegister() {

    }
}
