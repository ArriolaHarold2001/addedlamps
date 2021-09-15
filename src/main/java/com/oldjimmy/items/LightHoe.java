package com.oldjimmy.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class LightHoe extends HoeItem {
    public LightHoe(Properties properties) {
        super(Tiers.IRON, -2, -1.0F, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        list.add(new TranslatableComponent("message.light_hoe.tooltip").withStyle(ChatFormatting.GOLD));
    }
}