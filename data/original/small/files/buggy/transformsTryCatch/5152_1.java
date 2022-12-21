public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    try {
        session.getTabManager().addTabToCurrentTab(new cz.metacentrum.perun.webgui.tabs.groupstabs.AddGroupUnionTabItem(group, unions));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
