/**
 * @program: JavaTransformer
 * @description:
 * @author: Yu Shi
 * @create: 2022-11-20 23:54
 **/
public class Test {


    public static int incrementKey() {
        int temp = 1;
        return (temp + 1);
    }
    public static int incrementKey1() {
        int temp = 1;
        return temp++;
    }

    public static void main(String[] args) {
        System.out.println(incrementKey());
        System.out.println(incrementKey1());

    }
}
