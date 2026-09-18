package Lec21;

public class Letter_Combination_of_a_Phone_Number {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main() {
        String str = "239";//button ka string 
        KeyPaid(str, "");
    }

    public static void KeyPaid(String ques, String ans) {
        char ch=ques.charAt(0);//'2'
        String press=key[ch-'0'];//2 pass krne pr ASCII value aa jayega 
        //jab number ko string me badlna ho to 
        for(int i=0;i<press.length();i++){
        KeyPaid(ques.substring(1), ans+press.charAt(i));
        }
    }
}
