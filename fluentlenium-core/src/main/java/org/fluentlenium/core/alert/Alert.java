package org.fluentlenium.core.alert;

/**
 * Manage browser alert.
 */
public interface Alert extends org.openqa.selenium.Alert {
    /**
     * Send input to the alert prompt.
     *
     * @param text test to send to the prompt
     */
    void prompt(String text);

    /**
     * Check if this alert is present.
     *
     * @return true if alert is present, false otherwise
     */
    boolean present();
}
