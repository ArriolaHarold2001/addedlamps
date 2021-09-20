package com.oldjimmy.datagen;

import com.oldjimmy.addedlamps.AddedLamps;
import com.oldjimmy.blocks.GlowStick;
import com.oldjimmy.items.LightAxe;
import com.oldjimmy.items.LightPickaxe;
import com.oldjimmy.items.LightShovel;
import com.oldjimmy.items.LightSword;
import com.oldjimmy.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.RegistryEvent;

import java.util.function.Consumer;

import static com.oldjimmy.setup.Registration.LIGHTSHOVEL;
import static com.oldjimmy.setup.Registration.LIGHTSWORD;
import static net.minecraft.world.item.Items.STICK;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Registration.LIGHTPICKAXE.get())
                .pattern("xxx")
                .pattern(" i ")
                .pattern(" i ")
                .define('x', Tags.Items.OBSIDIAN)
                .define('i', Tags.Items.OBSIDIAN)
                .group("addedlamps")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(STICK))
                .save(consumer);
    }
}
