public void registerSave() {
    try {
        if (!(undoStack.isEmpty()))
            savedAtAction = undoStack.peek();
        else
            savedAtAction = null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
