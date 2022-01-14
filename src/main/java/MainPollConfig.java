import entities.PollParticipant;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPollConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext pollContext = new ClassPathXmlApplicationContext("Context.xml");
        PollParticipant participantBean = (PollParticipant) pollContext.getBean("pollParticipant");
        pollContext.close();
    }
}
