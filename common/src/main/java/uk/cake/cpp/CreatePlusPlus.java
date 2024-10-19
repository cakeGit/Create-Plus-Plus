package uk.cake.cpp;

import com.simibubi.create.Create;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatePlusPlus {
    
    public static final String MOD_ID = "create_plus_plus";
    public static final String NAME = "Create++";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    
    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, CppExpectPlatform.platformName());
    }
    
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
    
}
