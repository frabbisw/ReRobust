@java.lang.Override
public void run() {
    final edu.ucsb.cs.cs185.afarcilla.senioritis.RecycleAdapter adapter = new edu.ucsb.cs.cs185.afarcilla.senioritis.RecycleAdapter(myDataset);
    try {
        c.runOnUiThread(new java.lang.Runnable() {

            @java.lang.Override
            public void run() {
                recyclerView.setAdapter(adapter);
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
