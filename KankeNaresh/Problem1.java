package KankeNaresh;
public class Problem1 {
    public static int calculate(int a,int b, String operation){
        if(operation.equals("add")){
            return a+b;
        }else if(operation.equalsIgnoreCase("sub")){
            return a-b;
        }else if(operation.equalsIgnoreCase("mul")){
            return a*b;
        }else if(operation.equalsIgnoreCase("div")){
            if(b!=0){
                return a/b;
            }else{
                throw new ArithmeticException("Division by zero not allowed");
            }
        }else{
            throw new IllegalArgumentException("Invalid operation type");
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate(10, 5, "add"));
        System.out.println(calculate(10, 5, "sub"));
        System.out.println(calculate(10, 5, "mul"));
        System.out.println(calculate(10, 5, "div"));
    }
}
