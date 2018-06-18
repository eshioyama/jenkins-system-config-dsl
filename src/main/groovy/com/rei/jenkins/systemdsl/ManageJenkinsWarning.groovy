package com.rei.jenkins.systemdsl;

import hudson.Extension;
import hudson.model.AdministrativeMonitor;

@Extension
class ManageJenkinsWarning extends AdministrativeMonitor {

    static String configUrl

    @Override
    String getDisplayName() {
        return "Configuration managed by Jenkins System Config DSL Plugin"
    }

    String getConfigUrl() {
        return configUrl
    }

    @Override
    boolean isActivated() {
        return true
    }
}
