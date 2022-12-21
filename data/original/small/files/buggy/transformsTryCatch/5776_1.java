protected void onCreate(android.os.Bundle bundle) {
    super.onCreate(bundle);
    try {
        setContentView(R.layout.sorusayfasi);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tanimlar();
    hangisorudasin = 0;
    soruyugetir(hangisorudasin);
}
