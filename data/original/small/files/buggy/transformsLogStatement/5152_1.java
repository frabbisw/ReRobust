public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    System.out.println("log");
    session.getTabManager().addTabToCurrentTab(new cz.metacentrum.perun.webgui.tabs.groupstabs.AddGroupUnionTabItem(group, unions));
}
