package org.wso2.developerstudio.codenvy.project.type.ext.axis2;

import com.codenvy.inject.DynaModule;
import com.google.inject.AbstractModule;
import org.wso2.developerstudio.codenvy.project.type.ext.axis2.projectmodel.Axis2ServiceProjectTypeExtension;

/**
 * Created by kavith on 5/16/14.
 */
@DynaModule
public class Axi2Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(Axis2ServiceProjectTypeExtension.class);
    }

}