import java.util.concurrent.*;

class Flow1 {
    public static void main(String[] argv) {
        System.out.println("hello");
        var sub = new Flow.Subscriber<Integer>() {
        };
        SubmissionPublisher<Integer> p = new SubmissionPublisher<>();
        p.subscribe(sub);

    }
}