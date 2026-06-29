package net.hibiscus.naturesdelight.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.hibiscus.naturesdelight.NaturesDelightBlocksAndItems;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vectorwing.farmersdelight.common.block.RichSoilBlock;


@Mixin(RichSoilBlock.class)
public class RichSoilBlockMixin {
    @Inject(method = "convertMushroomToColony", at = @At(value = "HEAD"), cancellable = true)
    private void convertMushroomToColony(BlockState targetState, BlockPos targetPos, ServerLevel level, CallbackInfoReturnable<Boolean> cir) {
        if (targetState.is(NSBlocks.SHIITAKE_MUSHROOM)) {
            level.setBlockAndUpdate(targetPos, NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get().defaultBlockState());
            cir.setReturnValue(true);
        }
    }

}
