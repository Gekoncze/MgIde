package cz.mg.ide.explorer;

import cz.mg.toolkit.component.window.Window;
import cz.mg.toolkit.component.wrappers.VerticalScrollArea;
import cz.mg.toolkit.environment.device.devices.Keyboard;
import cz.mg.toolkit.event.adapters.KeyboardButtonAdapter;
import cz.mg.toolkit.event.events.KeyboardButtonEvent;
import cz.mg.toolkit.impl.Impl;
import cz.mg.toolkit.impl.swing.SwingImplApi;
import cz.mg.toolkit.layout.layouts.VerticalLayout;


public class MainWindow extends Window {
    private final NavigationBar navigationBar = new NavigationBar();
    private final VerticalScrollArea scrollArea = new VerticalScrollArea();
    private final StatusBar statusBar = new StatusBar();

    public MainWindow(){
        setTitle("MgIde");
        setSize(80*3, 60*3);
        center();

        getContentPanel().setLayout(new VerticalLayout());
        getContentPanel().getChildren().addLast(navigationBar);
        getContentPanel().getChildren().addLast(scrollArea);
        getContentPanel().getChildren().addLast(statusBar);

        getEventListeners().addLast(new KeyboardButtonAdapter() {
            @Override
            public void onKeyboardButtonEventEnter(KeyboardButtonEvent e) {
                if(e.wasPressed() && e.getLogicalButton() == Keyboard.Button.ENTER){
                    cz.mg.toolkit.utilities.Debug.printComponentInfo(MainWindow.this);
                }
            }
        });

        statusBar.setText("TEST TEXT");
    }

    public static void main(String[] args) {
        Impl.setImplApi(new SwingImplApi());
        MainWindow window = new MainWindow();
        window.open();
    }
}
