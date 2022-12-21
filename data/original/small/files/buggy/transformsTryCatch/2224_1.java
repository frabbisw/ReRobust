public void registerSave() {
    try {
        savedAtAction = undoStack.peek();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
