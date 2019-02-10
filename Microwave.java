import java.util.*;

public class Microwave{

    // Intro Constants:
    private static final double pizza = 0.75;
    private static final double sub = 1;
    private static final double soup = 1.75;
    private static foodMap<String, Double> foodMap = new HashMap<String, Double>();
    private static timeMap<String, Double> timeMap = new HashMap<String, Double>();
    

    // Intro Variables:
    public static int itemCount;
    public static String item = "";
    public static double cooktime;

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        f.put("pizza", 0.75);
        foodMap.put("sub", 1.0);
        foodMap.put("soup", 1.75);

        // Asking for and storing data:
        System.out.println("What food do you want?     (sub, pizza, soup) \n"); item = userInput.next();
        System.out.println("How many do you want?    (1, 2, 3) \n"); itemCount = userInput.nextInt();
        

        cooktime = foodMap.get(item) * timeMap; System.out.println(cooktime);
        
        
        
    }
}