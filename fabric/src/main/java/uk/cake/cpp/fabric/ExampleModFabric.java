package uk.cake.cpp.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import uk.cake.cpp.CreatePlusPlusRegistry;
import uk.cake.cpp.CreatePlusPlus;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreatePlusPlus.init();
        CreatePlusPlus.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreatePlusPlus.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        CreatePlusPlusRegistry.REGISTRATE.register();
    }
}
