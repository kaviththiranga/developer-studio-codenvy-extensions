package org.wso2.developerstudio.codenvy.ext.axis2.server;

import com.codenvy.api.project.server.ProjectTypeDescriptionExtension;
import com.codenvy.api.project.server.ProjectTypeDescriptionRegistry;
import com.codenvy.api.project.shared.AttributeDescription;
import com.codenvy.api.project.shared.ProjectType;
import org.wso2.developerstudio.codenvy.ext.axis2.shared.Constants;


import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavith on 5/20/14.
 */
@Singleton
public class Axis2ServiceProjectTypeDescriptionExtension implements ProjectTypeDescriptionExtension {


    @Inject
    public Axis2ServiceProjectTypeDescriptionExtension(ProjectTypeDescriptionRegistry registry) {
        registry.registerDescription(this);
    }

    @Override
    public List<ProjectType> getProjectTypes() {
        final List<ProjectType> list = new ArrayList<>(1);
        list.add(new ProjectType(Constants.AXI2_SERVICE_ID, Constants.AXI2_SERVICE_NAME, Constants.JAVA_CATEGORY));
        return list;
    }

    @Override
    public List<AttributeDescription> getAttributeDescriptions() {
        final List<AttributeDescription> list = new ArrayList<>(6);
        list.add(new AttributeDescription(Constants.LANGUAGE));
        list.add(new AttributeDescription(Constants.LANGUAGE_VERSION));
        list.add(new AttributeDescription(Constants.FRAMEWORK));
        list.add(new AttributeDescription(Constants.BUILDER_NAME));
        list.add(new AttributeDescription(Constants.BUILDER_MAVEN_SOURCE_FOLDERS));
        list.add(new AttributeDescription(Constants.RUNNER_NAME));
        return list;
    }
}
