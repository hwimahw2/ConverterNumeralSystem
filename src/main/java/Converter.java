public class Converter {
    public static void main(String[] args) {
        String number = "000000000";
        int a = 2;
        convertToDecimal(noZeros(number), a);
    }

    public static String noZeros(String number){
        int i = 0;
        while(number.charAt(i) == '0'){
            i++;
            if(i == number.length()){
                return "0";
            }
        }
        return number.substring(i, number.length());

    }

    public static void convertToDecimal(String number, int a){
        if(a <= 10) {
            long result = 0;
            int j = number.length() - 1;
            for (int i = number.length() - 1; i >= 0; i--) {
                int element = Integer.parseInt(number.substring(i, i + 1));
                result = result + element * (long) (Math.pow(a, j - i));
            }
            System.out.println(result);
        }else{
            long result = 0;
            int j = number.length() - 1;
            for (int i = number.length() - 1; i >= 0; i--) {
                char checkElement = number.charAt(i);
                int element;
                if((int)(checkElement) >= 97 && (int)(checkElement) <= 122){
                    element = letterToNumber(checkElement);
                }else{
                    element = Integer.parseInt(number.substring(i, i + 1));
                }
                result = result + element * (long) (Math.pow(a, j - i));
            }
            System.out.println(result);
        }
    }

    public static int letterToNumber(char letter){
        return letter - 87;

    }
}
