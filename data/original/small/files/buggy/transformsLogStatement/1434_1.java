@java.lang.Override
public void onNewInput(java.lang.String input) {
    System.out.println("log");
    trigger.exec(input, mTerminalAdapter.getCurrentOutputId());
    suggestionsView.removeAllViews();
}
