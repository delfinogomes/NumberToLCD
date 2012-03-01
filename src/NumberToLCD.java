
public class NumberToLCD {

	public static String giveDiplay(int i) {
		if (i == 1)
			return "   \n  |\n  |";
		else if( i == 2)
			return " _ \n _|\n|_ ";
		else if ( i == 3)
			return " _ \n _|\n _|";
		else
			return " _ \n|_|\n|_|";
	}

}
