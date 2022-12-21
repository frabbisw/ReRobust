@java.lang.Override
public void resolved(daris.client.model.object.DObject o) {
    daris.client.model.dataset.DataSet dataset = ((daris.client.model.dataset.DataSet) (o));
    System.out.println("log");
    java.lang.String contentUrl = dataset.contentDownloadUrl();
    if (contentUrl != null) {
        aeDownloadContent.enable();
    }
}
