public class Lambda {
    public static void main(String[] args) {


        Lark larkfun = s -> System.out.print(s);
        greeter(larkfun);
    }
    public static void greeter(Lark lambdaLark){
        lambdaLark.display("Josu Fuck off!");
    }

}
interface Lark{
    void display(String s);

}