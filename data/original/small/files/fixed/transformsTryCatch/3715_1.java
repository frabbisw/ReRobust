@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Void> create(@org.springframework.web.bind.annotation.RequestBody pl.bookshop.domains.Product product) {
    if (productsService.isExist(product)) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CONFLICT);
    }
    try {
        productsService.create(product);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CREATED);
}
