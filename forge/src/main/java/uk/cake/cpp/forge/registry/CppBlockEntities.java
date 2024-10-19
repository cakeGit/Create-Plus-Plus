package uk.cake.cpp.forge.registry;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import uk.cake.cpp.forge.content.gimbal.actors.projector.ProjectorBlockEntity;

import static uk.cake.cpp.forge.CppForge.REGISTRATE;

public class CppBlockEntities {
    
    public static final BlockEntityEntry<ProjectorBlockEntity> PROJECTOR = REGISTRATE
        .blockEntity("projector", ProjectorBlockEntity::new)
        .validBlocks(CppBlocks.PROJECTOR)
        .register();
    
    public static void register() {}
    
}
