package me.hyunsoo.effectivejava.ch_54_not_null_but_empty_collection;

import java.util.Collections;
import java.util.List;

/**
 * null 이 아닌, 빈 컬렉션이나 배열을 반환하라
 * 
 * 컬렉션이나 배열 같은 컨테이너가 비었을 때, null 을 반환하는 메서드를
 * 사용할 때면, 항시 이와 같은 방어 코드를 넣어줘야 한다. 클라이언트에서
 * 방어 코드를 뺴먹으면 오류가 발생할 수 있다. 실제로 객체가 0개일 가능성이
 * 거의 없는 상황에서는 수년 뒤에야 오류가 발생하기도 한다.
 * 
 * 빈 컨테이너를 할당하는 데도 비용이 드니, null 을 반환하는 쪽이 낫다는 주장?
 * 
 * 1. 성능분석 결과 이 할당이 성능 저하의 주범이라고 확인되지 않는 한 성능 차이는 신경 쓸 수준이 못 된다.
 * 2. 빈 컬렉션이나 배열은 굳이 새로 할당하지 않아도 반환할 수 있다. -> immutable한 Collections.에서 제공하는
 * 빈 불변 객체를 사용한다. ex) Collections.emptyList, Collections.emptyMap,
 * Collections.emptySet 등
 * 
 */

public class PlayGround {
    public static void main(String[] args) {
        List<String> tmp = getList();
        if (tmp.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        }
    }

    public static List<String> getList() {
        return Collections.<String>emptyList();
    }
}
