import rekkei.ra.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a vao");
        double a = sc.nextDouble();
        System.out.println("nhap b vao");
        double b = sc.nextDouble();
        System.out.println("nhap c vao");
        double c = sc.nextDouble();
        QuadraticEquation equation =new QuadraticEquation(a,b,c);
        double delta =equation.getDiscriminant();
        System.out.printf("gia tri cua denta la: %f",delta);
        if (delta>0){
            System.out.printf("phuong trinh co 2 nghiem la %f va %f\n",equation.getRoot1(),equation.getRoot2());
        } else if(delta==0){
            System.out.printf("phuong trinh co 1 nghiem la %f\n",equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}