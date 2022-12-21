@java.lang.Override
public void onNewInput(java.lang.String input) {
    try {
        suggestionsView.removeAllViews();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    trigger.exec(input, mTerminalAdapter.getCurrentOutputId());
}
