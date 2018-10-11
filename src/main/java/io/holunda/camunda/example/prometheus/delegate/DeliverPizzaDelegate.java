package io.holunda.camunda.example.prometheus.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j(topic = "deliverPizza")
@Component("deliverPizza")
public class DeliverPizzaDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        log.info(String.format("Delivering pizza %s", execution.getVariable("pizza")));
    }
}
