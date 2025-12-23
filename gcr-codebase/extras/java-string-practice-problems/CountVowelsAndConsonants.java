import java.util.*;

//Create class countVowelsAndConsonants to count vowels and consonants
public class CountVowelsAndConsonants{

  //Method to count vowels and consonants
	public static int [] vowelsAndConsonantsCounter(String text){
       
       int countVowels=0;
       int countConsonants=0;
       char vowels[]={'a','e','i','o','u'};
       for(char ch:text.toCharArray())
       {
       	 boolean flag=false;
         for(char v:vowels)
         {
           if(ch==v)
           {
           	flag=true;
           	break;
           }
         }

         if(flag)
         	{
         		countVowels++;
         	}
         	else{
         		countConsonants++;
         	}
       }

       return new int[]{countVowels,countConsonants};
	}
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text");
        String text=sc.next();
        int[] result = vowelsAndConsonantsCounter(text);

        //Displaying the result
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }
}