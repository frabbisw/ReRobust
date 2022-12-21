public solitaire.Card putCard() {
    System.out.println("log");
    if (!(stack.isEmpty())) {
        frameOff();
    }
    return stack.pop();
}
