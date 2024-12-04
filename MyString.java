public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
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
    
        String nStr1 = lowerCase(str1); 
        String nStr2 = lowerCase(str2);
    
        int j = 0; 
        int count = 0; 
    
        for (int i = 0; i < nStr1.length(); i++) {
            if (nStr1.charAt(i) == nStr2.charAt(j)) {
                count++;
                j++;
            } else {
                count = 0;
                j = 0; 
            }
            if (count == nStr2.length()) {
                return true; 
            }
        }
    
        return false; 
    }
}
