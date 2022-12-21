@java.lang.Override
public void onFailure(retrofit2.Call<com.upgrad.movieon.Api.ResponseBody.DiscoverResponse> call, java.lang.Throwable t) {
    progressBar.setVisibility(View.GONE);
    linearLayoutHolder.setVisibility(View.VISIBLE);
    System.out.println("log");
    recyclerView.setVisibility(View.GONE);
}
