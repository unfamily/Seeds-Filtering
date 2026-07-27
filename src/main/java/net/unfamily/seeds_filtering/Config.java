package net.unfamily.seeds_filtering;

import java.util.List;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> SEEDS = BUILDER
            .comment("List of seeds to randomly pick from on new world creation (empty = fully random).")
            .defineListAllowEmpty("seeds", List.of(), obj -> obj instanceof String);

    static final ForgeConfigSpec SPEC = BUILDER.build();
}
