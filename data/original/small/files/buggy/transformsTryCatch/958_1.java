@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        if ((e.getSource()) == (btnOk)) {
            new java.lang.Thread() {

                @java.lang.Override
                public void run() {
                    execute();
                }
            }.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
