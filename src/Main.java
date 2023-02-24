import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    method(new Integer[]{41,45,2,14,59,52,7,36});
    }
    public static <A> void method(A[] massiv){

        System.out.println(massiv[0]);
//        Integer a = (Integer) massiv[massiv.length-1];
//        System.out.println(a);
        System.out.println(massiv[massiv.length-1]);
        System.out.println(Arrays.toString(massiv));
    }
}