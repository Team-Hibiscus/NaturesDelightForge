package net.hibiscus.naturesdelight;


import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = NaturesDelight.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NaturesDelightClient {
    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get(), RenderType.cutout());
    }
}
