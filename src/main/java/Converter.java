public class Converter {
    public static void main(String[] args) {
        String number = "01222121";
        int a = 3;
        int b = 36;
        long numberInDecimal = convertFromAToDecimal(noZeros(number), a , b);
        String result = convertToBNumeralSystem(numberInDecimal, b);
        System.out.println(result);
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

    public static long convertFromAToDecimal(String number, int a, int b){
        long result = 0;
        if(a <= 10) {
            int j = number.length() - 1;
            for (int i = number.length() - 1; i >= 0; i--) {
                int element = Integer.parseInt(number.substring(i, i + 1));
                result = result + element * (long) (Math.pow(a, j - i));
            }
            System.out.println(result);
        }else{
            int j = number.length() - 1;
            for (int i = number.length() - 1; i >= 0; i--) {
                char checkElement = number.charAt(i);
                int element;
                if((int)(checkElement) >= 97 && (int)(checkElement) <= 122){
                    element = letterToNumber(checkElement);
                }else{
                    element = Integer.parseInt(number.substring(i, i + 1));
                }
                result = result + element * (long)(Math.pow(a, j - i));
            }
            System.out.println(result);
        }
        return result;
    }

    public static String convertToBNumeralSystem(long numberInDecimal, int b){
        StringBuffer sb = new StringBuffer();
        long n = numberInDecimal;
        long q = b;
        while(n >= 1){
            long r = n % b;
            q = n / b;
            if(r >= 10){
                sb.append(numberToLetter(r));
                n = q;
                continue;
            }else{
                sb.append(r);
                n = q;
            }
        }
        return sb.reverse().toString();
    }

    public static int letterToNumber(char letter){
        return letter - 87;
    }

    public static char numberToLetter(long number){
        return (char)(number + 87);
    }
}
