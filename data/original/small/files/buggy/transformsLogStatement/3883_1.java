private cn.momia.api.user.dto.UserChildDto processChild(cn.momia.api.user.dto.UserChildDto child) {
    child.setAvatar(cn.momia.image.api.ImageFile.url(child.getAvatar()));
    System.out.println("log");
    return child;
}
