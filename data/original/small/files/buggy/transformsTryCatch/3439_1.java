@java.lang.Override
public void onFailure(retrofit2.Call<appteam.nith.hillffair.models.Register> call, java.lang.Throwable t) {
    try {
        t.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadToast.error();
}
