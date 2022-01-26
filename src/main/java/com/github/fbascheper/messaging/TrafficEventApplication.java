package com.github.fbascheper.messaging;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Main application for traffic event handling.
 *
 * @author Frederieke Scheper
 * @since 20-10-2021
 */
public class TrafficEventApplication {

    public static void main(String[] args) {
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        // No need to manually activate a long-running bean to keep the WELD container active.
        // container.getBeanManager().createInstance().select(TrafficEventsEmitter.class).get().activate();

    }

}
