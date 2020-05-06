//Objective
//In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

//Task
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

//Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

//Input Format

//There are  lines of numeric input:
//The first line has a double,MEALCOST(the cost of the meal before tax and tip).
//The second line has an integer,TIPPERCENT(the percentage of MEALCOST being added as tip).
//The third line has an integer,TACPERCENT(the percentage of MEALCOST being added as tax).

//Output Format

//Print the total MEALCOST, where TOTALCOST is the rounded integer result of the entire bill (MEALCOST with added tax and tip).

//Sample Input

//12.00
//20
//8
//Sample Output

//15




public class Arithmetic {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close()// Write your calculation code here.
        double tip= ((mealCost*tipPercent)/100);
        double tax=((mealCost*taxPercent)/100);
        double numberToRoundHere= tip + tax + mealCost;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(numberToRoundHere);
      
        // Print your result
        System.out.printf("The total meal cost is %d dollars.",totalCost);
    }
};
