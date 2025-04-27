package com.glektarssza.expanded_gamerules.platform;

import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

/**
 * The platform helper implementation for the Fabric mod loader.
 */
public class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
