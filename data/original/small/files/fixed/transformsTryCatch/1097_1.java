@java.lang.Override
public void drawOpen(final controller.IController controller) {
    try {
        if (!(controller.getDiscardPile().isEmpty())) {
            controller.drawOpenCard();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
