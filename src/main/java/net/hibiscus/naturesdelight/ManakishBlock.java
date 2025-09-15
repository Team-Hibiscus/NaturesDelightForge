package net.hibiscus.naturesdelight;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.block.PieBlock;

import javax.swing.text.html.BlockView;

public class ManakishBlock extends PieBlock {
   public ManakishBlock(Properties properties) {
      super(properties, null);
   }

   public @NotNull ItemStack getPieSliceItem() {
      return new ItemStack(NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get());
   }
   public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 1);

   protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 2.0D, 14.0D);

   public int getMaxBites() {
      return 2;
   }

   @Override
   public @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
      return SHAPE;
   }
}
