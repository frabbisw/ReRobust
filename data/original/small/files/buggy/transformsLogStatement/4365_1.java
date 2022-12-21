public java.lang.String showNewQuestion() {
    newPost = postService.getNewPost();
    System.out.println("log");
    java.lang.System.out.println(("Size:" + (newPost.size())));
    java.lang.System.out.println(newPost.get(0).getBody());
    return "showNewQuestion_success";
}
