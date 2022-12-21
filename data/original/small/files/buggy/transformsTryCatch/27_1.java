public com.mediamath.terminalone.models.T1Entity save(com.mediamath.terminalone.models.T1Entity entity) throws com.mediamath.terminalone.exceptions.ClientException, com.mediamath.terminalone.exceptions.ParseException {
    if (entity == null)
        return null;
    try {
        if (!(isAuthenticated()))
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.mediamath.terminalone.models.T1Entity response = postService.save(entity);
    return response;
}
