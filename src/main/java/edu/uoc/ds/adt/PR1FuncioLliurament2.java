package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.Stack;

public class PR1FuncioLliurament2 {

    public static void fillQueue(PR1Queue queue) {
        for (int i = 0; i < 15; i++) {
            queue.add((i * i) + (3 * i) + 2);
        }
    }

    public static void fillStack(PR1Stack stack) {
        for (int i = 0; i < 15; i++) {
            stack.push((i * i) + (3 * i) + 2);
        }
    }
}
