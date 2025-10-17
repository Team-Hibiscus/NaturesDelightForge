package net.hibiscus.naturesdelight;

import net.hibiscus.naturespirit.NatureSpirit;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import vectorwing.farmersdelight.common.registry.ModBlockEntityTypes;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;


@Mod(NaturesDelight.MOD_ID)
public class NaturesDelight {

    public static final String MOD_ID = "natures_delight";

    public NaturesDelight() {
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        assert modEventBus != null;
        NaturesDelightBlocksAndItems.BLOCKS.register(modEventBus);
        NaturesDelightBlocksAndItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::creativeInventory);
        modEventBus.addListener(this::blockTypes);

        NeoForge.EVENT_BUS.addListener(NaturesDelightVillageStructures::addNewVillageBuilding);
    }

    public void blockTypes(BlockEntityTypeAddBlocksEvent event) {
        event.modify(ModBlockEntityTypes.CABINET.get(),
                NaturesDelightBlocksAndItems.REDWOOD_CABINET.get(),
                NaturesDelightBlocksAndItems.SUGI_CABINET.get(),
                NaturesDelightBlocksAndItems.WISTERIA_CABINET.get(),
                NaturesDelightBlocksAndItems.FIR_CABINET.get(),
                NaturesDelightBlocksAndItems.WILLOW_CABINET.get(),
                NaturesDelightBlocksAndItems.ASPEN_CABINET.get(),
                NaturesDelightBlocksAndItems.MAPLE_CABINET.get(),
                NaturesDelightBlocksAndItems.CYPRESS_CABINET.get(),
                NaturesDelightBlocksAndItems.OLIVE_CABINET.get(),
                NaturesDelightBlocksAndItems.JOSHUA_CABINET.get(),
                NaturesDelightBlocksAndItems.GHAF_CABINET.get(),
                NaturesDelightBlocksAndItems.PALO_VERDE_CABINET.get(),
                NaturesDelightBlocksAndItems.COCONUT_CABINET.get(),
                NaturesDelightBlocksAndItems.CEDAR_CABINET.get(),
                NaturesDelightBlocksAndItems.LARCH_CABINET.get(),
                NaturesDelightBlocksAndItems.MAHOGANY_CABINET.get(),
                NaturesDelightBlocksAndItems.SAXAUL_CABINET.get()
        );
    }


    public void creativeInventory(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(NatureSpirit.MOD_ID, "ns_item_group"))) {
            event.insertAfter(NSBlocks.DESERT_TURNIP_BLOCK.get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.DESERT_TURNIP_CRATE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.SHIITAKE_MUSHROOM.get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.QUARTER_PIZZA.get().getDefaultInstance(), NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), NaturesDelightBlocksAndItems.COCADA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.REDWOOD.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.REDWOOD_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.SUGI.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SUGI_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.WISTERIA.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.WISTERIA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.FIR.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.FIR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.WILLOW.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.WILLOW_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.ASPEN.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.ASPEN_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.MAPLE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.MAPLE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.CYPRESS.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.CYPRESS_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.OLIVE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.OLIVE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.JOSHUA.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.JOSHUA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.GHAF.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.GHAF_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.PALO_VERDE.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.PALO_VERDE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.COCONUT.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.COCONUT_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.CEDAR.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.CEDAR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.LARCH.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.LARCH_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.MAHOGANY.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.MAHOGANY_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.insertAfter(NSBlocks.SAXAUL.getPlanks().get().asItem().getDefaultInstance(), NaturesDelightBlocksAndItems.SAXAUL_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
        }
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get()) {
            event.accept(NaturesDelightBlocksAndItems.DESERT_TURNIP_CRATE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.MANAKISH_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.MANAKISH_SLICE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.ALFREDO_PASTA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.TURNIP_TAGINE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.COCONUT_SAUCE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.SWEET_AND_SAVORY_SAUTE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.FAFARU_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.COCONUT_PANCAKES_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.COCONUT_BREAD_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.COCADA_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.REDWOOD_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.SUGI_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.WISTERIA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.FIR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.WILLOW_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.ASPEN_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.MAPLE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.CYPRESS_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.OLIVE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.JOSHUA_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.GHAF_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.PALO_VERDE_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.COCONUT_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.CEDAR_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.LARCH_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.MAHOGANY_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(NaturesDelightBlocksAndItems.SAXAUL_CABINET_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
