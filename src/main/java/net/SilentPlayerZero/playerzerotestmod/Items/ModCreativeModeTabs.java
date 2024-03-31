package net.SilentPlayerZero.playerzerotestmod.Items;

import net.SilentPlayerZero.playerzerotestmod.PlayerZeroTestMod;
import net.SilentPlayerZero.playerzerotestmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlayerZeroTestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PlayerZeroTestMod_TAB = CREATIVE_MODE_TABS.register("playerzerotestmod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BASIC_INGOT.get()))
                    .title(Component.translatable("creativetab.playerzerotestmod_tab"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.BASIC_INGOT.get());


                        output.accept(ModBlocks.BASIC_BLOCK.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
