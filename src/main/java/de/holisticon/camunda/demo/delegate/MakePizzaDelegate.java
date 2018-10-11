package de.holisticon.camunda.demo.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

@Slf4j(topic = "makePizza")
@Component("makePizza")
public class MakePizzaDelegate implements JavaDelegate {

    private static final List<String> supportedPizzas = Arrays.asList("funhgi", "salami");

    @Override
    public void execute(DelegateExecution execution) {
        String pizza = (String) execution.getVariable("pizza");

        if (supportedPizzas.stream().anyMatch(e -> e.equalsIgnoreCase(pizza))) {
            log.info("Pizza {} is being made", pizza);
        } else {
            throw new BpmnError("unsupportedPizza", format("Pizza %s is not supported", pizza));
        }
    }
}
