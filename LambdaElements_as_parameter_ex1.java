interface StringFunction {
    String run(String str);
}

public class LambdaElements_as_parameter_ex1 {

    public static void main(String[] args) {
        
        StringFunction exclaim = (s) -> s + "!";
        
        StringFunction ask = (s) -> s + "?";

        funcPrintFormatted("What a f...", exclaim);
        funcPrintFormatted("Is this real", ask);
    }

    public static void funcPrintFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println("result: " + result);
    }
}