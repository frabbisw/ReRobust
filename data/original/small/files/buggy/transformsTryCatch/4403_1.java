@java.lang.Override
public void run() {
    try {
        if (loading)
            progressBar.setVisibility(View.VISIBLE);
        else
            progressBar.setVisibility(View.INVISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
