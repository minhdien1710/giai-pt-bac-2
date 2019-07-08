import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("phuong trinh co dang ax^2 + bx + c = 0");
        System.out.println("nhap a: ");
        float a= scanner.nextFloat();
        account.setA(a);
        System.out.println("nhap b: ");
        float b = scanner.nextFloat();
        account.setB(b);
        System.out.println("nhap c: ");
        float c = scanner.nextFloat();
        account.setC(c);

        if(account.getDelta()>0){
            double r1 =account.getR1();
            double r2 = account.getR2();
            System.out.println( r1);
            System.out.println(r2);
        }else if (account.getDelta() ==0){
            double r0 = account.getR1();
            System.out.println(r0);
        }else {
            System.out.println("phuong trinh vo nghiem");
        }


    }
}
