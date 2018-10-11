## Example project to show how to use the camunda-prometheus-plugin with SpringBoot.

### How to run

* Clone <https://github.com/StephenOTT/camunda-prometheus-process-engine-plugin> and run the included Prometheus/Grafana docker stack from `docker/prometheus-grafana/` as described
* Go to Grafana at <http://localhost:3000> (login with `admin`/`admin`) and import the sample Dashboard `grafana/dashboards/CamundaMetrics-1.json` 
* Run this example app as Docker image with `mvn clean install && docker-compose up -d --build`
* Start processes with Camunda's Taskist at <localhost:8080/app/tasklist>
* Check Grafana Dashboard at <http://localhost:3000> (login with `admin`/`admin`)

### Additional links

* Prometheus: <http://localhost:9090>
* Example app's Prometheus export endpoint: <http://localhost:9999/metrics>