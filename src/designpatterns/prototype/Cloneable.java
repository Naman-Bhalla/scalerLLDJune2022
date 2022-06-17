package designpatterns.prototype;

import java.util.ArrayList;

// E -> Element
// K, V -> Key, Value
// T -> Type
public interface Cloneable<E> {
    E clone();
}

// vector<int>
// vector<Animal>
// ArrayList<Integer>
// ArrayList<Long>
// ArrayList<Bird>