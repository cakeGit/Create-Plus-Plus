package uk.cake.cpp.forge.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.utility.Components;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uk.cake.cpp.CreatePlusPlus;
import uk.cake.cpp.forge.CppForge;

import java.util.stream.Collectors;

public class CppCreativeModeTabs {
    
    private static final DeferredRegister<CreativeModeTab> REGISTER =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePlusPlus.MOD_ID);
    
    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = REGISTER.register("tab",
        () -> CreativeModeTab.builder()
            .title(Components.translatable("itemGroup.create_plus_plus.base"))
            .withTabsBefore(AllCreativeModeTabs.PALETTES_CREATIVE_TAB.getKey())
            .icon(CppBlocks.PROJECTOR::asStack)
            .displayItems(new CppCreativeTabGenerator())
            .build());
    
    public static void register(IEventBus modEventBus) {
        REGISTER.register(modEventBus);
    }
    
    protected static class CppCreativeTabGenerator implements CreativeModeTab.DisplayItemsGenerator {
        
        @Override
        public void accept(CreativeModeTab.ItemDisplayParameters arg, CreativeModeTab.Output arg2) {
            arg2.acceptAll(
                CppForge.REGISTRATE.getAll(ForgeRegistries.Keys.ITEMS)
                    .stream()
                    .map(i -> i.get().getDefaultInstance())
//                    .filter(CREATIVE_TAB.get()::contains)
                    .collect(Collectors.toSet())
            );
        }
        
    }
    
}
