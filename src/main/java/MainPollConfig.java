import entities.PollParticipant;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.AskQuestions;
import java.io.IOException;

public class MainPollConfig {
    public static void main(String[] args) throws IOException {
        AskQuestions askQuestionsObject = new AskQuestions();
        AskQuestions.askQuestionsMethod();
        ClassPathXmlApplicationContext pollContext = new ClassPathXmlApplicationContext("Context.xml");
        PollParticipant participantBean = (PollParticipant) pollContext.getBean("pollParticipant");
        pollContext.close();
    }
}
