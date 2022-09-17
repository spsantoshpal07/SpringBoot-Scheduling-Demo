# SpringBoot-Scheduling-Demo

Spring Boot Project for showing how Scheduling works in SpringBoot
Showcasing the usage of following annotations -->
  1. ***@EnableScheduling*** --> this annotation can be used along with ***@SpringBootApplication*** or with ***@Configuration***
  2. Mark the TasksScheduler class file with ***@Component*** annotation to get it detected as Bean
  3. Mark each method of TasksScheduler class file with @Scheduled annotation which can have following attributes ::
     - ***@Scheduled(fixedRate = 5000)***                           // Running after every 5s
     - ***@Scheduled(fixedDelay = 10000)***                         // Running after a fixed Delay of 10s
     - ***@Scheduled(initialDelay = 5000, fixedRate = 2000)***      // Initial Delay of 5s and there after running after every 2s
