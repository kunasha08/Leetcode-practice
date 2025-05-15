package com.pkg.ag2.str;

public class AdjacentDuplicates {
	
    public static String removeDuplicates(String str) {
    	
        StringBuilder sb = new StringBuilder();							//StringBuilder is used to build the result string
        
        for (char ch : str.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {		//If the character in sb matches ch, it means we found an adjacent duplicate
                sb.deleteCharAt(sb.length() - 1);							//so we remove the last character from sb
            } 
            else {
                sb.append(ch);												//otherwise append character to result string
            }
        }
        return sb.toString();
    }
    
	public static void main(String[] args) {
		String str= "azxxzy";
		String res= removeDuplicates(str);
		System.out.println(res);

	}

}
