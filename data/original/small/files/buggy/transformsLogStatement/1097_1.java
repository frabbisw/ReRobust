@java.lang.Override
public void drawOpen(final controller.IController controller) {
    System.out.println("log");
    if ((controller.getDiscardPile().size()) > 0) {
        controller.drawOpenCard();
    }
}
