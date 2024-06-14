package io.miragon.exercise

import io.camunda.zeebe.spring.client.annotation.Deployment
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@Deployment(resources = ["classpath:bpmn/*.bpmn"])
class ProcessIntegrationExampleApplication

fun main(args: Array<String>)
{
    runApplication<ProcessIntegrationExampleApplication>(*args)
}
