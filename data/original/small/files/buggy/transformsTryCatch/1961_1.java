@org.junit.Before
public void setup() throws java.lang.Exception {
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    com.noname.digital.model.Customer customer = new com.noname.digital.model.Customer("alex", "terman");
    try {
        this.customerRepository.save(customer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
