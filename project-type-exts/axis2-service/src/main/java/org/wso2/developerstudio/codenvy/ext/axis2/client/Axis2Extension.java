package org.wso2.developerstudio.codenvy.ext.axis2.client;

import com.codenvy.ide.api.extension.Extension;
import com.codenvy.ide.api.notification.NotificationManager;
import com.codenvy.ide.api.ui.IconRegistry;
import com.codenvy.ide.api.ui.wizard.ProjectTypeWizardRegistry;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Created by kavith on 5/16/14.
 */
@Singleton
@Extension(title = "Developer Studio - Axis2", version = "1.0.0")
public class Axis2Extension {

    @Inject
    public Axis2Extension(NotificationManager notificationManager,
                          IconRegistry iconRegistry,
                          ProjectTypeWizardRegistry wizardRegistry) {



    }
}

