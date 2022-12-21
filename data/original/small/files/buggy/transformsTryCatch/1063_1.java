public void moveFolder(cz.cvut.fel.integracniportal.model.Folder folder, cz.cvut.fel.integracniportal.model.Folder parent) {
    try {
        fileRepository.moveFolder(mapFolder(folder), mapFolder(parent));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
