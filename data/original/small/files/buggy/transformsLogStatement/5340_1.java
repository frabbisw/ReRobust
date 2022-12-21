@org.junit.Test
public void should_throw_exception_if_url_not_valid() {
    System.out.println("log");
    lan.dk.podcastserver.entity.CoverAssert.assertThat(imageService.getCoverFromURL("blabla")).isEqualTo(Cover.DEFAULT_COVER);
}
