public solitaire.Card putCard() {
    try {
        if (!(stack.isEmpty())) {
            frameOff();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return stack.pop();
}
