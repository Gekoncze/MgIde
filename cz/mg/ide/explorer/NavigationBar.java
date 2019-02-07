package cz.mg.ide.explorer;

import cz.mg.collections.list.List;
import cz.mg.collections.list.chainlist.ChainList;
import cz.mg.toolkit.component.containers.Panel;
import cz.mg.toolkit.component.controls.buttons.TextButton;
import cz.mg.toolkit.component.wrappers.CompactHorizontalScrollArea;
import cz.mg.toolkit.utilities.sizepolices.FillParentSizePolicy;
import cz.mg.toolkit.utilities.sizepolices.WrapContentSizePolicy;

import static cz.mg.toolkit.utilities.properties.PropertiesInterface.*;


public class NavigationBar extends CompactHorizontalScrollArea {
    private final List<NavigationButton> buttons = new ChainList<>();

    public NavigationBar(){
        setVerticalSizePolicy(this, new WrapContentSizePolicy());
        setHorizontalSizePolicy(this, new FillParentSizePolicy());
    }

    private static class NavigationButton extends TextButton {

    }
}
