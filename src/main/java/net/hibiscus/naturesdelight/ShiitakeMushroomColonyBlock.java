package net.hibiscus.naturesdelight;

import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import vectorwing.farmersdelight.common.block.MushroomColonyBlock;

public class ShiitakeMushroomColonyBlock extends MushroomColonyBlock {

    public ShiitakeMushroomColonyBlock(Properties properties) {
        super(Holder.direct(null), properties);
    }


    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return NSBlocks.SHIITAKE_MUSHROOM.toStack();
    }
}
