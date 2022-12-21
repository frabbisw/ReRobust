@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    return (((movieDetails) == null ? 0 : 1) + ((trailersArray) == null ? 0 : 1)) + ((reviewsArray) == null ? 0 : 1);
}
