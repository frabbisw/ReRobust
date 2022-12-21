@java.lang.Override
public void onNewInput(java.lang.String input) {
    try {
        trigger.exec(input, mTerminalAdapter.getCurrentOutputId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    suggestionsView.removeAllViews();
}
