package net.hibiscus.naturesdelight.mixin;

import net.hibiscus.naturesdelight.NaturesDelightBlocksAndItems;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vectorwing.farmersdelight.common.block.RichSoilBlock;


@Mixin(RichSoilBlock.class)
public class RichSoilBlockMixin {
   @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
   private void natures_delight$convertShiitakeToColony(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand, CallbackInfo ci) {
      BlockPos abovePos = pos.above();
      if (level.getBlockState(abovePos).is(NSBlocks.SHIITAKE_MUSHROOM.get())) {
         level.setBlockAndUpdate(abovePos, NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get().defaultBlockState());
         ci.cancel();
      }
   }

}
