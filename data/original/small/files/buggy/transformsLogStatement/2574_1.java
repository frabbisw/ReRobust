public java.lang.String create(final spark.Request req) throws com.fasterxml.jackson.core.JsonProcessingException {
    System.out.println("log");
    this.userService.createUser(req.body());
    this.logger.info("[CREATE] User created!");
    return prettyPrint(new response.ResponseMessage("User created!!", 200));
}
