package Day3;

public class ExtendMathOperation extends MathOperations{
    public void Additon(int A,int B,int C){
        int a=A;
        int b=B;
        int c=C;
        int D=A+B+C;
        System.out.println("Addition "+D);
    }
    public static void main(String[] args){
        ExtendMathOperation EX = new ExtendMathOperation();
        EX.addition(40,50);
        EX.Additon(10,20,30);
    }
}
