package com.world.hello.service.event;

import com.world.hello.endpoint.event.model.SendEmailRequested;
import com.world.hello.mail.Email;
import com.world.hello.mail.Mailer;
import java.util.List;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SendEmailRequestedService implements Consumer<SendEmailRequested> {
  private final Mailer mailer;

  @Override
  public void accept(SendEmailRequested sendEmailRequested) {
    var email =
        new Email(
            sendEmailRequested.getTo(),
            List.of(),
            List.of(),
            "Hello world email",
            "<h1>Hello World !</h1>",
            List.of());

    mailer.accept(email);
  }
}
