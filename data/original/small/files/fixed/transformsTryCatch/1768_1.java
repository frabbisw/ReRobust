public void updateState(client.GameState st) {
    st.setColorMap(colors);
    try {
        for (java.util.function.Consumer<client.GameState> sl : stateListeners) {
            sl.accept(st);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
