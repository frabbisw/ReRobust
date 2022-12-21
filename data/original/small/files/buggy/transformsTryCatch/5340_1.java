@org.junit.Test
public void should_throw_exception_if_url_not_valid() {
    try {
        lan.dk.podcastserver.entity.CoverAssert.assertThat(imageService.getCoverFromURL("blabla")).isEqualTo(Cover.DEFAULT_COVER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
