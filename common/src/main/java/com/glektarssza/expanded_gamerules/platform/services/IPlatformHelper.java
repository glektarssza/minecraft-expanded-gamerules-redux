package com.glektarssza.expanded_gamerules.platform.services;

public interface IPlatformHelper {
    /**
     * Get the name of the mod loader platform the mod is running on.
     *
     * @return The name of the mod loader platform the mod is running on.
     */
    String getPlatformName();

    /**
     * Get whether another mod is loaded.
     *
     * @param modId The ID of the other mod to check for.
     *
     * @return {@code true} if the mod with the given ID is loaded;
     *         {@code false} otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Get whether the mod loader is in development mode.
     *
     * @return {@code true} if the mod loader is running in an development
     *         environment; {@code false} if it is running in a production
     *         environment.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Get the name of the environment the mod loader is configured for.
     *
     * By default this method simply uses the value of
     * {@link #isDevelopmentEnvironment} to determine what value to return.
     *
     * @return {@code "development"} if the mod loader is running in development
     *         mode; {@code "production"} otherwise.
     */
    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }
}
