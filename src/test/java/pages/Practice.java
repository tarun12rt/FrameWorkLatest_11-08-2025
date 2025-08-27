package pages;

public class Practice {

    public static String reverse(String str){
        String reversed = "";
        char[] chars = str.toCharArray();
        for(int i = chars.length-1; i>=0; i--){
            reversed = reversed+chars[i];
        }
        return reversed;
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main (String[] args){
        System.out.println(reverse("Tarun"));
        System.out.println(isPalindrome("madam"));
    }



}
