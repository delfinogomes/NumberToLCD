public class NumberToLCD {

	private static final String[] ONE = {"   ","  |", "  |"};
	
	public static String giveDiplay(int numberToDisplay) {
		StringBuilder lcd = new StringBuilder();
		Object[] object = new Object[2];
		for (int j = 1; j <= 3; j++) {
			for (Character numberPart : String.valueOf(numberToDisplay).toCharArray()) {
				
				Integer digit = Integer.parseInt(numberPart.toString());
				
				if (digit == 1) {
					if (j == 1) {
						lcd.append("   ");
					} else if (j == 2) {
						lcd.append("  |");
					} else if (j == 3) {
						lcd.append("  |");
					}

				} else if (digit == 2) {
					if (j == 1) {
						lcd.append(" _ ");
					} else if (j == 2) {
						lcd.append(" _|");
					} else if (j == 3) {
						lcd.append("|_ ");
					}

				} else if (digit == 3) {
					if (j == 1) {
						lcd.append(" _ ");
					} else if (j == 2) {
						lcd.append(" _|");
					} else if (j == 3) {
						lcd.append(" _|");
					}

				} else if (digit == 8) {
					if (j == 1) {
						lcd.append(" _ ");
					} else if (j == 2) {
						lcd.append("|_|");
					} else if (j == 3) {
						lcd.append("|_|");
					}

				}
			}
			if (j < 3)
				lcd.append("\n");
		}
		return lcd.toString();
	}

}
