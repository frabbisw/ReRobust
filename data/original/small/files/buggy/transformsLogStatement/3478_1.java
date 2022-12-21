public void remove() {
    System.out.println("log");
    for (final org.wirez.lienzo.toolbox.HoverToolboxButton button : buttons) {
        button.getShape().removeFromParent();
    }
    handlerRegistrationManager.removeHandler();
}
