public class lesson2 {
    public static void main(String[] args) {
        theFirstMethod(12,2);
        System.out.println();
        theSecondMethod(15);
        System.out.println();
        theThirdMethodO(12);
        System.out.println();
        theFourthMethod("test", 15);
    }
    public static boolean theFirstMethod(int a, int b){
        int sum = a+b;
        boolean res = (10 <= sum) && (sum <= 20);
        return res;
    }

    public static void theSecondMethod(int n){
        if(n >= 0){
            System.out.println("the num is positive");
        } else {
            System.out.println("the num is negative");
        }
    }
    public static boolean theThirdMethodO(int n){
        return n < 0;
    }
    static void theFourthMethod(String s, int n){
        for (int i = 0; i < n; i++){
            System.out.println(s);
        }
    }
}
