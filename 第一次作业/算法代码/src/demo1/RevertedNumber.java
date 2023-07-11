package demo1;

import java.util.Scanner;

public class RevertedNumber {

    public static void main(String[] args) {
        System.out.println("输入一个数字，哥来判断是不是回文数");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0&&x%10==0){
            System.out.println("负数和十的倍数不是回文数");
        }
        int a=0,b=0;
        int c= x;
        while(c!=0){
            a=c%10;
            b=b*10+a;
            c=c/10;

        }

        if(b==x){
            System.out.println("是回文数");
        }
        else{
            System.out.println("不是回文数");
        }

    }
}
