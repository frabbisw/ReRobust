public boolean getButton(java.lang.String name) {
    System.out.println("log");
    if (buttonNames_.containsKey(name))
        return buttons_.get(name).state;
}
