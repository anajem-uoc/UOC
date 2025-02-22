package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        for (int i = 0; i < 15; i++) {
            pr1q.push((i*i) + (3*i)+ 2);
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());
        Assert.assertEquals(240, pr1q.pop());
        Assert.assertEquals(210, pr1q.pop());
        Assert.assertEquals(182, pr1q.pop());
        Assert.assertEquals(156, pr1q.pop());
        Assert.assertEquals(132, pr1q.pop());
        Assert.assertEquals(110, pr1q.pop());
        Assert.assertEquals(90 , pr1q.pop());
        Assert.assertEquals(72 , pr1q.pop());
        Assert.assertEquals(56 , pr1q.pop());
        Assert.assertEquals(42 , pr1q.pop());
        Assert.assertEquals(30 , pr1q.pop());
        Assert.assertEquals(20 , pr1q.pop());
        Assert.assertEquals(12 , pr1q.pop());
        Assert.assertEquals(6 , pr1q.pop());
        Assert.assertEquals(2 , pr1q.pop());
        assertEquals(0, this.pr1q.getStack().size());
    }
}
