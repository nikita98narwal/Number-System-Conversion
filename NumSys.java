package NumberSystemConversion;

import java.util.Scanner;

public class NumSys {
	public static int getDecimal(int octal){    
	    int decimal = 0;    
	    int n = 0;     
	    while(true){    
	      if(octal == 0){    
	        break;    
	      } else {    
	          int temp = octal%10;    
	          decimal += temp*Math.pow(8, n);    
	          octal = octal/10;    
	          n++;    
	       }    
	    }    
	    return decimal;    
	}    
	public static String toOctal(int decimal){    
	    int rem;  
	    String octal="";  
	    char octalchars[]={'0','1','2','3','4','5','6','7'};    
	    while(decimal>0)  
	    {  
	       rem=decimal%8;   
	       octal=octalchars[rem]+octal;   
	       decimal=decimal/8;  
	    }  
	    return octal;  
	}    
	public static int convertBinarytoOctal(long binaryNumber)
    {
        int octalNumber = 0, decimalNumber = 0, i = 0;
        while(binaryNumber != 0)
        {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }
        i = 1;
        while (decimalNumber != 0)
        {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }
	public static long convertOctalToBinary(int octalNumber)
    {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;
        while(octalNumber != 0)
        {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }
        i = 1;
        while (decimalNumber != 0)
        {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        return binaryNumber;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getDecimal(n));
		System.out.println(toOctal(n));
		System.out.println(convertBinarytoOctal(n));
		System.out.println(convertBinarytoOctal(n));
		sc.close();
	}
	

}
