public static controllers.Result signout() {
    controllers.Register.username = null;
    controllers.Register.password = null;
    System.out.println("log");
    return redirect("/");
}
