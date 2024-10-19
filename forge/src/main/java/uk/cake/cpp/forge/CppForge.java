package uk.cake.cpp.forge;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import uk.cake.cpp.CreatePlusPlus;
import uk.cake.cpp.forge.registry.CppBlockEntities;
import uk.cake.cpp.forge.registry.CppBlocks;
import uk.cake.cpp.forge.registry.CppCreativeModeTabs;

@Mod(CreatePlusPlus.MOD_ID)
public class CppForge {
    
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreatePlusPlus.MOD_ID);
    
    public CppForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRATE.registerEventListeners(eventBus);
        CppCreativeModeTabs.register(eventBus);
        CreatePlusPlus.init();
        CppBlocks.register();
        CppBlockEntities.register();
    }
    
}
