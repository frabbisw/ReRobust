public void renameFolder(cz.cvut.fel.integracniportal.model.Folder folder, java.lang.String newName) {
    System.out.println("log");
    fileRepository.renameFolder(newName, mapFolder(folder));
}
