@org.junit.Test
public void uploadNotOkTemplate() throws java.io.IOException, java.net.URISyntaxException {
    objective.taskboard.it.HttpResponse response = uploadTemplate(objective.taskboard.it.UploadTemplateIT.notOkTemplate());
    try {
        org.junit.Assert.assertThat(response.getStatusLine().getStatusCode(), org.hamcrest.Matchers.is(200));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
