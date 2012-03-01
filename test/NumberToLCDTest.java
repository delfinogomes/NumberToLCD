import junit.framework.Assert;

import org.junit.Test;

public class NumberToLCDTest {

	@Test
	public void shoudReturnOneOnTheDisplay(){
		String one =	"   \n"
				+	"  |\n"
				+	"  |";
		System.out.println(" 1 => \n"+ NumberToLCD.giveDiplay(1));
		Assert.assertEquals(NumberToLCD.giveDiplay(1), one);
		
	}
	
	@Test
	public void shoudReturnTwoOnTheDisplay(){
		String two = 	" _ \n"
					+	" _|\n"
					+	"|_ ";
		System.out.println(" 2 => \n"+NumberToLCD.giveDiplay(2));
		Assert.assertEquals(NumberToLCD.giveDiplay(2), two);
		
	}
	
	@Test
	public void shoudReturnThreeOnTheDisplay(){
		String three = 	" _ \n"
					+	" _|\n"
					+	" _|";
		System.out.println(" 3 => \n"+NumberToLCD.giveDiplay(3));
		Assert.assertEquals(NumberToLCD.giveDiplay(3), three);
		
	}

	
	@Test
	public void shoudReturnEightOnTheDisplay(){
		String eight = 	" _ \n"
					+	"|_|\n"
					+	"|_|";
		System.out.println(" 8 => \n"+ NumberToLCD.giveDiplay(8));
		Assert.assertEquals(NumberToLCD.giveDiplay(8), eight);
		
	}
	
	@Test
	public void shoudReturnEighteenOnTheDisplay(){
		String eighteen = 	"    _ \n"
						+	"  ||_|\n"
						+	"  ||_|";
		System.out.println("18 => \n"+ NumberToLCD.giveDiplay(18));
		Assert.assertEquals(NumberToLCD.giveDiplay(18), eighteen);
		
	}
	
	@Test
	public void shoudReturnOneHundredThirtyEightOnTheDisplay(){
		String oneHundredThirtyEight = 	"    _  _ \n"
									+	"  | _||_|\n"
									+	"  | _||_|";
		System.out.println("138 => \n"+ NumberToLCD.giveDiplay(138));
		Assert.assertEquals(NumberToLCD.giveDiplay(138), oneHundredThirtyEight);
		
	}

	
	
}
