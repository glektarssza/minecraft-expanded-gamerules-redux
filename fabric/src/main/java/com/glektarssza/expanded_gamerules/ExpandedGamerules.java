package com.glektarssza.expanded_gamerules;

import net.fabricmc.api.ModInitializer;

/**
 * The main mod class.
 */
public class ExpandedGamerules implements ModInitializer {
    /**
     * Initialize the mod.
     */
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
