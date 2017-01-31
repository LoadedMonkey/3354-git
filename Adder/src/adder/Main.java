package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        } catch (ArithmeticException e){
		System.err.println("Please use - to subtract");
	}
    }

    private static int addArguments(String[] args) {
	    int total;
	    for (int x = 0; x< args.length(); x++)
		    total += args[x];
        
	    return total;
    }
}
