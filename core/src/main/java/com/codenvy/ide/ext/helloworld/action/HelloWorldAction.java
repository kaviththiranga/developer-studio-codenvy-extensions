package com.codenvy.ide.ext.helloworld.action;

/**
 * As usual, importing resources, related to Action API.
 * The 3rd import is required to call a default alert box.
 */
import com.codenvy.ide.api.ui.action.Action;
import com.codenvy.ide.api.ui.action.ActionEvent;
import com.codenvy.ide.ext.helloworld.ui.About;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.inject.Inject;
import com.google.gwt.user.client.ui.Button;


public class HelloWorldAction extends Action
{
    /**
     * Define a constructor and pass over text to be displayed in the dialogue box
     */

    @Inject
    public HelloWorldAction() {
        super("About");
    }

    /**
     * Define the action required when calling this method. In our case it'll open a dialogue box with 'Hello world'
     */

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        new About().show();
              
    }
    
    private static class MyDialog extends DialogBox {

       public MyDialog() {
         
         setText("WSO2 Developer Studio - 5.0.0");
         center();
         
         setAnimationEnabled(true);
         setText("A major step forward in providing a complete Codenvy-based SOA development environment for the award-winning WSO2 Carbon platform,");
         //setHeight()
         setGlassEnabled(true);
     
         Button ok = new Button("close");
         ok.addClickHandler(new ClickHandler() {
            
            @Override
            public void onClick(ClickEvent arg0) {
                MyDialog.this.hide();
                
            }
        });
         
         
         setWidget(ok);
       }
     }
    
}
