@java.lang.Override
public me.nereo.multi_image_selector.bean.Folder getItem(int i) {
    if (0 == i)
        return null;
    return mFolders.get((i - 1));
}
