import java.util.HashMap;
import java.util.Map;

public class NumberToLCD {

	private static final Map<Character, String[]> mapa;
	
	static {
		mapa = new HashMap<Character, String[]>();
		
		String[] zero = {	" _ "
						,	"| |"
						,	"|_|"};
		
		String[] one = {	"   "
						,	"  |"
						,	"  |"};
		String[] two = {	" _ "
						,	" _|"
						,	"|_ "};
		String[] three = {	" _ "
						,	" _|"
						,	" _|"};
		String[] four = {	"   "
						,	"|_|"
						,	"  |"};
		String[] five = {	" _ "
						,	"|_ "
						,	" _|"};
		String[] six = {	" _ "
						,	"|_ "
						,	"|_|"};
		String[] seven = {	" _ "
						,	"  |"
						,	"  |"};
		String[] eight = {	" _ "
						,	"|_|"
						,	"|_|"};
		String[] nine = {	" _ "
						,	"|_|"
						,	"  |"};
		
		mapa.put('0', zero);
		mapa.put('1', one);
		mapa.put('2', two);
		mapa.put('3', three);
		mapa.put('4', four);
		mapa.put('5', five);
		mapa.put('6', six);
		mapa.put('7', seven);
		mapa.put('8', eight);
		mapa.put('9', nine);
		
		
	}
	
	
	public static String giveDiplay(int numberToDisplay) {
		StringBuilder lcd = new StringBuilder();
		
		for (int j = 1; j <= 3; j++) {
			for (Character numberPart : String.valueOf(numberToDisplay).toCharArray()) {
				lcd.append(mapa.get(numberPart)[j-1]);
			}
			if (j < 3)
				lcd.append("\n");
		}
		return lcd.toString();
	}

}
