public void renameFolder(cz.cvut.fel.integracniportal.model.Folder folder, java.lang.String newName) {
    try {
        fileRepository.renameFolder(newName, mapFolder(folder));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
