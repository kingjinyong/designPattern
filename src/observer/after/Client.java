package observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("jinyong");
        User user2 = new User("jinyongyong");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);
        chatServer.register("디자인패턴", user2);

        chatServer.sendMessage(user1, "오징어게임", "아.. 이름이 기억 남");

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");
    }
}
