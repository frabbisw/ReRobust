@java.lang.Override
public void onFailure(retrofit2.Call<com.upgrad.movieon.Api.ResponseBody.DiscoverResponse> call, java.lang.Throwable t) {
    try {
        progressBar.setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    linearLayoutHolder.setVisibility(View.VISIBLE);
}
