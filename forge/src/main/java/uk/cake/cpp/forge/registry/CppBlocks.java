package uk.cake.cpp.forge.registry;

import com.tterrag.registrate.util.entry.BlockEntry;
import uk.cake.cpp.forge.content.gimbal.actors.projector.ProjectorBlock;

import static uk.cake.cpp.forge.CppForge.REGISTRATE;

public class CppBlocks {
    
    public static final BlockEntry<ProjectorBlock> PROJECTOR = REGISTRATE
        .block("projector", ProjectorBlock::new)
        .simpleItem()
        .register();
    
    
    public static void register() {}
    
}
