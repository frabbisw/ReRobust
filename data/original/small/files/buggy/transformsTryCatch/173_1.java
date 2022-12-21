@java.lang.Override
public void failure(@android.support.annotation.NonNull retrofit2.Call<org.wikipedia.descriptions.DescriptionEdit> call, @android.support.annotation.NonNull java.lang.Throwable caught) {
    try {
        editFailed(caught);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((funnel) != null) {
        funnel.logError(caught.getMessage());
    }
}
