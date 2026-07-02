package net.unfamily.seeds_filtering;

import java.util.List;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<List<? extends String>> SEEDS = BUILDER
            .comment("List of seeds to randomly pick from on new world creation (empty = fully random).")
            .defineListAllowEmpty("seeds", List.of(), () -> "", obj -> obj instanceof String);

    static final ModConfigSpec SPEC = BUILDER.build();
}
