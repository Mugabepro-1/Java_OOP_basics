import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

class  Scan{
    public static void scan(String[] args){String message = "Hello \"MuPro\"";
        System.out.println(message);
        int[] numbers = new int[5];
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 2;
        System.out.println(Arrays.toString(numbers));
        //multidimensional arrays

        int[][] multArr = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(multArr));

        double result  =Math.random();
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String frw = percent.format(35353455894.6754);
        System.out.println(frw);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Pardon entre votre age: ");
        byte age = scanner.nextByte();
        System.out.println("Votre age egale " + age);
    }
}


