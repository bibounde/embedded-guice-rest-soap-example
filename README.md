embedded-guice-rest-soap-example
================================

Sample Project for getting up and running with both Rest and Soap services on an embedded jetty server

Requires:

* Maven 2.0+
* Java 1.6+
* port 8080 is free

Setup / Run Server:

clone project to local workspace
cd <workspace>
mvn package
cd target
java -jar server.jar


Test REST:

request:

GET http://localhost:8080/rest/hello/world

expected response:

Hello from REST: world


Test SOAP:

wsdl:

GET http://localhost:8080/soap/hello?wsdl

request:

POST http://localhost:8080/soap/hello HTTP/1.1
Accept-Encoding: gzip,deflate
Content-Type: text/xml;charset=UTF-8
SOAPAction: ""
Content-Length: 298
Host: localhost:8080
Connection: Keep-Alive

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:hel="http://hello.soap.server.example.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <hel:sayHelloFromSoap>
         <arg0>world</arg0>
      </hel:sayHelloFromSoap>
   </soapenv:Body>
</soapenv:Envelope>

expected response:

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:sayHelloFromSoapResponse xmlns:ns2="http://hello.soap.server.example.com/">
         <return>Hello from SOAP: world</return>
      </ns2:sayHelloFromSoapResponse>
   </soap:Body>
</soap:Envelope>




