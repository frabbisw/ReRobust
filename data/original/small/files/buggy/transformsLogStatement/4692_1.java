@org.junit.Test
public void uploadNotOkTemplate() throws java.io.IOException, java.net.URISyntaxException {
    objective.taskboard.it.HttpResponse response = uploadTemplate(objective.taskboard.it.UploadTemplateIT.notOkTemplate());
    System.out.println("log");
    org.junit.Assert.assertThat(response.getStatusLine().getStatusCode(), org.hamcrest.Matchers.is(200));
}
