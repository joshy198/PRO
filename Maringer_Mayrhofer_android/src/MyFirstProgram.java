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
		System.out.println("Hello second world! Ich habe den Code ge�ndert.");
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	// now its a working java method! :)
	public static void thisIsANewNotWorkingJavaMethod(int uselessJavaArgument){
		System.out.println("Java ist voll ober toll.");
		Out.Print("Useless java argument: "+uselessJavaArgument);
		Out.Print("Better use of useless Argument: "+uselessArgument*2);
		int a = 1; //Variable zum fixxen des Bugs
		System.out.println(a);
		int a = 123 + 23;
	}
}
