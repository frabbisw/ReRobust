@java.lang.Override
public com.codegroup.challengecloud.model.Image getImageById(java.lang.String imageId) {
    try {
        com.codegroup.challengecloud.dao.impl.ImageDaoMySQL.log.debug(("Looking for image with id=" + imageId));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.List list = find("from Image where IMAGE_ID = ?", imageId);
    return ((com.codegroup.challengecloud.model.Image) (list.get(0)));
}
