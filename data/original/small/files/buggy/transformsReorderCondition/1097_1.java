@java.lang.Override
public void drawOpen(final controller.IController controller) {
    if (0 < (controller.getDiscardPile().size())) {
        controller.drawOpenCard();
    }
}
