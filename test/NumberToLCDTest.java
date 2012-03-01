import junit.framework.Assert;

import org.junit.Test;

public class NumberToLCDTest {

	@Test
	public void shoudReturnOneOnTheDisplay(){
		String one =	"   \n"
				+	"  |\n"
				+	"  |";
		System.out.println(NumberToLCD.giveDiplay(1));
		Assert.assertEquals(NumberToLCD.giveDiplay(1), one);
		
	}
	
	@Test
	public void shoudReturnTwoOnTheDisplay(){
		String two = 	" _ \n"
					+	" _|\n"
					+	"|_ ";
		System.out.println(NumberToLCD.giveDiplay(2));
		Assert.assertEquals(NumberToLCD.giveDiplay(2), two);
		
	}
	
	@Test
	public void shoudReturnThreeOnTheDisplay(){
		String three = 	" _ \n"
					+	" _|\n"
					+	" _|";
		System.out.println(NumberToLCD.giveDiplay(3));
		Assert.assertEquals(NumberToLCD.giveDiplay(3), three);
		
	}

	
	@Test
	public void shoudReturnEightOnTheDisplay(){
		String eight = 	" _ \n"
					+	"|_|\n"
					+	"|_|";
		System.out.println(NumberToLCD.giveDiplay(8));
		Assert.assertEquals(NumberToLCD.giveDiplay(8), eight);
		
	}
	

	
}
