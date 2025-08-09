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

//흐름

//Client가 Board에 getRecentPostsIterator() 요청
//
//Board (ConcreteAggregate) 가 RecentPostIterator 생성 후 반환
//
//RecentPostIterator (ConcreteIterator) 가 내부적으로 정렬 후 Iterator 동작 수행
//
//Client는 Iterator의 hasNext()와 next()만 호출해서 순회 → 내부 구현(List, 정렬 방식)은 몰라도 됨

//💡 정리
//
//Board → 집합체(데이터 보관 + Iterator 생성 책임)
//
//RecentPostIterator → 순회 방법(최신순)을 구현한 Iterator
//
//이렇게 하면 나중에 "조회수순", "좋아요순" 같은 다른 순회 방식도 Iterator 클래스를 추가하는 것만으로 쉽게 확장 가능.
