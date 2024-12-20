public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("Yaga"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       String lowered = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                lowered += str.charAt(i);
            } else if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                lowered +=(char) ((int) str.charAt(i)+ 32);
            } else if (str.charAt(i) == ' ' ||(str.charAt(i) >= 48 && str.charAt(i) <= 57)){
                lowered += str.charAt(i);
            }
        }
        return lowered;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()) return false; 
        if (str2.isEmpty()) return true; 
        
        String s1 = lowerCase(str1);
        String s2 = lowerCase(str2);
        
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) != s1.charAt(i + j)) {
                    match = false;
                    break;
                }
            }
            
            if (match == true) {
                return true; 
            }
        }
        return false; 
    }
}
