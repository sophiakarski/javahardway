// Saving Information in Variablespublic class CreatingVariables {	public static void main( String[] args ) {		int x, y, age, years;		double seconds, e, checking, months;		String firstName, lastName, title, adjective, sibling;				x = 10;		y = 400;		age = 39;		years = 22;		// Additional integer				seconds = 4.71;		e = 2.71828182845904523536;		checking = 1.89;		months = 3.5;		// Additional double				firstName = "Graham";		lastName = "Mitchell";		title = "Mr.";		adjective = "lovely";		sibling = "brother";		// Additional 2 strings				System.out.println( "The variable x contains " + x );		System.out.println( "The value " + y + " is stored in the variable y." );		System.out.println( "The experiment took " + seconds + " seconds." );		System.out.println( "A favourite irrational # is Euler's number: " + e );		System.out.println( "Hopefully you have more than $" + checking + "!" );		System.out.println( "My name's " + title + " " + firstName + lastName );		// Additional printing of new variables		System.out.print( "I am " + years + " years and " + months + " months old.\n" );		System.out.print( "I have a " + adjective + " " + sibling + ".\n" );	}}