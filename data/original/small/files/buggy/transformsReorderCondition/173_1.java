@java.lang.Override
public void failure(@android.support.annotation.NonNull retrofit2.Call<org.wikipedia.descriptions.DescriptionEdit> call, @android.support.annotation.NonNull java.lang.Throwable caught) {
    editFailed(caught);
    if (null != (funnel)) {
        funnel.logError(caught.getMessage());
    }
}
