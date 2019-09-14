package io.smallrye.reactive.messaging.aws.sns;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ApplicationScoped
public class ConsumptionBean {

  private List<String> messages = new CopyOnWriteArrayList<>();

  public List<String> messages() {
    return messages;
  }

  @Incoming("source")
  public void consume(String message) {
    messages.add(message);
  }
}
