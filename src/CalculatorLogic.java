public class CalculatorLogic {
    public String calculate(String expression) {
        String[] parts = expression.split(" ");
        if (parts.length != 3) {
            return "Invalid expression";
        }
        double operand1;
        double operand2;
        try {
            operand1 = Double.parseDouble(parts[0]);
            operand2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            return "Invalid expression";
        }
        String operator = parts[1];
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    return "Divide by zero error";
                }
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 * (operand2 / 100);
                break;
            default:
                return "Invalid operator";
        }
        return Double.toString(result);
    }
}