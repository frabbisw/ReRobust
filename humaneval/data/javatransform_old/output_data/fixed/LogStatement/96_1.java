public static boolean right_angle_triangle(int a, int b, int c) {
    System.out.println("log");
    return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
}