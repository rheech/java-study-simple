import java.text.*;
import java.util.*;
import java.io.*;
class PriorityQueueTest {
    public static void main(String[] args) {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234','27','07-09');",
                "INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234','27','07-09');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({1},{2},{3},{4});";

        MessageFormat mf = new MessageFormat(pattern);

        for(int i =0; i<data.length; i++)
        Object[] r = mf.parse(data[i]);
    }
}