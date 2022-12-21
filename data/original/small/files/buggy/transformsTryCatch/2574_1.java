public java.lang.String create(final spark.Request req) throws com.fasterxml.jackson.core.JsonProcessingException {
    this.userService.createUser(req.body());
    try {
        this.logger.info("[CREATE] User created!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return prettyPrint(new response.ResponseMessage("User created!!", 200));
}
