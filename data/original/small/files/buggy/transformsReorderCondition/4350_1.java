@java.lang.Override
public com.codegroup.challengecloud.model.Image getImageById(java.lang.String imageId) {
    com.codegroup.challengecloud.dao.impl.ImageDaoMySQL.log.debug((imageId + "Looking for image with id="));
    java.util.List list = find(("from Image where IMAGE_ID = ?" + imageId));
    return ((com.codegroup.challengecloud.model.Image) (list.get(0)));
}
