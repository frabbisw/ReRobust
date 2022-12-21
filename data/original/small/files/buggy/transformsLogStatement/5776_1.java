protected void onCreate(android.os.Bundle bundle) {
    super.onCreate(bundle);
    setContentView(R.layout.sorusayfasi);
    System.out.println("log");
    tanimlar();
    hangisorudasin = 0;
    soruyugetir(hangisorudasin);
}
