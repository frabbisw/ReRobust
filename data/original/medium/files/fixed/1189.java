private todo.javier.mera.todolist.model.Task createTask ( java.lang.String todoListId ) { return new todo.javier.mera.todolist.model.Task ( java.util.UUID . randomUUID () . toString () , todoListId , "My Task" , todo.javier.mera.todolist.model.TaskStatus.Created , new java.util.Date () . getTime () , new java.util.Date () . getTime () , todo.javier.mera.todolist.model.Priority.None , todo.javier.mera.todolist.model.Reminder.ON ) ; } 
