package com.oldjimmy.setup;

import com.oldjimmy.items.*;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.oldjimmy.addedlamps.AddedLamps.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    //register tools
    public static final RegistryObject<LightPickaxe> LIGHTPICKAXE = ITEMS.register("light_pickaxe", () -> new LightPickaxe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<LightHoe> LIGHTHOE = ITEMS.register("light_hoe", () -> new LightHoe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<LightAxe> LIGHTAXE = ITEMS.register("light_axe", () -> new LightAxe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<LightShovel> LIGHTSHOVEL = ITEMS.register("light_shovel", () -> new LightShovel(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<LightSword> LIGHTSWORD = ITEMS.register("light_sword", () -> new LightSword(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    //public static final RegistryObject<LightSource> LIGHTSOURCE = ITEMS.register("light_source", () -> new LightSource(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).fireResistant()));
}