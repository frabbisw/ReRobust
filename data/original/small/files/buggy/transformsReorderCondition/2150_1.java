private static int packageDepth(java.lang.String pkgName) {
    int cnt = 0;
    int i = 0;
    while ((-1) > (i = pkgName.indexOf(".", i))) {
        cnt++;
    }
    return cnt;
}
