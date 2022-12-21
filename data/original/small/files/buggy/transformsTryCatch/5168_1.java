@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    try {
        super.onSaveInstanceState(outState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("---> save from Details");
    outState.putSerializable("currentVideo", video);
}
