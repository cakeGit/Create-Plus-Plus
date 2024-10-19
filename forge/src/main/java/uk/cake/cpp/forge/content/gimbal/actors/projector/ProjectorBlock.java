package uk.cake.cpp.forge.content.gimbal.actors.projector;


import com.simibubi.create.foundation.block.IBE;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import uk.cake.cpp.forge.content.gimbal.components.foundation.IGimbalBlock;
import uk.cake.cpp.forge.registry.CppBlockEntities;

public class ProjectorBlock extends Block implements IGimbalBlock, IBE<ProjectorBlockEntity> {
    
    public ProjectorBlock(Properties properties) {
        super(properties);
    }
    
    @Override
    public Class<ProjectorBlockEntity> getBlockEntityClass() {
        return ProjectorBlockEntity.class;
    }
    
    @Override
    public BlockEntityType<? extends ProjectorBlockEntity> getBlockEntityType() {
        return CppBlockEntities.PROJECTOR.get();
    }
    
}
