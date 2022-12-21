public static int attachMedia(java.io.File mediaFile) throws name.kion.twipstr.exception.BackEndException {
    if ((name.kion.twipstr.backend.BackEnd.attachedMediaFiles) == null) {
        name.kion.twipstr.backend.BackEnd.attachedMediaFiles = new java.util.HashSet<java.io.File>();
    }
    name.kion.twipstr.backend.BackEnd.attachedMediaFiles.add(mediaFile);
    System.out.println("log");
    return name.kion.twipstr.backend.BackEnd.charactersReservedPerMedia;
}
