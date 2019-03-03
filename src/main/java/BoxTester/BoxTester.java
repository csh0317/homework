package BoxTester;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length, width;
        int height;
//        Box3 box3 = new Box3();
/*        Box5 box5 = new Box5();*/
        while(true){
            System.out.print("Please enter object's length: ");
            length = scanner.nextFloat();
            System.out.print("Please enter object's width: ");
            width = scanner.nextFloat();
            System.out.print("Please enter object's height: ");
            height = scanner.nextInt();
            Box box5 = new Box5(length, width, height); //Box 使用 Box5的長寬高
            Box box3 = new Box3(length, width, height); //Box 使用 Box3的長寬高
            if(length == -1||width == -1|| height == -1)
                break;
            if(length > box5.length)
                System.out.println("Please enter again.");
            else if(box3.validate(length, width, height))
                System.out.println("Use Box3");
            else if(box5.validate(length, width, height))
                System.out.println("Use Box5");
            else System.out.println("Please enter again.");

           /* if(length > box5.length)
                System.out.println("Please enter again.");
            else if(box3.validate(length, width, height)) {
                System.out.println("Box3");
            }else if (box5.validate(length, width, height)){
                System.out.println("Box5");
            }else System.out.println("Please enter again.");
*/
        }
    }
}
