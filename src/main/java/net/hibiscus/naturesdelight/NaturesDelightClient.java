package net.hibiscus.naturesdelight;


import net.hibiscus.naturespirit.registration.NSBlocks;
import net.hibiscus.naturespirit.registration.NSRegistryHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = NaturesDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NaturesDelightClient {
    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(NaturesDelightBlocksAndItems.SHIITAKE_MUSHROOM_COLONY_BLOCK.get(), RenderType.cutout());
    }
}
