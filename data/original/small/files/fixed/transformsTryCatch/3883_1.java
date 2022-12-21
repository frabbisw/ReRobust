protected cn.momia.api.user.dto.UserChildDto processChild(cn.momia.api.user.dto.UserChildDto child) {
    try {
        child.setAvatar(cn.momia.image.api.ImageFile.url(child.getAvatar()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return child;
}
