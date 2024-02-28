package myenumtester;
import enumtask.RainbowColor;

public class EnumTester {

	public static void main(String[] args) {
		
		for(RainbowColor color : RainbowColor.values()) {
			System.out.println("\nThe colorcode of "+color+" is '"+color.getColorCode()+"'");
		}
		
		for(RainbowColor color : RainbowColor.values()) {
			System.out.println("\nThe index of "+color+" is '"+color.ordinal()+"'");
		}

	}

}
