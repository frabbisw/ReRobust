public void moveFolder(cz.cvut.fel.integracniportal.model.Folder folder, cz.cvut.fel.integracniportal.model.Folder parent) {
    System.out.println("log");
    fileRepository.moveFolder(mapFolder(folder), mapFolder(parent));
}
