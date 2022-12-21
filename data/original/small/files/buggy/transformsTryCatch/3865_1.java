@java.lang.Override
public void resolved(daris.client.model.object.DObject o) {
    daris.client.model.dataset.DataSet dataset = ((daris.client.model.dataset.DataSet) (o));
    java.lang.String contentUrl = dataset.contentDownloadUrl();
    try {
        if (contentUrl != null) {
            aeDownloadContent.enable();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
