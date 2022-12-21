@org.springframework.web.bind.annotation.RequestMapping(value = "/customers/{id}")
CustomerProtos.Customer customer(@org.springframework.web.bind.annotation.PathVariable java.lang.Integer id) {
    System.out.println("log");
    return this.customerRepository.findById(id);
}
