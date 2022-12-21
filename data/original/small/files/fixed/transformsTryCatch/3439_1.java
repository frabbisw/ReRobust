@java.lang.Override
public void onFailure(retrofit2.Call<appteam.nith.hillffair.models.Register> call, java.lang.Throwable t) {
    try {
        loadToast.error();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    t.printStackTrace();
    loadToast.error();
}
