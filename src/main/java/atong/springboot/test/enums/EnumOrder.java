package atong.springboot.test.enums;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s :Spiciness.values()){
            System.out.println(s+"--order:"+s.ordinal());
        }
    }
}
