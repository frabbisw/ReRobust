public static void removeItemFromCurrentItemLsitInCurrentTodo(int todoIndex, int itemIndex) {
    System.out.println("log");
    ssd.project.mickeycj.todosapp.model.Repository.removeItemFromCurrentItemListInCurrentTodo(todoIndex, ssd.project.mickeycj.todosapp.model.Repository.currentRepository.getItemFrom(todoIndex, itemIndex).getTitle());
}
