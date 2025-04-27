package com.glektarssza.expanded_gamerules.platform;

import com.glektarssza.expanded_gamerules.Constants;
import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

/**
 * A collection of helper services.
 */
public class Services {
    /**
     * The platform helper service class.
     */
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    /**
     * Load a given service class.
     *
     * @param clazz The service class to load.
     *
     * @return The loaded service class.
     *
     * @throws NullPointerException Thrown if the service class could not be
     *         loaded.
     */
    public static <T> T load(Class<T> clazz) throws NullPointerException {
        final T loadedService = ServiceLoader.load(clazz)
            .findFirst()
            .orElseThrow(() -> new NullPointerException(
                "Failed to load service for " + clazz.getName()));
        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
