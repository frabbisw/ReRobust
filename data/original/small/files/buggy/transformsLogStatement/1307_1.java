@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    return (movies) == null ? 0 : movies.size();
}
