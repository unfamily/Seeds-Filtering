package net.unfamily.seeds_filtering;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(SeedsFilteringMod.MOD_ID)
public class SeedsFilteringMod {
    public static final String MOD_ID = "seeds_filtering";

    public SeedsFilteringMod(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
