package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "ghosterorebarkmod";
    public static final String NAME = "Ghoster Orebark Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    // Custom tool material
    public static Item.ToolMaterial toolMaterial;
    public static Item ghostersFlesh;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        toolMaterial = EnumHelper.addToolMaterial("Ghoster's Flesh", 4, 666666, 20, 66, 30);
        ghostersFlesh = new GhostersFleshSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
