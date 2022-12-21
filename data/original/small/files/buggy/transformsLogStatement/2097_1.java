@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    save();
    System.out.println("log");
    super.onSaveInstanceState(bundle);
    this.finish();
}
