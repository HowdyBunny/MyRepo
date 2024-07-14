package sg.edu.nus.challengedropwizard;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ChallengeDropwizardApplication extends Application<ChallengeDropwizardConfiguration> {

    public static void main(String[] args) throws Exception {
        new ChallengeDropwizardApplication().run(args);
    }
    @Override
    public void initialize(Bootstrap<ChallengeDropwizardConfiguration> bootstrap) {

    }
    @Override
    public void run(ChallengeDropwizardConfiguration configuration, Environment environment) {
        final MyResource resource = new MyResource(new MyService());
        environment.jersey().register(resource);
    }
}
