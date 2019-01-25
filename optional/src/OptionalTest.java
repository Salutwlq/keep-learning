import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 15:04
 */


public class OptionalTest {
    public static void main(String[] args) {
        //0001
        Optional<Integer> a = Optional.empty();
        System.out.println("0001:"+a);

        //0002
        Integer b = new Integer(20);
        Optional<Integer> obtB = Optional.of(b);
        System.out.println("0002:"+obtB);

        //0003
        Integer c = obtB.get();
        System.out.println("0003:"+c);

        //0004
        System.out.println("0004:"+Optional.ofNullable(2));

        //0005
        System.out.println("0005:"+obtB.isPresent());

        //0006
        User user = new User();
        user.setId(200);
        user.setName("a");

        System.out.println("0006:"+Optional.ofNullable(user).map(user1 -> user1.getName()).orElse("unknown"));

        //0007
        String s = null;
        System.out.println("0007:"+Optional.ofNullable(s).orElse("unknown"));


    }

    public static class User{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
