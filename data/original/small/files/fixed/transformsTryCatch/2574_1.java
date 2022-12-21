public java.lang.String create(final spark.Request req) throws com.fasterxml.jackson.core.JsonProcessingException {
    try {
        this.userService.createUser(req.body());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.logger.info("[CREATE] User created!");
    return this.prettyPrint(new response.ResponseMessage("User created!!", 200));
}
