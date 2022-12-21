@java.lang.Override
public void onScriptFinished(java.lang.Object result, java.lang.Object previous, java.io.File source) {
    try {
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {

            @java.lang.Override
            public void run() {
                textArea.requestFocusInWindow();
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
