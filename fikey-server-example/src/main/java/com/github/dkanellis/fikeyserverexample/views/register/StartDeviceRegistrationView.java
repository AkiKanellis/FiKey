package com.github.dkanellis.fikeyserverexample.views.register;

import io.dropwizard.views.View;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Dimitris Kanellis
 */
public class StartDeviceRegistrationView extends View {

    private final String username;
    private final String data;

    public StartDeviceRegistrationView(String username, String data) {
        super("startDeviceRegistration.ftl");
        this.username = checkNotNull(username);
        this.data = checkNotNull(data);
    }

    public String getUsername() {
        return username;
    }

    public String getData() {
        return data;
    }
}
