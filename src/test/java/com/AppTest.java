package com;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void arrayContains() {
        Assert.assertTrue(App.contains(new int[] { -50, 2, 5, 30, 100 }, 5));
    }

    @Test
    public void arrayDoesNotContain() {
        Assert.assertFalse(App.contains(new int[] { -2, 0, 4, 30, 100 }, 5));
    }

    @Test
    public void arrayContainsFirstElement() {
        Assert.assertTrue(App.contains(new int[] { 5, 6, 7, 8, 9, 10 }, 5));
    }

    @Test
    public void arrayContainsLastElement() {
        Assert.assertTrue(App.contains(new int[] { 1, 2, 3, 4, 5 }, 5));
    }

    @Test
    public void arrayContainsDuplicateElements() {
        Assert.assertTrue(App.contains(new int[] { -1, 2, 3, 5, 5, 5, 6, 8, 9 }, 5));
    }

    @Test
    public void arrayContainsOnlyDuplicateElements() {
        Assert.assertTrue(App.contains(new int[] { 5, 5 }, 5));
    }

    @Test
    public void singleItemArrayContains() {
        Assert.assertTrue(App.contains(new int[] { 1 }, 1));
    }

    @Test
    public void singleItemArrayDoesNotContain() {
        Assert.assertFalse(App.contains(new int[] { 0 }, 1));
    }

    @Test
    public void emptyArray() {
        Assert.assertFalse(App.contains(new int[] {}, 1));

    }

    @Test
    public void nullArray() {
        Assert.assertFalse(App.contains(null, 1));

    }

}
