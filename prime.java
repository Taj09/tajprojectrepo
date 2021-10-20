import java.util.Scanner;


public class prime{

     
public static void main(String []args){

        int i;

        int n=0;

        System.out.Println("Prime Numbers Between 1 to 100 are:-");

        for (i=2;i<=100;i++)

        {

           for (int j=1;j<=i;j++)

           {

               if(i%j==0)

               n++;

            }

              if(n==2)

              System.out.println(+i);

              n=0;

        }
    
  }

    }
