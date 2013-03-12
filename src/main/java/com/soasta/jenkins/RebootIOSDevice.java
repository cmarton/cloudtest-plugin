/*
 * Copyright (c) 2013, SOASTA, Inc.
 * All Rights Reserved.
 */
package com.soasta.jenkins;

import hudson.EnvVars;
import hudson.Extension;
import hudson.util.ArgumentListBuilder;
import org.kohsuke.stapler.DataBoundConstructor;

public class RebootIOSDevice extends iOSAppInstallerBase {
    @DataBoundConstructor
    public RebootIOSDevice(String url, String additionalOptions) {
        super(url, additionalOptions);
    }
    
    @Override
    protected void addArgs(EnvVars envs, ArgumentListBuilder args) {
        args.add("--reboot");
    }

    @Extension
    public static class DescriptorImpl extends AbstractCloudTestBuilderDescriptor {
        @Override
        public String getDisplayName() {
            return "Reboot iOS Device";
        }
    }
}
