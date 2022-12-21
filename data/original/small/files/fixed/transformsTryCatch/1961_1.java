@org.junit.Before
public void setup() throws java.lang.Exception {
    try {
        this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
