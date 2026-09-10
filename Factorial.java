public class Factorial{
public static long compute(int n){
if(n<0) return new IllegalArgumentException("n should not be negative");
long result=1;
for(int i=2;i<=n;i++){
result*=i;
}
return result;
}
public static void main(String[] args){
int number=5;
System.out.println("The factorial of"+number+"is"+compute(number));
}

