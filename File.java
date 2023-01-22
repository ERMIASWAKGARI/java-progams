

package com.mycompany.File;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class File {
    

  public static void main(String[] args) {
   
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    }
     
    }

