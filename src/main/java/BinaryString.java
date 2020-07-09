public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryValue = new StringBuilder();

        while (value >= 1) {
            binaryValue.append(value % 2);
            value = value / 2;
        }

        return (binaryValue.length() == 0 ? "0" : binaryValue.reverse().toString());
    }
}
