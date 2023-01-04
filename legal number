
 
package com.mycompany.legalnumber;
public class LegalNumber {
public static int isLegalNumber(int [] array, int base){
     int status=1;
     lb:for(int i=0;i<array.length;i++){
         if(array[i]>=base){
             status=0;
             break lb;
         }
         else
             status=1;
            
     }
     return status;
}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       int s= isLegalNumber(new int[] {5, 9, 12}, 16);
        if(s==1){
            System.out.println("the number is legal number and it is "+s);
        }
        else
        {
            System.out.println("the number is not legal number and it is "+s);
        }
    }
}
