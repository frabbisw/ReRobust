@java.lang.Override
public void run() {
    System.out.println("log");
    final edu.ucsb.cs.cs185.afarcilla.senioritis.RecycleAdapter adapter = new edu.ucsb.cs.cs185.afarcilla.senioritis.RecycleAdapter(myDataset);
    c.runOnUiThread(new java.lang.Runnable() {

        @java.lang.Override
        public void run() {
            recyclerView.setAdapter(adapter);
        }
    });
}
