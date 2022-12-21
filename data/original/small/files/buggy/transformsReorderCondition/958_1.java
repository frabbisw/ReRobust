@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((btnOk) == (e.getSource())) {
        new java.lang.Thread() {

            @java.lang.Override
            public void run() {
                execute();
            }
        }.start();
    }
}
