@org.junit.Before
public void setUp() throws java.lang.Exception {
    System.out.println("log");
    word2vec = org.deeplearning4j.models.embeddings.loader.WordVectorSerializer.loadGoogleModel(new org.springframework.core.io.ClassPathResource("vec.bin").getFile(), true);
}
