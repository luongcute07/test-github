package baitext;
import java.util.Scanner;

public class Chuvi_Dtich_Lecture03 {

	public static void HTron()
    {
         final float pi = (float) 3.14;
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("Nhap vao ban kinh: ");
         float r =keyboard.nextFloat();
        float Dt = r*r*pi;
        float Cv =  2*r*pi;
        System.out.println("Dien tich hinh tron la :"+(float) Math.floor(Dt * 100) / 100);
        System.out.println("Chu vi hinh tron la : "+(float) Math.floor(Cv * 100)/100);
         keyboard.close();
    }
    
    public static void Cn()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai hcn: ");
        float dai = keyboard.nextFloat();
        System.out.print("Nhap vao chieu rong hcn: ");
        float rong = keyboard.nextFloat();
        float Dt = dai * rong;
        float Cv =  2*(dai+rong);
        System.out.println("Dien tich hinh chu nhat la : "+(float) Math.floor(Dt*100)/100);
        System.out.println("Chu vi hinh chu nhat la : "+(float) Math.floor(Cv*100)/100);
         keyboard.close();
    }
    
    public static void Vuong()
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Nhap vao chieu dai canh cua hinh vuong:");
        float a= keyboard.nextFloat();
        float Dt = a*a;
        float Cv =  4*a;
        System.out.println("Dien tich hinh vuong la : "+(float) Math.floor(Dt*100)/100);
        System.out.println("Chu vi hinh vuong la : "+(float) Math.floor(Cv*100)/100);
         keyboard.close();
    }
      public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
          System.out.println("0: Tinh Dt va Chu vi Hinh tron");
          System.out.println("1: Tinh Dt va Chu vi Hinh Chu Nhat");
          System.out.println("2: Tinh Dt va Chu vi Hinh Vuong");
          System.out.print("Nhap vao lua chon : ");
          int luachon = keyboard.nextInt();
          if(luachon==0)
          {
              HTron();
          }
          else if(luachon==1)
          {
              Cn();
          }
          else if(luachon==2)
          {
              Vuong();
          }
           keyboard.close();
    }
}
