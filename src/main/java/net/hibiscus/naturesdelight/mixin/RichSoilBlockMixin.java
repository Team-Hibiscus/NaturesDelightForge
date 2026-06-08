package net.hibiscus.naturesdelight.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.hibiscus.naturesdelight.NaturesDelightBlocksAndItems;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import vectorwing.farmersdelight.common.block.RichSoilBlock;


@Mixin(RichSoilBlock.class)
public class RichSoilBlockMixin {
    @WrapMethod(method = "convertMushroomToColony")
    private boolean convertShiitakeMushroomToColony(BlockState targetState, BlockPos targetPos, ServerLevel level, Operation<Boolean> original) {
        if (original.call(targetState, targetPos, level)) {
            return true;
        } else if (targetState.is(NSBlocks.SHIITAKE_MUSHROOM.get())) {
            level.setBlockAndUpdate(targetPos, NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get().defaultBlockState());
            return true;
        }
        return false;
    }

}
