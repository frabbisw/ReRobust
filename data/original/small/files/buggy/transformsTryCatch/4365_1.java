public java.lang.String showNewQuestion() {
    newPost = postService.getNewPost();
    try {
        java.lang.System.out.println(("Size:" + (newPost.size())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(newPost.get(0).getBody());
    return "showNewQuestion_success";
}
