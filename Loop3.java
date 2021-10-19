public class Loop3 {
    public static void main(String[] args) {

        String s[] = {"gouthami", "rani", "rithvik", "rohan"};
        System.out.println(" array count" + s.length);

        for (String val : s) {
            System.out.println(val);
            if (val.equals("rohan")) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        }
    }
}
