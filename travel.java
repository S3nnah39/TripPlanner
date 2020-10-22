/*Project: Trip Planner
Based on user information, you will help them plan theri trip*/
public class InternationalTrip{
	public static void main(String[] args){
		
		Scanner intro = new Scanner (System.in);
		begin(intro);
		System.out.println("*************************************************");
		
		Scanner mid = new Scanner (System.in);
		inspect(mid);
		System.out.println("*************************************************");
	}
	public static void begin(Scanner introduction){
		System.out.println("\t****WELCOME****");
		System.out.println("The pandemic has caused a worldwide program.");
		
		//Scanner intro = new Scanner(System.in);
		System.out.println("\tHollup");		
		System.out.println("What is your name?");
		String name = introduction.nextline();
		System.out.println("Beautiful name "+ name +", Where we going?");
		String place = introduction.next();
		System.out.println("Aight! Bet!" + place + "it is");	
	}
	public static void inspect(Scanner middle){
		System.out.println("How many days are you going to spend travelling?");
		int days = middle.nextInt();
		
		System.out.println("How much money, in USD, are you planning to spend?");
		int money = middle.nextInt();
		
		System.out.println("Your " + days + " holiday will be equivalent to " + (days*24)+" hours");		
		System.out.println("Now that's what we talking about!!");
		
		System.out.println("Money-wise $"+money+"USD we looking into spending $"+((double)(money/days)));
		System.out.println("\tWe still got money though");	
	}
		
