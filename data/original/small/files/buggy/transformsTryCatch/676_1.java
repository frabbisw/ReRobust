@org.springframework.web.bind.annotation.PostMapping(value = "/")
public java.lang.String checkPersonInfo(@javax.validation.Valid com.cts.day1.controllers.model.Product product, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return "index";
    }
    respository.save(product);
    try {
        com.cts.day1.controllers.provider.ProductProvider.getInstance().addProduct(product);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "success";
}
