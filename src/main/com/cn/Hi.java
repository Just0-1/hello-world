package main.com.cn;

public class Hi {
    public static void main(String[] args) {
        System.out.println("hi git");
        new Say().say();

    }

    static class Say {
        public void say() {
            System.out.println("goodbye");
            Random r = new Random();
        }
    }
}
