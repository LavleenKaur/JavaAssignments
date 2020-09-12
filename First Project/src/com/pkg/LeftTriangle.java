package com.pkg;

public class LeftTriangle {
    public void pyramid() {
      int i,j;
      for (i=1;i<=5;i++) {
        for(j=1;j<=i;j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
    public static void main(String[] args) {
      LeftTriangle r=new LeftTriangle();
      r.pyramid();
    }
}
