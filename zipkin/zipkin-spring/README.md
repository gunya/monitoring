# Tracing Spring application with Zipkin

Steps:

1) Download and launch zipkin server locally.
https://zipkin.io/

2) Clone and launch zipkin-spring application. Go to http://localhost:8080/

3) Check traces under http://localhost:9411/zipkin

4) Spring Application Properties

    **spring.application.name**=`zipkin-spring`
    **spring.zipkin.baseUrl**=`http://localhost:9411/`
    
    _By default Spring Cloud Sleuth sets all spans to non-exportable.
    That means that traces appear in logs but not in any remote store.
    `spring.sleuth.sampler.probability`=0.0 -> 1.0 percent of samples to export._
    
    **spring.sleuth.sampler.probability**=`1.0`
    
    _Synchronous Rest Template tracing_
    **spring.sleuth.web.client.enabled**=`true`
    
    _HTTP integration_
    **spring.sleuth.web.enabled**=`true`
    
    _To disable zipkin tracing use this property:_
    **spring.zipkin.enabled**=`false`