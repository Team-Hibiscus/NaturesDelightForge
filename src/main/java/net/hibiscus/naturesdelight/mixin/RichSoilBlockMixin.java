package net.hibiscus.naturesdelight.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.hibiscus.naturesdelight.NaturesDelightBlocksAndItems;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vectorwing.farmersdelight.common.block.RichSoilBlock;


@Mixin(RichSoilBlock.class)
public class RichSoilBlockMixin {
   @Inject(method = "randomTick", at = @At(value = "INVOKE", target = "Lnet/neoforged/neoforge/common/ModConfigSpec$DoubleValue;get()Ljava/lang/Object;", ordinal = 0), cancellable = true)
   private void onLanding(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand, CallbackInfo ci, @Local Block aboveBlock) {
         if (aboveBlock == NSBlocks.SHIITAKE_MUSHROOM.get()) {
            level.setBlockAndUpdate(pos.above(), NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get().defaultBlockState());
            ci.cancel();
         }
   }

}
