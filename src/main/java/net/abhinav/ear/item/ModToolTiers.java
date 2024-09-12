package net.abhinav.ear.item;

import net.abhinav.ear.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier RUBY = new ForgeTier(1400, 4, 3f, 18,
            ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get()), ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);

}