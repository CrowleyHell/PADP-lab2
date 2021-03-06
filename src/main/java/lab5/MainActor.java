package lab5;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;

import java.util.HashMap;
import java.util.Map;

public class MainActor extends AbstractActor {
    private final Map<String, Integer> store = new HashMap<>();
    public Receive createReceive(){
        return ReceiveBuilder.create()
                .match(String.class, s -> {
                    sender().tell(store.getOrDefault(s, (int)-1.0), ActorRef.noSender());
                })
                .match(MessageStore.class, m->{
                    store.putIfAbsent(m.getUrl(), m.getTime());
                })
                .build();
    }
}
