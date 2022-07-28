import java.util.Scanner;
//1.3.2 Tema pentru acasa _ Carmen Ciurtin
public class Main {
    public static void main(String[] args) {
        // Afisare rezulate
        //a.1
        outputMessage("Imi place Java", 1);
        //a.2
        outputMessage("Cursul acesta este foarte fain!", 6);
        //a.3
        computeAgeByDifference( 24, 6);
        //a.4
        readInputMessage();
        //a.5
        myVariables();
        //a.6
        readInputNumber(2);
        //a.7
        computeSum(readInputNumber(), 5);
        computeDiff(readInputNumber(), 12.3);
        computeMultiply(readInputNumber(), -2.3);
        computeDivide(readInputNumber(), 4);
        computeModulo(readInputNumber(), 6);
        //a.8
        solution();
        outputMessage("x is 12", 1);
        outputMessage("y is 2", 1);
    }

    // Definire coduri
    // a.1
    public static void outputMessage(String outputMessage, int messageCount) {
        for (int i = 0; i < messageCount; i++) {
            System.out.println(outputMessage);
        }
    }

    // a.2
    public static void computeAgeByDifference(int ageAna, int ageDifference) {
        int ageDavid = ageAna - ageDifference;
        outputMessage("David's age is: " + ageDavid, 1);
    }

    // a.3
    public static void readInputMessage() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter input message: ");
        String inputMessage = console.nextLine();
        outputMessage(inputMessage, 1);
    }

    // a.4
    public static void myVariables() {
        int varInt = 2;
        String varStr = "integer number";
        boolean varBool = true;
        outputMessage("varInt is : " + varInt, 1);
        outputMessage("varStr is : " + varStr, 1);
        outputMessage("varBool is : " + varBool, 1);
    }

    // a.5
    public static void readInputNumber(int numberCount) {
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < numberCount; i++) {
            readInputNumber();
        }
    }

    // a.6
    public static double readInputNumber() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter input number: ");
        double inputNumber = console.nextDouble();
        outputMessage(String.valueOf(inputNumber), 1);
        return inputNumber;
    }

    // a.7
    public static void computeSum(double var1, double var2) {
        double varResult = var1 + var2;
        outputMessage(String.valueOf(varResult), 1);
    }

    public static void computeDiff(double var1, double var2) {
        double varResult = var1 - var2;
        outputMessage(String.valueOf(varResult), 1);
    }

    public static void computeMultiply(double var1, double var2) {
        double varResult = var1 * var2;
        outputMessage(String.valueOf(varResult), 1);
    }

    public static void computeDivide(double var1, double var2) {
        double varResult = var1 / var2;
        outputMessage(String.valueOf(varResult), 1);
    }

    public static void computeModulo(double var1, double var2) {
        double varResult = var1 % var2;
        outputMessage(String.valueOf(varResult), 1);
    }

    // a.8
    public static void solution() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}


