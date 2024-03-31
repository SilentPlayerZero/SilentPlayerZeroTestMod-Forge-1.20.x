package net.SilentPlayerZero.playerzerotestmod.Items;

import net.SilentPlayerZero.playerzerotestmod.PlayerZeroTestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlayerZeroTestMod.MOD_ID);

    public static final RegistryObject<Item> BASIC_INGOT = ITEMS.register("basic_ingot",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
