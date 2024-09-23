package springbootproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbootproducer.service.WikimediaChangesProducer;

@SpringBootApplication
public class SpringBootProducerApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApp.class);
    }
    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;
    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
