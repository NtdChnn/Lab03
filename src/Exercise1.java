
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Exercise1 {
    public static void main(String[] args) {
        
        int num = 2; 
        int Num = 0;
        int reversed = 0;
        int count = 0;
        boolean checkPrime = false;

        for(;count < 100; num++)
        {
            Num = num;
            reversed = 0;
        while(Num != 0) {
            int digit = Num % 10;
            reversed = reversed * 10 + digit;
            Num /= 10;
        }
        
        
        if( num == reversed )
        {
            for(int x = 2 ; x<=num ;)
            {
                if(num%x != 0)
                {
                    if(x == num-1)
                    {
                        checkPrime = true;
                    }
                    x++;
                }else x += num;
            }
        }
        
        if(num == 2)
        {checkPrime = true;}
        
        if(checkPrime == true)
        {
            checkPrime = false;
            count++;
            if((count-1) %10 == 0)
            {
                System.out.printf("\n");
            }
            System.out.print(num+" ");
        }
        
        
        }
    }
}
