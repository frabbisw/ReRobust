public static int attachMedia(java.io.File mediaFile) throws name.kion.twipstr.exception.BackEndException {
    if (null == (name.kion.twipstr.backend.BackEnd.attachedMediaFiles)) {
        name.kion.twipstr.backend.BackEnd.attachedMediaFiles = new java.util.HashSet<java.io.File>();
    }
    name.kion.twipstr.backend.BackEnd.attachedMediaFiles.add(mediaFile);
    return name.kion.twipstr.backend.BackEnd.charactersReservedPerMedia;
}
