//Write a java program to remove all white spaces from a string.?
package Sriman_Sir_11;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s ="Java concept of the day                All is Well";
		
		String sWithoutSpace = s.replaceAll("\\s", "");
		System.out.println(sWithoutSpace);
	}

}
