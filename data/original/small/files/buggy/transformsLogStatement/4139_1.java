public void doJob() {
    System.out.println("log");
    for (java.lang.Object socialUser : models.SocialUser.findAll()) {
        models.MessageCenter messageCenter = new models.MessageCenter(((models.SocialUser) (socialUser)));
        messageCenter.save();
    }
}
