


public class Main {
	
	boolean isVowel(char c) 
	{
		String vowelStr = "aeiouAEIOU";
		return vowelStr.indexOf(c) >= 0;
	}
	
	public String reverseVowels(String s) {
        
        char[] result = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
        	if (!isVowel(result[left])) {
        		left++; continue;
        	}
        	if (!isVowel(result[right])) {
        		right--; continue;
        	}
        	char temp = result[left];
        	result[left] = result[right];
        	result[right] = temp;
        	left++; right--;
        }
        return new String(result);
    }
	
	public static void main(String[] args){
		
	    System.out.println("Test is a test");
	}
}
