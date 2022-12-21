public static void removeItemFromCurrentItemLsitInCurrentTodo(int todoIndex, int itemIndex) {
    try {
        ssd.project.mickeycj.todosapp.model.Repository.removeItemFromCurrentItemListInCurrentTodo(todoIndex, ssd.project.mickeycj.todosapp.model.Repository.currentRepository.getItemFrom(todoIndex, itemIndex).getTitle());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
