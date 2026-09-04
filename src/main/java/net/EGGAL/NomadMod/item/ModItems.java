package net.EGGAL.NomadMod.item;

import net.EGGAL.NomadMod.NomadMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NomadMod.MOD_ID);

public static final DeferredItem<Item> DIRT2 = ITEMS.register("dirt2",
        () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
