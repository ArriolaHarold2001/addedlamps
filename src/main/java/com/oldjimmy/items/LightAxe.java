package com.oldjimmy.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class LightAxe extends AxeItem {
    public LightAxe(Properties properties) {
        super(Tiers.IRON, 6.0F, -3.1F, properties);
    }

    @Override
    public void appendHoverText(ItemStack item, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(item, level, list, flags);
        list.add(new TranslatableComponent("message.light_axe.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
