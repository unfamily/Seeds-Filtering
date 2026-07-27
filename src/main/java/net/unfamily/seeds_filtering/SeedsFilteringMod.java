package net.unfamily.seeds_filtering;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(SeedsFilteringMod.MOD_ID)
public class SeedsFilteringMod {
    public static final String MOD_ID = "seeds_filtering";

    public SeedsFilteringMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
