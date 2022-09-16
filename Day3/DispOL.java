package Day3;

public class DispOL {
    public void Display(int Count,String colour){
        System.out.println("Total count "+Count+" with "+colour);
    }
    public void Display(int Count,String colour,String Size){
        System.out.println("Total count "+Count+" with "+colour+" and "+Size+" size ");
    }
    public static void main(String[]args){
        DispOL DP=new DispOL();
        DP.Display(20,"pink");
        DP.Display(20,"pink","Xl");
    }
}
