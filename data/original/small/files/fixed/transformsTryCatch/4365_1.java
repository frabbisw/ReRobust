public java.lang.String showNewQuestion() {
    try {
        newPost = postService.getNewPost();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "showNewQuestion_success";
}
