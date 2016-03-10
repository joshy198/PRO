public class MyFirstProgram {
	public static void main(String[] args) {
		int numberOfOutputs; // integer statt int
		Out.print("Please enter the number of outputs: ");
		numberOfOutputs = In.readInt(); // Tippfehler
		for (int i = 1; i <= numberOfOutputs; i++) { // = hat gefehlt
			Out.print("Output number ");
			Out.print(i); // j statt i
			Out.println(": Hello World!");
		} // for } // main } // MyFirstProgram
		System.out.println("Hello second world! Ich habe den Code geändert.");
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	public static void thisIsANewNotWorkingJavaMethod(int uselessJavaArgument){
		System.out.println("Java ist voll ober toll.");
	}
}