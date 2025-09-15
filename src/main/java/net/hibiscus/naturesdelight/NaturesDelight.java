package net.hibiscus.naturesdelight;

import net.hibiscus.naturespirit.NatureSpirit;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.hibiscus.naturespirit.registration.NSItemGroups;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;


@Mod(NaturesDelight.MOD_ID)
public class NaturesDelight {

    public static final String MOD_ID = "natures_delight";

    public NaturesDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        NaturesDelightBlocksAndItems.BLOCKS.register(modEventBus);
        NaturesDelightBlocksAndItems.ITEMS.register(modEventBus);
        NaturesDelightBlocksAndItems.BLOCK_ENTITIES.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::creativeInventory);

        MinecraftForge.EVENT_BUS.addListener(NaturesDelightVillageStructures::addNewVillageBuilding);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_ITEM.get(), 1.0F);
        });
    }
    public void creativeInventory(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(NatureSpirit.MOD_ID, "ns_item_group"))) {
            event.getEntries().putAfter(NSBlocks.DESERT_TURNIP_BLOCK.get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.DESERT_TURNIP_CRATE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.SHIITAKE_MUSHROOM.get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.QUARTER_PIZZA.get().getDefaultInstance(), NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCADA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.REDWOOD.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.REDWOOD_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.SUGI.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SUGI_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.WISTERIA.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.WISTERIA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.FIR.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.FIR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.WILLOW.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.WILLOW_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.ASPEN.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.ASPEN_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.MAPLE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.MAPLE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.CYPRESS.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.CYPRESS_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.OLIVE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.OLIVE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.JOSHUA.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.JOSHUA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.GHAF.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.GHAF_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.PALO_VERDE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.PALO_VERDE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.COCONUT.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.CEDAR.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.CEDAR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.LARCH.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.LARCH_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.MAHOGANY.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.MAHOGANY_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(NSBlocks.SAXAUL.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SAXAUL_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
        }
        if (event.getTabKey() == ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey()) {
            event.getEntries().put(NaturesDelightBlocksAndItems.DESERT_TURNIP_CRATE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.COCADA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.REDWOOD_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.SUGI_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.WISTERIA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.FIR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.WILLOW_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.ASPEN_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.MAPLE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.CYPRESS_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.OLIVE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.JOSHUA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.GHAF_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.PALO_VERDE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.COCONUT_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.CEDAR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.LARCH_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.MAHOGANY_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(NaturesDelightBlocksAndItems.SAXAUL_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
