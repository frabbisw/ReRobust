@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    System.out.println("log");
    super.onSaveInstanceState(outState);
    java.lang.System.out.println("---> save from Details");
    outState.putSerializable("currentVideo", video);
}
