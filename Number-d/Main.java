public class Main {

    public static void main(String[] args) {
        int[] data = {0, 1, 63, 127, 255, 256};
        for (int i = 0; i < data.length; i++) System.out.printf("%d: (Binary) %s (Octal) %s (Hex) %s\n", data[i], binary(data[i]), octal(data[i]), hexaDecimal(data[i]));
    }

    public static String octal(int decimal) {
        int[] octal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal <= 8) octal[8] = decimal;
        if (decimal > 8) {
            for (int i = octal.length - 1; i >= 0; i--) {
                octal[i] = decimal % 8;
                decimal /= 8;
                } }
        String returnBuild = "";
        for (int i = 0; i < octal.length; i++) returnBuild += Integer.toString(octal[i]);
        return returnBuild;
    }
    public static String hexaDecimal(int decimal) {
        int[] hexaDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal < 16) hexaDecimal[8] = decimal;
        if (decimal >= 16) {
            for (int i = hexaDecimal.length - 1; i >= 0; i--) {
                hexaDecimal[i] = decimal % 16;
                decimal /= 16;
            } }
        String returnBuild = "";
        for (int i = 0; i < hexaDecimal.length; i++) {
            switch (hexaDecimal[i]) {
                case 10:
                    returnBuild += 'A';
                    break;
                case 11:
                    returnBuild += 'B';
                    break;
                case 12:
                    returnBuild += 'C';
                    break;
                case 13:
                    returnBuild += 'D';
                    break;
                case 14:
                    returnBuild += 'E';
                    break;
                case 15:
                    returnBuild += 'F';
                    break;
                default:
                    returnBuild += Integer.toString(hexaDecimal[i]);
                    break;
            } }
        return returnBuild;
    }

    public static String binary(int decimal) {
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal <= 1) binary[8] = decimal;
        if (decimal > 1) {
            for (int i = binary.length - 1; i >= 0; i--) {
                if (Math.pow(2, i) > decimal) binary[(binary.length - 1) - i] = 0;
                if (Math.pow(2, i) <= decimal) {
                    binary[(binary.length - 1) - i] = 1;
                    decimal -= Math.pow(2, i);
                } } }
        String returnBuild = "";
        for (int i = 0; i < binary.length; i++) returnBuild += Integer.toString(binary[i]);
        return returnBuild;
    }
}
