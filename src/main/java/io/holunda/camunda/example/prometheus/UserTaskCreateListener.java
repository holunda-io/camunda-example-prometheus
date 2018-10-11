package io.holunda.camunda.example.prometheus;

import io.digitalstate.camunda.prometheus.collectors.SimpleCounterMetric;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Slf4j
@Component
public class UserTaskCreateListener implements TaskListener {

    private static final SimpleCounterMetric counter = new SimpleCounterMetric("userTaskCreated", "Number of created User Tasks", Collections.singletonList("taskType"));

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("XXXXX A task has been created!");
        counter.increment(Collections.singletonList(delegateTask.getTaskDefinitionKey()));
    }
}
