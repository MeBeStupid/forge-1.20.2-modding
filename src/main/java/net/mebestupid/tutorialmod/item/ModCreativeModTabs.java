package net.mebestupid.tutorialmod.item;

import net.mebestupid.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STUFF = CREATIVE_MODE_TABS.register("stuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CIRNU.get()))
                    .title(Component.translatable("creativetab.stuff_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CIRNU.get());
                        output.accept(ModItems.CIRNUCEPTION.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
