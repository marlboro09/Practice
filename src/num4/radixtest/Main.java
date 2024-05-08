package num4.radixtest;

public class Main {
    public static void main(String[] args) {

        String num = "11";

        try {
            int bin = Integer.parseInt(num,2);
            int oct = Integer.parseInt(num,8);
            int dec = Integer.parseInt(num,10);//dec=Integer.parseInt(num)과 같다
            int hex = Integer.parseInt(num,16);

            System.out.println("기본값 : " + num);
            System.out.println("2진수 : " + bin);
            System.out.println("8진수 : " + oct);
            System.out.println("10진수 : " + dec);
            System.out.println("16진수 : " + hex);

        } catch (NumberFormatException e) {
            System.out.println("Error:"+e);
        }
    }
}
