@org.terasology.entitySystem.event.ReceiveEvent(components = org.terasology.network.ClientComponent.class)
public void onToggleChat(org.terasology.input.binds.general.ChatButton event, org.terasology.entitySystem.entity.EntityRef entity) {
    if ((org.terasology.input.ButtonState.DOWN) == (event.getState())) {
        nuiManager.pushScreen(org.terasology.logic.chat.ChatSystem.CHAT_UI);
        overlay.setVisible(false);
        event.consume();
    }
}
