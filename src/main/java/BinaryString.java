public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String sBinary;

        if (value == 0) {
            sBinary = "0";
        } else {
            sBinary = "";

            while (value >= 1) {
                sBinary = String.valueOf(value % 2) + sBinary;
                value = value / 2;
            }
        }

        return sBinary;
    }
}
