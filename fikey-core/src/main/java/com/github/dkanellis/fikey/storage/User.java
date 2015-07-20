package com.github.dkanellis.fikey.storage;

/**
 * @author Dimitris
 */
public class User implements U2fUser {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        return this.password.equals(password);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User) {
            User other = (User) o;
            return username.equals(other.username);
        } else if (o instanceof String) {
            String otherUsername = (String) o;
            return username.equals(otherUsername);
        }

        return false;
    }
}