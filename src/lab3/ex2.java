package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);
        //name
        System.out.print("ชื่อ นามสกุล ? : ");
        name = sc.nextLine();
        System.out.println("สวัสดี, "+ name);

        //age
        System.out.print("อายุ ? : ");
        int age = sc.nextInt();
        System.out.println("คุณ อายุ "+age+" ปี ");

        //address
        System.out.print("ที่อยู่ ? : ");
        int address = sc.nextInt();
        System.out.println("ที่อยู๋, "+ address);

        //telephone
        System.out.print("เบอร์โทรศัพท์ ? : ");
        int telephone = sc.nextInt();
        System.out.println("เบอร์โทรศัพท์, "+ telephone );

        String sex;
        Scanner se = new Scanner(System.in);
        //sex
        System.out.print("เพศ ? : ");
        sex = se.nextLine();
        System.out.println("เพศ, "+ sex);

    }//main
}//class

