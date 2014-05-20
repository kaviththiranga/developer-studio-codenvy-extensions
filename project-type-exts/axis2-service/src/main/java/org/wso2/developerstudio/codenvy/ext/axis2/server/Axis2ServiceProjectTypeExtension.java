package org.wso2.developerstudio.codenvy.ext.axis2.server;

import com.codenvy.api.project.server.ProjectTypeDescriptionRegistry;
import com.codenvy.api.project.server.ProjectTypeExtension;
import com.codenvy.api.project.shared.Attribute;
import com.codenvy.api.project.shared.ProjectTemplateDescription;
import com.codenvy.api.project.shared.ProjectType;
import org.wso2.developerstudio.codenvy.ext.axis2.shared.Constants;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by kavith on 5/16/14.
 */
@Singleton
public class Axis2ServiceProjectTypeExtension implements ProjectTypeExtension {

    private Map<String, String> icons = new HashMap<>();

    @Inject
    public Axis2ServiceProjectTypeExtension(ProjectTypeDescriptionRegistry registry) {
        registry.registerProjectType(this);
    }

    @Override
    public ProjectType getProjectType() {
        return new ProjectType(Constants.AXI2_SERVICE_ID, Constants.AXI2_SERVICE_NAME, Constants.AXI2_CATEGORY);
    }

    @Override
    public List<Attribute> getPredefinedAttributes() {
        final List<Attribute> list = new ArrayList<>(4);
        list.add(new Attribute(Constants.LANGUAGE, "java"));
        list.add(new Attribute(Constants.FRAMEWORK, "Axis2"));
        list.add(new Attribute(Constants.RUNNER_NAME, "JavaWeb"));
        list.add(new Attribute(Constants.BUILDER_NAME, "maven"));
        return list;
    }

    @Override
    public List<ProjectTemplateDescription> getTemplates() {
        final List<ProjectTemplateDescription> list = new ArrayList<>(2);
        list.add(new ProjectTemplateDescription("zip",
                "AXIS2 Web Service",
                "Simple Axis2 web service project which uses Maven build system.",
                "template/Axis2Service.zip"));

        return list;
    }




}
