public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryValue = new StringBuilder();

        do {
            binaryValue.append(value % 2);
            value = value / 2;
        } while (value >= 1);

        return binaryValue.reverse().toString();
    }
}
