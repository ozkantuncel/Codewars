import java.util.Scanner;


public class MorseToText {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String morseToChange = "";
		String newText="";
		
		
		char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String[] morseLetters = { " ", ".___", "___...", "___.___.", "___..", ".", "..___.", "______.", "....", "..", "._________", "___.___", ".___..",  "______", "___.", "_________", ".______.", "___ ___ . ___", ". ___ .", ". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};
		
		
		System.out.print("Mors kodunu giriniz:");
		morseToChange = input.nextLine();
		String[] array = morseToChange.split(" ");
		
		
		
		
		
		
		for ( int i =0;i<array.length;i++) {
			for(int j =0;j<morseLetters.length;j++) {
				if(array[i] == morseLetters[j]) {
					newText += letters[j]+" ";
					break;
				}
			}
			
		}
		
		System.out.println("Morse to text: ");
		System.out.print(newText);
		
		
	}
}
