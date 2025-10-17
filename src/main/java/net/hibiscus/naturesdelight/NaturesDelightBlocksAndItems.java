package net.hibiscus.naturesdelight;

import net.hibiscus.naturespirit.registration.NSRegistryHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.block.MushroomColonyBlock;
import vectorwing.farmersdelight.common.item.FuelBlockItem;
import vectorwing.farmersdelight.common.item.MushroomColonyItem;
import vectorwing.farmersdelight.common.registry.ModEffects;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Supplier;

public class NaturesDelightBlocksAndItems {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NaturesDelight.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NaturesDelight.MOD_ID);

    public static final DeferredBlock<Block> DESERT_TURNIP_CRATE_BLOCK = registerBlock("desert_turnip_crate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<MushroomColonyBlock> SHIITAKE_MUSHROOM_COLONY_BLOCK = registerBlock("shiitake_mushroom_colony", () -> new ShiitakeMushroomColonyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).lightLevel((state) -> 1).hasPostProcess(NSRegistryHelper::always).pushReaction(PushReaction.DESTROY)));
    
    public static final DeferredItem<BlockItem> DESERT_TURNIP_CRATE_ITEM = registerItem("desert_turnip_crate", () -> new BlockItem(DESERT_TURNIP_CRATE_BLOCK.get(), ModItems.basicItem()));
    public static final DeferredItem<MushroomColonyItem> SHIITAKE_MUSHROOM_COLONY_ITEM = registerItem("shiitake_mushroom_colony", () -> new MushroomColonyItem(SHIITAKE_MUSHROOM_COLONY_BLOCK.get(), ModItems.basicItem()));

    public static final DeferredBlock<ManakishBlock> MANAKISH_BLOCK = registerBlock("manakish", () -> new ManakishBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));
    public static final DeferredItem<BlockItem> MANAKISH_ITEM = registerItem("manakish", () -> new BlockItem(MANAKISH_BLOCK.get(), ModItems.basicItem()));

    public static final FoodProperties MANAKISH_SLICE = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).fast().build();
    public static final DeferredItem<Item> MANAKISH_SLICE_ITEM = registerItem("manakish_slice", () -> new Item(ModItems.foodItem(MANAKISH_SLICE)));
    public static final FoodProperties ALFREDO_PASTA = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final DeferredItem<Item> ALFREDO_PASTA_ITEM = registerItem("alfredo_pasta", () -> new Item(ModItems.bowlFoodItem(ALFREDO_PASTA)));
    public static final FoodProperties TURNIP_TAGINE = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.70f).effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F).build();
    public static final DeferredItem<Item> TURNIP_TAGINE_ITEM = registerItem("turnip_tagine", () -> new Item(ModItems.bowlFoodItem(TURNIP_TAGINE)));
    public static final DeferredItem<Item> COCONUT_SAUCE_ITEM = registerItem("coconut_sauce", () -> new Item(ModItems.bowlFoodItem(FoodValues.TOMATO_SAUCE)));
    public static final FoodProperties SWEET_AND_SAVORY_SAUTE = (new FoodProperties.Builder()).nutrition(14).saturationModifier(0.80f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final DeferredItem<Item> SWEET_AND_SAVORY_SAUTE_ITEM = registerItem("sweet_and_savory_saute", () -> new Item(ModItems.bowlFoodItem(SWEET_AND_SAVORY_SAUTE)));
    public static final FoodProperties FAFARU = (new FoodProperties.Builder()).nutrition(14).saturationModifier(0.8f).effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final DeferredItem<Item> FAFARU_ITEM = registerItem("fafaru", () -> new Item(ModItems.bowlFoodItem(FAFARU)));
    public static final FoodProperties COCONUT_PANCAKES = (new FoodProperties.Builder()).nutrition(10).saturationModifier(0.6f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final DeferredItem<Item> COCONUT_PANCAKES_ITEM = registerItem("coconut_pancakes", () -> new Item(ModItems.bowlFoodItem(COCONUT_PANCAKES)));
    public static final FoodProperties COCONUT_BREAD = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.6f).build();
    public static final DeferredItem<Item> COCONUT_BREAD_ITEM = registerItem("coconut_bread", () -> new Item(ModItems.foodItem(COCONUT_BREAD)));
    public static final FoodProperties COCADA = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.7f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.BRIEF_DURATION, 0), 0.5F).build();
    public static final DeferredItem<Item> COCADA_ITEM = registerItem("cocada", () -> new Item(ModItems.foodItem(COCADA)));

    public static final DeferredBlock<CabinetBlock> REDWOOD_CABINET = registerBlock("redwood_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> SUGI_CABINET = registerBlock("sugi_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> WISTERIA_CABINET = registerBlock("wisteria_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> FIR_CABINET = registerBlock("fir_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> WILLOW_CABINET = registerBlock("willow_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> ASPEN_CABINET = registerBlock("aspen_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> MAPLE_CABINET = registerBlock("maple_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> CYPRESS_CABINET = registerBlock("cypress_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> OLIVE_CABINET = registerBlock("olive_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> JOSHUA_CABINET = registerBlock("joshua_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> GHAF_CABINET = registerBlock("ghaf_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> PALO_VERDE_CABINET = registerBlock("palo_verde_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> COCONUT_CABINET = registerBlock("coconut_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> CEDAR_CABINET = registerBlock("cedar_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> LARCH_CABINET = registerBlock("larch_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> MAHOGANY_CABINET = registerBlock("mahogany_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredBlock<CabinetBlock> SAXAUL_CABINET = registerBlock("saxaul_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));

    public static final DeferredItem<FuelBlockItem> REDWOOD_CABINET_ITEM = registerItem("redwood_cabinet", () -> new FuelBlockItem(REDWOOD_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> SUGI_CABINET_ITEM = registerItem("sugi_cabinet", () -> new FuelBlockItem(SUGI_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> WISTERIA_CABINET_ITEM = registerItem("wisteria_cabinet", () -> new FuelBlockItem(WISTERIA_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> FIR_CABINET_ITEM = registerItem("fir_cabinet", () -> new FuelBlockItem(FIR_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> WILLOW_CABINET_ITEM = registerItem("willow_cabinet", () -> new FuelBlockItem(WILLOW_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> ASPEN_CABINET_ITEM = registerItem("aspen_cabinet", () -> new FuelBlockItem(ASPEN_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> MAPLE_CABINET_ITEM = registerItem("maple_cabinet", () -> new FuelBlockItem(MAPLE_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> CYPRESS_CABINET_ITEM = registerItem("cypress_cabinet", () -> new FuelBlockItem(CYPRESS_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> OLIVE_CABINET_ITEM = registerItem("olive_cabinet", () -> new FuelBlockItem(OLIVE_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> JOSHUA_CABINET_ITEM = registerItem("joshua_cabinet", () -> new FuelBlockItem(JOSHUA_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> GHAF_CABINET_ITEM = registerItem("ghaf_cabinet", () -> new FuelBlockItem(GHAF_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> PALO_VERDE_CABINET_ITEM = registerItem("palo_verde_cabinet", () -> new FuelBlockItem(PALO_VERDE_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> COCONUT_CABINET_ITEM = registerItem("coconut_cabinet", () -> new FuelBlockItem(COCONUT_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> CEDAR_CABINET_ITEM = registerItem("cedar_cabinet", () -> new FuelBlockItem(CEDAR_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> LARCH_CABINET_ITEM = registerItem("larch_cabinet", () -> new FuelBlockItem(LARCH_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> MAHOGANY_CABINET_ITEM = registerItem("mahogany_cabinet", () -> new FuelBlockItem(MAHOGANY_CABINET.get(), ModItems.basicItem(), 300));
    public static final DeferredItem<FuelBlockItem> SAXAUL_CABINET_ITEM = registerItem("saxaul_cabinet", () -> new FuelBlockItem(SAXAUL_CABINET.get(), ModItems.basicItem(), 300));


    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Item> DeferredItem<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
