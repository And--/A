package com.example.vaadintest;

import com.vaadin.Application;
import com.vaadin.ui.*;

/**
 * Main application class.
 */
public class VaadintestApplication extends Application {
 
    @Override
    public void init() {
        Window mainWindow = new Window("Vaadintest Application");
        Label label = new Label("Hello Vaadin user");
        mainWindow.addComponent(label);
        setMainWindow(mainWindow);
    }

}

