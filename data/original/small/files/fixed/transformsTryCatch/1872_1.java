public boolean getButton(java.lang.String name) {
    try {
        if (buttons_.containsKey(name))
            return buttons_.get(name).state;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
