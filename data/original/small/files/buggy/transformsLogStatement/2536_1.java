@java.lang.Override
public void onClick(android.view.View view) {
    spinner.setVisibility(View.VISIBLE);
    System.out.println("log");
    new com.udacity.gradle.builditbigger.JokeEndpointsAsyncTask().execute(new android.support.v4.util.Pair<android.content.Context, java.lang.String>(getContext(), "Paid"));
}
