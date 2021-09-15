package com.oldjimmy.setup;

import com.oldjimmy.addedlamps.AddedLamps;
import com.oldjimmy.items.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
//    public static final ResourceLocation DISTANCE_PROPERTY = new ResourceLocation(AddedLamps.MODID, "distance");

    public static void setup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            initTestItemOverrides();
        });
    }

    public static void initTestItemOverrides() {
        LightPickaxe light_pickaxe = Registration.LIGHTPICKAXE.get();
        LightHoe light_hoe = Registration.LIGHTHOE.get();
        LightAxe light_axe = Registration.LIGHTAXE.get();
        LightShovel light_shovel = Registration.LIGHTSHOVEL.get();
        LightSword light_sword = Registration.LIGHTSWORD.get();
        LightSource light_source = Registration.LIGHTSOURCE.get();
    }
}
