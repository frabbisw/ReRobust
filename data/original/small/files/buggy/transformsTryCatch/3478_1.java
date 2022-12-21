public void remove() {
    try {
        for (final org.wirez.lienzo.toolbox.HoverToolboxButton button : buttons) {
            button.getShape().removeFromParent();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    handlerRegistrationManager.removeHandler();
}
