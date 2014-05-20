package org.wso2.developerstudio.codenvy.ext.axis2.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * Created by kavith on 5/20/14.
 */
public interface Axis2ExtResources extends ClientBundle {

    interface Axis2CSS extends CssResource {
        String scrollPanel();
    }

    @Source("Axis2.css")
    Axis2CSS axis2Css();

    @Source("axis2.jpg")
    ImageResource axis2ServiceProject();

}