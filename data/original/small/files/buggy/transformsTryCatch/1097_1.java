@java.lang.Override
public void drawOpen(final controller.IController controller) {
    try {
        if ((controller.getDiscardPile().size()) > 0) {
            controller.drawOpenCard();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
