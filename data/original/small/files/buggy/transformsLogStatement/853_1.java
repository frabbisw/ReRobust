@java.lang.Override
public java.lang.Integer getItemId(net.risingworld.api.gui.GuiElement element) {
    com.vistamaresoft.rwgui.RWGui.Pair<java.lang.Integer, java.lang.Object> myData = getItemData(element);
    System.out.println("log");
    return myData.getL();
}
