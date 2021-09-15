package com.oldjimmy.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

public class LightPickaxe extends PickaxeItem {

    public LightPickaxe(Properties properties) {
        super(Tiers.IRON, 1, -2.8F, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        list.add(new TranslatableComponent("message.light_pickaxe.tooltip").withStyle(ChatFormatting.GOLD));
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
        boolean result = super.mineBlock(stack, level, state, pos, entity);
        if (result) {
                CompoundTag tag = stack.getOrCreateTag();
                boolean mining = tag.getBoolean("mining");
                if (!mining) {
                    BlockHitResult hit = trace(level, entity);
                    if (hit.getType() == HitResult.Type.BLOCK) {
                        tag.putBoolean("mining", true);
                    }
                }
        }
        return result;
    }


    private BlockHitResult trace(Level level, LivingEntity player) {
        double reach = player.getAttribute(net.minecraftforge.common.ForgeMod.REACH_DISTANCE.get()).getValue();
        Vec3 eye = player.getEyePosition(1.0f);
        Vec3 view = player.getViewVector(1.0f);
        Vec3 withReach = eye.add(view.x * reach, view.y * reach, view.z * reach);
        return level.clip(new ClipContext(eye, withReach, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, player));
    }
}
