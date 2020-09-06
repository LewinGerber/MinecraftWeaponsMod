package ch.hyperreal.nawm.util;

import ch.hyperreal.nawm.MinecraftWeaponsMod;
import ch.hyperreal.nawm.client.render.kappa_creeper_render.KappaCreeperRender;
import ch.hyperreal.nawm.client.render.RaccoonRender;
import ch.hyperreal.nawm.init.BlockInit;
import ch.hyperreal.nawm.init.ModEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MinecraftWeaponsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.MAGIC_MUSHROOM_CROP.get(), RenderType.getCutout());

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RACCOON.get(), RaccoonRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.KAPPA_CREEPER.get(), KappaCreeperRender::new);
    }
}
