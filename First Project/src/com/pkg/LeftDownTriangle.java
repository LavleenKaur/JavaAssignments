package com.pkg;

public class LeftDownTriangle {
    public void pyramid() {
      int i,j;
      for (i=1;i<=5;i++) {
        for(j=5;j>=i;j--) {
          System.out.print("*");
        }
        System.out.println(" ");
      }
      
    }
    public static void main(String[] args) {
      LeftDownTriangle r=new LeftDownTriangle();
      r.pyramid();
    }

  }


