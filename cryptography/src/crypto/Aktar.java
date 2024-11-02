package crypto;

/**
 *
 * @author Aktaruzzaman and Musfiq
 */
public class Aktar {
    static String alpha = "zxwvbtrqpmylkjihugfsnedoca";
    public static String Aktar_enc(String plain , int key)
    {
       String cipher = "";
       for(int i = 0; i<plain.length();i++)
       {
           char x = plain.charAt(i);
           int index = alpha.indexOf(x);

           int newIndex = (index + 2 + key)%26+1;
           char y = alpha.charAt(newIndex);
           cipher += y;
       }
       return cipher;
    }

    public static String Aktar_dec(String cipher , int key)
    {
       String plain = "";
       for(int i = 0; i<cipher.length();i++)
       {
           char x = cipher.charAt(i);
           int index = alpha.indexOf(x);

           int newIndex = (index - 2 - key + 26)%26-1;
           char y = alpha.charAt(newIndex);
           plain += y;
       }
       return plain;
    }
    
}