/**
 * Created by 민규 on 2017-02-12.
 */
import java.util.*;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE=5;
    public static void main(String[] args){
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true){
            System.out.println(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine();

                if ("".equals(input))
                    continue;
                if (input.equalsIgnoreCase("q"))
                    System.exit(0);
                else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help = 도움말을 나타냅니다.");
                    System.out.println("q = 프로그램을 종료합니다.");
                    System.out.println("history = 최대 5개의 최근 목록을 나타냅니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);
                    LinkedList ls = (LinkedList) q;
                    ListIterator it = ls.listIterator();

                    while (it.hasNext())
                        System.out.println(it.next());
                } else {
                    save(input);
                    System.out.println(input);
                }
            }
                catch(Exception o){
                    System. out.println("입력 오류입니다.");
                }
        }
    }
    public static void save(String input){
        if(!"".equals(input))
            q.offer(input);
            if(q.size()>MAX_SIZE)
                q.remove();
    }
}
