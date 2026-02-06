package design_patterns.behavioral.observer_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber vishal = new Subscriber("Vishal");
        Subscriber raman = new Subscriber("Raman");

        channel.subscribe(vishal);
        channel.subscribe(raman);

        channel.notifyChanges("Learn Design Pattern");
        channel.notifyChanges("New Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to unsubscribe");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(br.readLine());
            if(c == 1){
                // new video upload code
                System.out.println("Enter the video title : ");
                String videoTitle = br.readLine();
                channel.notifyChanges(videoTitle);
            } else if (c == 2) {
                // create new subscriber
                System.out.println("Enter the name of subscriber : ");
                String subsName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subsName);
                channel.subscribe(subscriber3);
            } else if (c == 3) {
                System.out.println("Enter the name of the subscriber : ");
                String name = br.readLine().trim();

                channel.getSubscribers().stream()
                        .filter(s -> s instanceof Subscriber)
                        .map(s -> (Subscriber) s)
                        .filter(s -> s.getName().equalsIgnoreCase(name))
                        .findFirst()
                        .ifPresentOrElse(
                                channel::unsubscribe,
                                () -> System.out.println("Subscriber not found!")
                        );
            } else if(c == 4){
                System.out.println("Thank you for using the app !!");
                break;
            }else{
                // exit or wrong input
                System.out.println("Wrong Input");

            }
        }
    }
}
