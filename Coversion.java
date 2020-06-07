package NumberSystemConversion;

import java.util.*;
public class Coversion {

   
       static void binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
        int base = 1; 
  
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        System.out.print( dec_value); 
    } 
         static void decToBinary(int n) 
    { 
        
        int[] binaryNum = new int[1000]; 
   
        
        int i = 0; 
        while (n > 0)  
        { 
           
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
       
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
         
    }
     
     public static void hextodeci(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             System.out.println( val);  
} 
     private static String octaltohexa(String number) {

		// Convert Octal to Decimal
		int decimal = octaltodeci(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal = Decitohexa(decimal);
                System.out.println(hexadecimal);
		return hexadecimal;
	}

	private static String Decitohexa(int decimal) {

		int remainder = 0;
		StringBuilder hexadecimal = new StringBuilder();
		String result;
		while (decimal != 0) {
			remainder = decimal % 16;
			if (remainder >= 10 && remainder <= 15) {
				char hexChar = getHexadecimalCharacter(remainder);
			
				result = String.valueOf(hexChar);
			} else {
				
				result = String.valueOf(remainder);
			}
			
			hexadecimal.append(String.valueOf(result));
			decimal = decimal / 16;
		}

		
		return hexadecimal.reverse().toString();
	}

	private static int octaltodeci(String number) {

		
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(8, i);
			sum = sum + digit * power;
		}
		return (sum);
	}

	

	private static char getHexadecimalCharacter(int remainder) {

		char ch = '\u0000';
		switch (remainder) {
		case 10:
			ch = 'A';
			break;
		case 11:
			ch = 'B';
			break;
		case 12:
			ch = 'C';
			break;
		case 13:
			ch = 'D';
			break;
		case 14:
			ch = 'E';
			break;
		case 15:
			ch = 'F';
			break;
		}
		return ch;
	}
        static void decToOctal(int n) 
    { 
        
        int[] octalNum = new int[100]; 
  
        int i = 0; 
        while (n != 0)  
        { 
            
            octalNum[i] = n % 8; 
            n = n / 8; 
            i++; 
        } 
  
      
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(octalNum[j]); 
    } 
        public static void BinarytoOctal(long binaryNumber)
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
        System.out.println(octalNumber);
    }
public static void OctalToBinary(int octalNumber)
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

        System.out.println(binaryNumber);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter how many you want to run");
            int m = sc.nextInt();
           for(int i = 0; i <= m; i++) {
        	   System.out.println("1.\t Binary to Decimal");
               System.out.println("2.\t Decimal to Binary");
               System.out.println("3.\t Hexadecimal to Decimal");
               System.out.println("4.\t Decimal to Hexadecimal");
               System.out.println("5.\t Octal to hexadecimal");
               System.out.println("6.\t Octal to Decimal ");
               System.out.println("7.\t Decimal to Octal");
               System.out.println("8.\t Binary to Octal");
               System.out.println("9.\t Octal to Binary");
               System.out.println("10.\t Hexadecimal to Binary");
               
              System.out.println("Your choice?");

            int n = sc.nextInt();
            switch(n){
                case 1:
                     System.out.println("enter a binary number:"+" ");
                      int num = sc.nextInt();
                    binaryToDecimal(num);
                    break;
                case 2:
                     System.out.println("enter a decimal number:"+" ");
                     int no1 = sc.nextInt();
                    decToBinary(no1);
                    break;
                case 3:
                    System.out.println("enter Hexa number :"+" ");
                     String hex = sc.next();
                    hextodeci(hex);
                    break;
                case 4:
                     System.out.println("enter a decimal number:"+" ");
                     int decimal = sc.nextInt();
                     System.out.println(Decitohexa(decimal));
                    break;
                case 5:
                    System.out.println("enter a octal number:"+" ");
                     String no3 = sc.next();
                     octaltohexa(no3);
                    break;
                case 6:
                    System.out.println("enter a octal number:"+" ");
                     String no4 = sc.next();
                    System.out.println(octaltodeci(no4));
                    break;
                case 7:
                    System.out.println("enter a decimal number:"+" ");
                     int no5 = sc.nextInt();
                    decToOctal(no5);
                    break;
                case 8:
                    System.out.println("enter a binary number:"+" ");
                     long no6 = sc.nextInt();
                    BinarytoOctal(no6);
                    break; 
                case 9:
                    System.out.println("enter a octal number:"+" ");
                     int no7 = sc.nextInt();
                    OctalToBinary(no7);
                    break;
                case 10:
                	System.out.println("Please enter Hexadecimal number : ");
                    Scanner scanner = new Scanner(System.in);
                 
                    String hexadecimal = scanner.next();
                    String binary = Integer.toBinaryString(n);
                    System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
                    break; 
                default:
                    System.out.println("Invalid choice");
                    break;
            } 
           }
      sc.close();
    
    }
    
}