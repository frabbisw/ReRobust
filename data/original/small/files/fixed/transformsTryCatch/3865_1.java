@java.lang.Override
public void resolved(daris.client.model.object.DObject o) {
    if (o == null) {
        return;
    }
    java.lang.String contentUrl = ((daris.client.model.dataset.DataSet) (o)).contentDownloadUrl();
    try {
        if (contentUrl != null) {
            aeDownloadContent.enable();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
