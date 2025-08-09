package iterator.after;

import iterator.before.Post;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인1");
        board.addPost("디자인2");
        board.addPost("디자인3");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostsIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}
