Springboot REST Api example

* Controller, Service, Model with Repository and ORM
* Integration Test
* React client in static folder
* Docker image

The image can be pulled from hub.docker.com:

robertomessabrasil/contactmanager

The React frontend can be taken from:

https://github.com/RobertoMessaBrasil/React_MVC_Tutorial

AWS Elastic bean deploy code:
```json
{
  "AWSEBDockerrunVersion": "1",
  "Image": {
    "Name": "robertomessabrasil/contactmanager:1.0",
    "Update": "true"
  },
  "Ports": [
    {
      "ContainerPort": 8080,
      "HostPort": 8080
    }
  ],
  "Logging": "/var/log/nginx"
}
```
AWS URL:
http://contactmanager.sa-east-1.elasticbeanstalk.com/
