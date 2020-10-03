package com.emeraldodin.GhosterOrebarkMod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("ghosterorebarkmod")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhosterOrebarkMod {
    public static final String NAME = "ghosterorebarkmod";
    public static Logger LOGGER = LogManager.getLogger();

    public GhosterOrebarkMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    public static void register() {
        LOGGER.info("CoolMod: register");
        Minecraft minecraftClient = Minecraft.getInstance();
    }

    private void commonSetup(FMLCommonSetupEvent e) {
        LOGGER.debug("common setup start...");
        LOGGER.debug("common setup done.");
    }

    private void clientSetup(FMLClientSetupEvent e) {
        LOGGER.debug("client setup start...");
        LOGGER.debug("client setup done.");
    }
}