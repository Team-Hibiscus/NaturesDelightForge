package net.hibiscus.naturesdelight;

import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.block.MushroomColonyBlock;
import vectorwing.farmersdelight.common.block.entity.CabinetBlockEntity;
import vectorwing.farmersdelight.common.item.FuelBlockItem;
import vectorwing.farmersdelight.common.item.MushroomColonyItem;
import vectorwing.farmersdelight.common.registry.ModEffects;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Supplier;

public class NaturesDelightBlocksAndItems {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, NaturesDelight.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, NaturesDelight.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, NaturesDelight.MOD_ID);

    public static final RegistryObject<Block> DESERT_TURNIP_CRATE_BLOCK = registerBlock("desert_turnip_crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SHIITAKE_MUSHROOM_COLONY_BLOCK = registerBlock("shiitake_mushroom_colony", () -> new MushroomColonyBlock(BlockBehaviour.Properties.copy(NSBlocks.SHIITAKE_MUSHROOM.get()), NSBlocks.SHIITAKE_MUSHROOM.get()::asItem));
    
    public static final RegistryObject<Item> DESERT_TURNIP_CRATE_ITEM = registerItem("desert_turnip_crate", () -> new BlockItem(DESERT_TURNIP_CRATE_BLOCK.get(), ModItems.basicItem()));
    public static final RegistryObject<Item> SHIITAKE_MUSHROOM_COLONY_ITEM = registerItem("shiitake_mushroom_colony", () -> new MushroomColonyItem(SHIITAKE_MUSHROOM_COLONY_BLOCK.get(), ModItems.basicItem()));

    public static final RegistryObject<Block> MANAKISH_BLOCK = registerBlock("manakish", () -> new ManakishBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Item> MANAKISH_ITEM = registerItem("manakish", () -> new BlockItem(MANAKISH_BLOCK.get(), ModItems.basicItem()));

    public static final FoodProperties MANAKISH_SLICE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f).fast().build();
    public static final RegistryObject<Item> MANAKISH_SLICE_ITEM = registerItem("manakish_slice", () -> new Item(ModItems.foodItem(MANAKISH_SLICE)));
    public static final FoodProperties ALFREDO_PASTA = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final RegistryObject<Item> ALFREDO_PASTA_ITEM = registerItem("alfredo_pasta", () -> new Item(ModItems.bowlFoodItem(ALFREDO_PASTA)));
    public static final FoodProperties TURNIP_TAGINE = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.70f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.MEDIUM_DURATION, 0), 1.0F).build();
    public static final RegistryObject<Item> TURNIP_TAGINE_ITEM = registerItem("turnip_tagine", () -> new Item(ModItems.bowlFoodItem(TURNIP_TAGINE)));
    public static final RegistryObject<Item> COCONUT_SAUCE_ITEM = registerItem("coconut_sauce", () -> new Item(ModItems.bowlFoodItem(FoodValues.TOMATO_SAUCE)));
    public static final FoodProperties SWEET_AND_SAVORY_SAUTE = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.80f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final RegistryObject<Item> SWEET_AND_SAVORY_SAUTE_ITEM = registerItem("sweet_and_savory_saute", () -> new Item(ModItems.bowlFoodItem(SWEET_AND_SAVORY_SAUTE)));
    public static final FoodProperties FAFARU = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.8f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final RegistryObject<Item> FAFARU_ITEM = registerItem("fafaru", () -> new Item(ModItems.bowlFoodItem(FAFARU)));
    public static final FoodProperties COCONUT_PANCAKES = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final RegistryObject<Item> COCONUT_PANCAKES_ITEM = registerItem("coconut_pancakes", () -> new Item(ModItems.bowlFoodItem(COCONUT_PANCAKES)));
    public static final FoodProperties COCONUT_BREAD = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6f).build();
    public static final RegistryObject<Item> COCONUT_BREAD_ITEM = registerItem("coconut_bread", () -> new Item(ModItems.foodItem(COCONUT_BREAD)));
    public static final FoodProperties COCADA = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.7f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.BRIEF_DURATION, 0), 0.5F).build();
    public static final RegistryObject<Item> COCADA_ITEM = registerItem("cocada", () -> new Item(ModItems.foodItem(COCADA)));

    public static final RegistryObject<Block> REDWOOD_CABINET = registerBlock("redwood_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SUGI_CABINET = registerBlock("sugi_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WISTERIA_CABINET = registerBlock("wisteria_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> FIR_CABINET = registerBlock("fir_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WILLOW_CABINET = registerBlock("willow_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ASPEN_CABINET = registerBlock("aspen_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MAPLE_CABINET = registerBlock("maple_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CYPRESS_CABINET = registerBlock("cypress_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OLIVE_CABINET = registerBlock("olive_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JOSHUA_CABINET = registerBlock("joshua_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GHAF_CABINET = registerBlock("ghaf_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> PALO_VERDE_CABINET = registerBlock("palo_verde_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> COCONUT_CABINET = registerBlock("coconut_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CEDAR_CABINET = registerBlock("cedar_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> LARCH_CABINET = registerBlock("larch_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MAHOGANY_CABINET = registerBlock("mahogany_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SAXAUL_CABINET = registerBlock("saxaul_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));

    public static final RegistryObject<Item> REDWOOD_CABINET_ITEM = registerItem("redwood_cabinet", () -> new FuelBlockItem(REDWOOD_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> SUGI_CABINET_ITEM = registerItem("sugi_cabinet", () -> new FuelBlockItem(SUGI_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> WISTERIA_CABINET_ITEM = registerItem("wisteria_cabinet", () -> new FuelBlockItem(WISTERIA_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> FIR_CABINET_ITEM = registerItem("fir_cabinet", () -> new FuelBlockItem(FIR_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> WILLOW_CABINET_ITEM = registerItem("willow_cabinet", () -> new FuelBlockItem(WILLOW_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> ASPEN_CABINET_ITEM = registerItem("aspen_cabinet", () -> new FuelBlockItem(ASPEN_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> MAPLE_CABINET_ITEM = registerItem("maple_cabinet", () -> new FuelBlockItem(MAPLE_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> CYPRESS_CABINET_ITEM = registerItem("cypress_cabinet", () -> new FuelBlockItem(CYPRESS_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> OLIVE_CABINET_ITEM = registerItem("olive_cabinet", () -> new FuelBlockItem(OLIVE_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> JOSHUA_CABINET_ITEM = registerItem("joshua_cabinet", () -> new FuelBlockItem(JOSHUA_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> GHAF_CABINET_ITEM = registerItem("ghaf_cabinet", () -> new FuelBlockItem(GHAF_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> PALO_VERDE_CABINET_ITEM = registerItem("palo_verde_cabinet", () -> new FuelBlockItem(PALO_VERDE_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> COCONUT_CABINET_ITEM = registerItem("coconut_cabinet", () -> new FuelBlockItem(COCONUT_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> CEDAR_CABINET_ITEM = registerItem("cedar_cabinet", () -> new FuelBlockItem(CEDAR_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> LARCH_CABINET_ITEM = registerItem("larch_cabinet", () -> new FuelBlockItem(LARCH_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> MAHOGANY_CABINET_ITEM = registerItem("mahogany_cabinet", () -> new FuelBlockItem(MAHOGANY_CABINET.get(), ModItems.basicItem(), 300));
    public static final RegistryObject<Item> SAXAUL_CABINET_ITEM = registerItem("saxaul_cabinet", () -> new FuelBlockItem(SAXAUL_CABINET.get(), ModItems.basicItem(), 300));

    public static final RegistryObject<BlockEntityType<CabinetBlockEntity>> CABINET = BLOCK_ENTITIES.register("cabinet", () -> BlockEntityType.Builder.of(CabinetBlockEntity::new,
            REDWOOD_CABINET.get(),
            SUGI_CABINET.get(),
            WISTERIA_CABINET.get(),
            FIR_CABINET.get(),
            WILLOW_CABINET.get(),
            ASPEN_CABINET.get(),
            MAPLE_CABINET.get(),
            CYPRESS_CABINET.get(),
            OLIVE_CABINET.get(),
            JOSHUA_CABINET.get(),
            GHAF_CABINET.get(),
            PALO_VERDE_CABINET.get(),
            COCONUT_CABINET.get(),
            CEDAR_CABINET.get(),
            LARCH_CABINET.get(),
            MAHOGANY_CABINET.get(),
            SAXAUL_CABINET.get()).build(null));


    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
}
