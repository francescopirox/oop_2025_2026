package mediateca;

import java.util.ArrayList;
import java.util.List;

public interface Scaffale<S extends Supporto> extends Iterable<S> {
    void add(S item);
    default boolean remove(S item){
        return true;
    }
    List<S> mensola(int index);

    default List<S> cerca(String keyword){
        List<S> ret=new ArrayList<>();
        for(S val: this){
            if(val.getTitolo().titolo().contains(keyword))
                ret.add(val);
        }
        return ret;
    }
}
