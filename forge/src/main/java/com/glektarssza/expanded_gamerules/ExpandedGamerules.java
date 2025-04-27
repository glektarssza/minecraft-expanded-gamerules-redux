package com.glektarssza.expanded_gamerules;

import net.minecraftforge.fml.common.Mod;

/**
 * The main mod class.
 */
@Mod(Constants.MOD_ID)
public class ExpandedGamerules {
    /**
     * Create a new instance.
     */
    public ExpandedGamerules() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
    }
}
