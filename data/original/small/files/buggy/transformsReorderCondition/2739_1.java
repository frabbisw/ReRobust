@java.lang.Override
public int getItemCount() {
    return ((reviewsArray) == null ? 0 : 1) + (((movieDetails) == null ? 0 : 1) + ((trailersArray) == null ? 0 : 1));
}
