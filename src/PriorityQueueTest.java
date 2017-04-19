import java.text.*;
import java.util.*;
import java.io.*;
class PriorityQueueTest {
    // 1. throws 문 선언하거나
    // public static void main(String[] args) throws Exception { 으로 써도 됨
    public static void main(String[] args) {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234','27','07-09');",
                "INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234','27','07-09');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({1},{2},{3},{4});";

        MessageFormat mf = new MessageFormat(pattern);

        // 2. 혹은 try catch 문으로 감싸도 됨
        try {
            for (int i = 0; i < data.length; i++) {
                Object[] r = mf.parse(data[i]);
            }
        } catch (ParseException pex) {
            pex.printStackTrace();
        }
    }
}