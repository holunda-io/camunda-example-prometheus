package io.holunda.camunda.example.prometheus.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j(topic = "sendOrderConfirmation")
@Component("sendOrderConfirmation")
public class SendOrderConfirmationDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("This order is confirmed");
    }
}
