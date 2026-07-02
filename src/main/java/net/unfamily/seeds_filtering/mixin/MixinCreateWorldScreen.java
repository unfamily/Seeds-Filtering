package net.unfamily.seeds_filtering.mixin;

import java.util.List;
import java.util.Random;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.unfamily.seeds_filtering.Config;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreateWorldScreen.class)
public class MixinCreateWorldScreen {

    @Final
    @Shadow
    private WorldCreationUiState uiState;

    @Inject(method = "onCreate", at = @At("HEAD"))
    private void onOnCreate(CallbackInfo ci) {
        List<? extends String> seeds = Config.SEEDS.get();
        if (!uiState.getSeed().isEmpty() || seeds.isEmpty()) return;
        uiState.setSeed(seeds.get(new Random().nextInt(seeds.size())));
    }
}
