public void updateState(client.GameState st) {
    try {
        java.lang.System.out.println("state");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    st.setColorMap(colors);
    for (java.util.function.Consumer<client.GameState> sl : stateListeners) {
        sl.accept(st);
    }
}
