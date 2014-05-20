package org.wso2.developerstudio.codenvy.ext.axis2.server;


import com.codenvy.inject.DynaModule;
import com.google.inject.AbstractModule;


/**
 * Created by kavith on 5/16/14.
 */
@DynaModule
public class Axis2Module extends AbstractModule {


    @Override
    protected void configure() {
        bind(Axis2ServiceProjectTypeDescriptionExtension.class);
        bind(Axis2ServiceProjectTypeExtension.class);
    }

}