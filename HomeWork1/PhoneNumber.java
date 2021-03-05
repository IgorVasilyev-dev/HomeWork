package HomeWork1;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(num));
    }

    public static String createPhoneNumber(int[] num) {
        StringBuilder sb = new StringBuilder();

            for (int i = 0; i < num.length; i++) {
                if (i == 0) {
                    sb.append("(").append(num[0]);
                }else if (i == 2) {
                    sb.append(num[2]).append(") ");
                }else if (i == 5) {
                    sb.append(num[5]).append("-");
                }
                else {
                    sb.append(num[i]);
                }
            }
        return sb.toString();
    }
}
