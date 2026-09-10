public class TestFactorial{
public static void main(String[] args){
try{
if(Factorail.compute(5)!=120){
return new AssertionError("Testcase failed for input 5");
}
if(Factorial.compute(0)!=1){
return new AssertionError("Testcase failed for input 0");
}
System.out.println("All testcases passed");
}catch(Exception e){
System.out.println("TestCase failed:"+e.getmessage());
}
}
}