public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String binaryValue;

        if (value == 0) {
            binaryValue = "0";
        } else {
            binaryValue = "";

            while (value >= 1) {
                binaryValue = String.valueOf(value % 2) + binaryValue;
                value = value / 2;
            }
        }

        return binaryValue;
    }
}
