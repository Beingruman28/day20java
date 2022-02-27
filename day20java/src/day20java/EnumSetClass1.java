package day20java;

import java.util.EnumSet;
//import java.util.Iterator;
//import java.util.Iterator;
//import java.util.Iterator;
import java.util.Set;

public class EnumSetClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Creating EnumSet using range
		
		
		System.out.println("------------------------------------------------------");
		
       	EnumSet<Months> SpringSet = EnumSet.range(Months.FEBRUARY, Months.MARCH);
		System.out.println("Using for each:Iterating EnumSet");
		for (Months months : SpringSet) {
			System.out.println("Months: " + months);
		}
	
		System.out.println("------------------------------------------------------");
		
		EnumSet<Months> SummerSet = EnumSet.range(Months.APRIL, Months.JUNE);
		System.out.println("Using for each:Iterating EnumSet");
		for (Months months : SummerSet) {
			System.out.println("Months: " + months);
		}
	
		System.out.println("------------------------------------------------------");
		
		EnumSet<Months> MonsoonSet = EnumSet.range(Months.JULY, Months.SEPTEMBER);
		System.out.println("Using for each:Iterating EnumSet");
		for (Months months : MonsoonSet) {
			System.out.println("Months: " + months);
		}
	
		System.out.println("------------------------------------------------------");
		
		EnumSet<Months> AutumnSet = EnumSet.range(Months.SEPTEMBER, Months.NOVEMBER);
		System.out.println("Using for each:Iterating EnumSet");
		for (Months months : AutumnSet) {
			System.out.println("Months: " + months);
		}
		System.out.println("------------------------------------------------------");
		EnumSet<Months> WinterSet = EnumSet.range(Months.DECEMBER, Months.JANUARY);
		System.out.println("Using for each:Iterating EnumSet");
		for (Months months : WinterSet) {
			System.out.println("Months: " + months);
		}
			
		
		System.out.println("------------------------------------------------------");
		System.out.println("DO we need umbrella on august? " + needumbrella(MonsoonSet, Months.AUGUST));
		System.out.println("DO we need umbrella on june? " + needumbrella(SummerSet, Months.JUNE));
		System.out.println("DO we need umbrella on march? " + needumbrella(WinterSet, Months.MARCH));
	}

	private static boolean needumbrella(Set<Months> monthSet, Months month) {
		return monthSet.contains(month);
		
	}
}

