@java.lang.Override
public void run() {
    System.out.println("log");
    if (loading)
        progressBar.setVisibility(View.VISIBLE);
    else
        progressBar.setVisibility(View.INVISIBLE);
}
