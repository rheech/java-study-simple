import java.text.*;
class PriorityQueueTest {
    // public static void main(String[] args) {
    public static void main(String[] args)  throws Exception {
        String[] data = {
                "Insert - (망고,아시발몰라,아존나몰라,메롱)",
                "Insert - (아존나,왤케어려워,왜안되,아시발)"
        };
        String pattern = "Insert - ({0},{1},{2},{3})";

        MessageFormat m = new MessageFormat(pattern);

        for(int i =0; i<data.length; i++) {
                Object[] obj = m.parse(data[i]);
                for (int j = 0; j < obj.length; j++)
                    System.out.print(obj[j]);
                System.out.println();
        }
    }
}