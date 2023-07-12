package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.function.Function.identity;

public class IsraeliQueue <T> {
    private List<QueueElement> israeliQueueList;

    public void insertElement(QueueElement element){
        if(this.israeliQueueList.isEmpty()){
            this.israeliQueueList.add(this.israeliQueueList.indexOf(1),element);
        }else if(!isInFriendList(element)||this.israeliQueueList.indexOf(element.getFirst())>this.israeliQueueList.size()) {
            this.israeliQueueList.add(this.israeliQueueList.indexOf(israeliQueueList.size()), element);
        }else if(isInFriendList(element)){
            this.israeliQueueList.add(this.israeliQueueList.indexOf(element.getFirst())+1,element);
            this.israeliQueueList.stream().sorted(Comparator.comparing(p->p.equals(element.getFirst())));
        }
    }

    private boolean isInFriendList(QueueElement element){
        if (element.equals(element.getSecond().contains(element.getFirst()))){
            return true;
        }else return false;
    }

    public void removeElement(QueueElement element){
        israeliQueueList.remove(element);
    }

    public QueueElement peekForTheFirstGuyAtLine(){
        return this.israeliQueueList.get(1);
    }


}
