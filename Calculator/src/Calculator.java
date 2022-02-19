import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);
    private int num1;
    private int num2;

    public void start(){
        System.out.println("********************"+"\n"+
                "1 - Addition"+"\n"
        +"2 - Subtraction"+"\n"
        +"3 - Division"+"\n"
        +"4 - Multiplication"+"\n"
        +"5 - Absolute value"+"\n"
        +"6 - Türev"+"\n"
        +"7 - Integral"+"\n"
        +"8 - Mod"+"\n"
        +"9 - Factorial");
        System.out.println("Please choose a process: ");
        int select = scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("You chose addition process !\n");
                    System.out.println("Please enter two numbers: ");
                    System.out.println("First Number : ");
                    int num1 = scanner.nextInt();
                    System.out.println("Second Number : ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result : "+addition(num1,num2));
                    break;
                case 2:
                    System.out.println("You chose subtraction process !\n");
                    System.out.println("Please enter two numbers: ");
                    System.out.println("First Number : ");
                    int a = scanner.nextInt();
                    System.out.println("Second Number : ");
                    int b = scanner.nextInt();
                    System.out.println("Result : "+subtraction(a,b));
                    break;
                case 3:
                    System.out.println("You chose division process !\n");
                    System.out.println("Please enter two numbers: ");
                    System.out.println("First Number : ");
                    int n1 = scanner.nextInt();
                    System.out.println("Second Number : ");
                    int n2 = scanner.nextInt();
                    System.out.println("Result : "+division(n1,n2));
                    break;
                case 4:
                    System.out.println("You chose multiplication process !\n");
                    System.out.println("Please enter two numbers: ");
                    System.out.println("First Number : ");
                    int nm1 = scanner.nextInt();
                    System.out.println("Second Number : ");
                    int nm2 = scanner.nextInt();
                    System.out.println("Result : "+multiplication(nm1,nm2));
                    break;
                case 5:
                    System.out.println("You chose absolute value process !\n");
                    System.out.println("First Number : ");
                    int one = scanner.nextInt();
                    System.out.println("Result : "+abs(one));
                    break;
                case 6:
                    System.out.println("You chose turev process !\n");
                    System.out.println("Enter coefficient: ");
                    double conf = scanner.nextDouble();
                    System.out.println("Enter power: ");
                    double power = scanner.nextDouble();
                    turev(conf,power);
                    break;
                case 7:
                    System.out.println("You chose integral process !\n");
                    System.out.println("Enter coefficient: ");
                    double c = scanner.nextDouble();
                    System.out.println("Enter power: ");
                    double p = scanner.nextDouble();
                    integral(c,p);
                case 8:
                    System.out.println("You chose take mod process !\n");
                    System.out.println("Enter a number : ");
                    double s = scanner.nextDouble();
                    if(s % 2 == 0){
                        System.out.println("Even : "+s);
                    }else {
                        System.out.println("Odd : "+s);
                    }
                    break;
                case 9:
                    System.out.println("You chose factorial process !\n");
                    System.out.println("Enter a number : ");
                    int factor = scanner.nextInt();
                    System.out.println("Factorial : "+factorial(factor));
                    break;
                default:
                    System.out.println("No valid value");
                    break;
            }

    }

    public int addition(int num1,int num2){
        return num1 + num2;
    }

    public int subtraction(int num1,int num2){
        return num1 - num2;
    }

    public int division(int num1,int num2){
        return num1 / num2;
    }

    public int multiplication(int num1,int num2){
        return num1 * num2;
    }

    public int abs(int num1){
        return Math.abs(num1);
    }

    public static void turev(double coefficient, double power)
    {
        double x0,fx0,x1,fx1,result,h=0.00001;

        fx0=Math.pow(coefficient, power);
        fx0=fx0*coefficient;
        System.out.println("fx0 "+fx0);
        x1=coefficient+h;
        fx1=Math.pow(x1, power);
        fx1=fx1*coefficient;
        result=(fx1-fx0)/(x1-coefficient);
        System.out.println("x="+coefficient+" At point, the approximate derivative of the function is: "+result);
    }

    public static void integral(double coefficient, double power)
    {
        double a,b,h,result=0,x,F,F_ilk,F_son;

        h=0.0001;
        for(x=coefficient+h;x<=power;x+=h)
        {
            F=Math.pow(x, power);
            F=F*coefficient;
            result=result+F*h;
        }
        F_ilk=Math.pow(coefficient, power);
        F_ilk=F_ilk*coefficient;
        F_son=Math.pow(coefficient, power);
        F_son=F_son*coefficient;
        result=result+h/2*(F_ilk+F_son);

        System.out.println("x = "+coefficient+" and "+power+" The approximate integral of the function is: "+(int)result);
    }

    public int factorial(int num){
        int fact = 1;
        for (int i = num;i>=1;i--){
            fact *= i;
        }
        return fact;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
