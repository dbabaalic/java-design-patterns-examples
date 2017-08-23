package behavioural.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        Expression lion = new TerminalExpression("lion");
        Expression bear = new TerminalExpression("bear");
        Expression tiger = new TerminalExpression("tiger");
        Expression tigerOrBear = new OrExpression(tiger, bear);
        Expression tigerAndBear = new AndExpression(tiger, bear);


        String context = "lion is animal, just like bear and giraffe";

        System.out.println("Finding lion: " + lion.interpret(context));
        System.out.println("Finding bear: " + bear.interpret(context));
        System.out.println("Finding tiger: " + tiger.interpret(context));
        System.out.println("Finding tiger or bear: " + tigerOrBear.interpret(context));
        System.out.println("Finding tiger and bear: " + tigerAndBear.interpret(context));

    }
}
