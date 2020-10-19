/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.flow2;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 *
 * @author tangfanghua
 */
public class Flow1 {

    public static void main(String[] args) {
        System.out.println("hello");
        Pub1 pub = new Pub1();
        Sub1 sub = new Sub1();
        pub.subscribe(sub);
        final Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 3 == 0) {
                    pub.subscriber.onError(new RuntimeException("i:" + i));
                } else {
                    pub.subscriber.onNext(i);
                }
                if (!pub.runnning) {
                    break;
                }
            }
            pub.subscriber.onComplete();
            System.out.println("thread end");
        });
        t.start();
        System.out.println("wait end");
    }

    static class Pub1 implements Publisher {

        private Subscriber subscriber;
        boolean runnning = true;
        private S s;

        @Override
        public void subscribe(Flow.Subscriber subscriber) {
            this.subscriber = subscriber;
            this.s = new S(this);
            this.subscriber.onSubscribe(s);
        }

    }

    static class S implements Subscription {

        Pub1 pub;

        public S(Pub1 pub) {
            this.pub = pub;
        }

        @Override
        public void request(long n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cancel() {
            pub.runnning = false;
        }

    }

    static class Sub1 implements Subscriber {

        Flow.Subscription subscription;

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
        }

        @Override
        public void onNext(Object item) {
            System.out.println("onNext item:" + item);
        }

        @Override
        public void onError(Throwable throwable) {
            System.err.println("onErr " + throwable);
        }

        @Override
        public void onComplete() {
            System.out.println("onComplete ");
        }

    }
}
