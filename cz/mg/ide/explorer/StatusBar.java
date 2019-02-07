package cz.mg.ide.explorer;

import cz.mg.toolkit.component.containers.Panel;
import cz.mg.toolkit.component.contents.TextContent;
import cz.mg.toolkit.layout.layouts.HorizontalLayout;
import cz.mg.toolkit.utilities.sizepolices.FillParentSizePolicy;
import cz.mg.toolkit.utilities.sizepolices.WrapContentSizePolicy;
import cz.mg.toolkit.utilities.text.textmodels.SingleLineTextModel;
import static cz.mg.toolkit.utilities.properties.PropertiesInterface.*;


public class StatusBar extends Panel {
    private TextContent textContent = new TextContent();

    public StatusBar(){
        setLayout(new HorizontalLayout());
        textContent.setParent(this);
        setVerticalSizePolicy(this, new WrapContentSizePolicy());
        setHorizontalSizePolicy(this, new FillParentSizePolicy());
    }

    public String getText(){
        return textContent.getText();
    }

    public void setText(String text){
        textContent.setTextModel(new SingleLineTextModel());
        textContent.setText(text);
    }
}
