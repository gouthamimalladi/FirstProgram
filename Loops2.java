public class Loops2 {
    public static void main(String[] args) {
// enhance for loop
        String s[] = {"gouthami","rani","rithvik","rohan"};
        System.out.println( " array count" +s.length);
        //for(int i =0;i<s.length;i++){
           // System.out.println(s[i]);
        for(String val:s){
            System.out.println(val);
        }
        }
}
