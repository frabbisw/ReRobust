@org.junit.Before
public void setUp() throws java.lang.Exception {
    try {
        word2vec = org.deeplearning4j.models.embeddings.loader.WordVectorSerializer.loadGoogleModel(new org.springframework.core.io.ClassPathResource("vec.bin").getFile(), true, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
