package com.oldjimmy.datagen;

import com.oldjimmy.addedlamps.AddedLamps;
import com.oldjimmy.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.rmi.registry.Registry;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AddedLamps.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(
                Registration.LIGHTPICKAXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(AddedLamps.MODID, "item/light_pickaxe"));

        singleTexture(
                Registration.LIGHTHOE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(AddedLamps.MODID, "item/light_hoe"));

        singleTexture(
                Registration.LIGHTAXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(AddedLamps.MODID, "item/light_axe"));

        singleTexture(
                Registration.LIGHTSHOVEL.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(AddedLamps.MODID, "item/light_shovel"));

        singleTexture(
                Registration.LIGHTSWORD.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(AddedLamps.MODID, "item/light_sword"));

    }

    private ItemModelBuilder createLightPickaxe(int suffix) {
        return getBuilder("light_pickaxe" + suffix).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/light_pickaxe" + suffix);
    }

    private ItemModelBuilder createLightHoe(int suffix) {
        return getBuilder("light_hoe" + suffix).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/light_hoe" + suffix);
    }

    private ItemModelBuilder createLightAxe(int suffix) {
        return getBuilder("light_axe" + suffix).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/light_axe" + suffix);
    }

    private ItemModelBuilder createLightShovel(int suffix) {
        return getBuilder("light_shovel" + suffix).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/light_shovel" + suffix);
    }

    private ItemModelBuilder createLightSword(int suffix) {
        return getBuilder("light_sword" + suffix).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/light_sword" + suffix);
    }
}
