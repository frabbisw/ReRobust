public void updateState(client.GameState st) {
    java.lang.System.out.println("state");
    System.out.println("log");
    st.setColorMap(colors);
    for (java.util.function.Consumer<client.GameState> sl : stateListeners) {
        sl.accept(st);
    }
}
