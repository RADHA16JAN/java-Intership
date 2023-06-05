import java.lang.String;
public class question11 {
    public static void main(String[] args) {
        /*
     Take a name of person and reverse the string. Find out if it is a palindrome.

         */
          String st="radar";
          int l=st.length();
          String reversed="";
        System.out.println("Original string is "+" "+st);

        // Reverse of string
          for(int i=l-1;i>=0;i--){
           reversed+=st.charAt(i);
          }
        System.out.println("Reversed string is "+" "+reversed);

          // Check for palindrome
        if(st.equals(reversed)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }



    }
}
