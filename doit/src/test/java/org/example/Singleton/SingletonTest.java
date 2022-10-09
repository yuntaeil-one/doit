package org.example.Singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

class SingletonTest {

    @Test
    @DisplayName("객체가 실제로 하나의 객체만 생성되는지 확인")
    public void getSingletonTest() {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        Assert.assertEquals(singleton, singleton1);
    }
}