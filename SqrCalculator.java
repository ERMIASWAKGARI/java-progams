
package com.mycompany.sqrcalculator;
import java.util.Scanner;
public class SqrCalculator {
public static int isSquare(int n){
    int status=0;int pro, i;
    lb:for(  i=0;i<n;i++){
        pro=i*i;
        if(pro==n){
         status=1;
        
        break lb;}
        
        else 
            status=0;
}
    return status;
}
public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter a number");
        int x;
        x=sc.nextInt();
    int s=isSquare(x);
    if(s==1){
        System.out.println("The number is square.And it is "+s);
    }
    else
    {System.out.println("The number is not a square and it is "+s);
}
}
}
