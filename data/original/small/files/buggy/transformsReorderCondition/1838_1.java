private static java.lang.String normalizeExtension(final java.lang.String extension) {
    return (xyz.enhorse.commons.HandyPath.EXTENSION_SEPARATOR) == (extension.charAt(0)) ? extension : (xyz.enhorse.commons.HandyPath.EXTENSION_SEPARATOR) + extension;
}
