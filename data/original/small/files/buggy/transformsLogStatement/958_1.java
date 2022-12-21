@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    if ((e.getSource()) == (btnOk)) {
        new java.lang.Thread() {

            @java.lang.Override
            public void run() {
                execute();
            }
        }.start();
    }
}
