package de.pasuki.create_ore_doubling;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    static {
        BUILDER.comment("Raw ore extra drop chance configuration", "Values are 0.0 - 1.0 where 0.5 = 50%.")
                .push("rawOreExtraDropChance");
    }

    public static final ModConfigSpec.DoubleValue RAW_ORE_EXTRA_DROP_CHANCE_GLOBAL = BUILDER
            .comment("Global base chance for extra crushed ore output.", "0.0 - 1.0, e.g. 0.5 = 50%")
            .defineInRange("global", 0.5D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue RAW_ORE_EXTRA_DROP_CHANCE_IRON_MULTIPLIER = BUILDER
            .comment("Multiplier for raw iron extra drops.", "Final chance = global * multiplier (clamped to 1.0)")
            .defineInRange("ironMultiplier", 1.0D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue RAW_ORE_EXTRA_DROP_CHANCE_GOLD_MULTIPLIER = BUILDER
            .comment("Multiplier for raw gold extra drops.", "Final chance = global * multiplier (clamped to 1.0)")
            .defineInRange("goldMultiplier", 1.0D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue RAW_ORE_EXTRA_DROP_CHANCE_COPPER_MULTIPLIER = BUILDER
            .comment("Multiplier for raw copper extra drops.", "Final chance = global * multiplier (clamped to 1.0)")
            .defineInRange("copperMultiplier", 1.0D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue RAW_ORE_EXTRA_DROP_CHANCE_ZINC_MULTIPLIER = BUILDER
            .comment("Multiplier for raw zinc extra drops.", "Final chance = global * multiplier (clamped to 1.0)")
            .defineInRange("zincMultiplier", 1.0D, 0.0D, 1.0D);

    static {
        BUILDER.pop();
    }

    public static final ModConfigSpec.DoubleValue RAW_ORE_BLOCK_EXTRA_DROP_CHANCE = BUILDER
            .comment("Chance for each extra crushed ore output from raw ore block crushing recipes.", "Input is 0.0 - 1.0 where 0.5 = 50% and 0.75 = 75%.")
            .defineInRange("rawOreBlockExtraDropChance", 0.5D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue EXPERIENCE_NUGGET_CHANCE = BUILDER
            .comment("Chance for experience nugget outputs from ore crushing recipes.", "Input is 0.0 - 1.0 where 0.5 = 50% and 0.75 = 75%.")
            .defineInRange("experienceNuggetChance", 0.75D, 0.0D, 1.0D);

    static final ModConfigSpec SPEC = BUILDER.build();
}
