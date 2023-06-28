package bridghlabz.logicalPrograms;

public class CouponNumbers {
    public static void main(String[] args) {
        char[] chars= "abcdefghijklmnopqrstuvwxyzABCDEFGHIGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        //String s = " ";
        int random = (int)(Math.random()*max);
        StringBuffer sb = new StringBuffer();

        while(random>0){
            //int n = random%10;
            //s += String.valueOf(chars[n]);
            //random = random/10;
            sb.append(chars[random% chars.length]);
            random /= chars.length;
        }
        String str = sb.toString();
        System.out.println(str);

    }
}
