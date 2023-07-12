package org.example;

import java.util.List;

public class QueueElement <T> {
    private T element;
    private List<T> friendList;

    public QueueElement(T element, List<T> friendList) {
        this.element = element;
        this.friendList = friendList;
    }

    public T getFirst() {
        return element;
    }

    public List<T> getSecond() {
        return friendList;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setFriendList(List<T> freindList) {
        this.friendList = freindList;
    }

    @Override
    public String toString() {
        return "Pair{" + element +
                "," + friendList + "}";
    }
}
