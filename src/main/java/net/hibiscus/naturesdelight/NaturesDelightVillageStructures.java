package net.hibiscus.naturesdelight;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import vectorwing.farmersdelight.common.Configuration;

import java.util.ArrayList;
import java.util.List;

public class NaturesDelightVillageStructures {
   public NaturesDelightVillageStructures() {
   }
   public static void addNewVillageBuilding(ServerAboutToStartEvent event) {
      if (!Configuration.GENERATE_VILLAGE_COMPOST_HEAPS.get()) {
         return;
      }

      Registry<StructureTemplatePool> templatePools = (Registry) event.getServer().registryAccess().registry(Registries.TEMPLATE_POOL).get();
      Registry<StructureProcessorList> processorLists = (Registry) event.getServer().registryAccess().registry(Registries.PROCESSOR_LIST).get();

      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "lime_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "red_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "cyan_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "light_blue_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "crack_10_percent"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "pink_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/cypress/houses"), NaturesDelight.MOD_ID + ":village/houses/cypress_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "yellow_kaolin"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/wisteria/houses"), NaturesDelight.MOD_ID + ":village/houses/wisteria_compost_pile", ResourceLocation.parse("mossify_10_percent"), 3);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/coconut/houses"), NaturesDelight.MOD_ID + ":village/houses/coconut_compost_pile", ResourceLocation.parse("empty"),4);
      addBuildingToPool(templatePools, processorLists, ResourceLocation.parse("natures_spirit:village/adobe/adobe_houses_layer_1_back"), NaturesDelight.MOD_ID + ":village/houses/adobe_compost_pile", ResourceLocation.fromNamespaceAndPath("natures_spirit", "fix_button"),3);
   }

   public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry, Registry<StructureProcessorList> processorListRegistry, ResourceLocation poolRL, String nbtPieceRL, ResourceLocation processor, int weight) {
      StructureTemplatePool pool = (StructureTemplatePool)templatePoolRegistry.get(poolRL);
      if (pool != null) {
         Holder<StructureProcessorList> processorHolder = processorListRegistry.getHolderOrThrow(ResourceKey.create(Registries.PROCESSOR_LIST, processor));
         SinglePoolElement piece = (SinglePoolElement)SinglePoolElement.single(nbtPieceRL, processorHolder).apply(StructureTemplatePool.Projection.RIGID);

         for(int i = 0; i < weight; ++i) {
            pool.templates.add(piece);
         }

         List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList(pool.rawTemplates);
         listOfPieceEntries.add(new Pair(piece, weight));
         pool.rawTemplates = listOfPieceEntries;
      }
   }

}
