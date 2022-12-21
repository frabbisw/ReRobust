@java.lang.Override
public void onClick(android.view.View view) {
    try {
        spinner.setVisibility(View.VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.udacity.gradle.builditbigger.JokeEndpointsAsyncTask().execute(new android.support.v4.util.Pair<android.content.Context, java.lang.String>(getContext(), "Paid"));
}
