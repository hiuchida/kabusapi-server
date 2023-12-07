# kabusapi-server
Duplicate spring-server-generated in kabusapi_swagger so that a minimum of automated tests can work.

## Requirements

Building the API server application requires:
1. Java 1.7+
2. Maven 3.8.x+

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

## Getting Started

Start your server as an simple java application.

```shell
mvn spring-boot:run
```

For Windows, run the batch file to suppress the following message when Ctrl+C is pressed.

```shell
run.bat
```

```
バッチ ジョブを終了しますか (Y/N)?
Terminate batch job (Y/N)?
```

You can view the api documentation in swagger-ui by pointing to 
http://localhost:18080/kabusapi/swagger-ui/

## Restrictions

The following servers use the same port number (18080) and cannot run at the same time.

- https://github.com/hiuchida/kabusapi-server
  (kabusapi-server\src\main\resources\application.properties: server.port=18080)
- https://github.com/hiuchida/kabusapi-wsserver
  (kabusapi-wsserver\pom.xml: &lt;port>18080&lt;/port>)

## The differences from the original source

### Change SerializedName from KabuSVersion to kabuSVersion in ApiSoftLimitResponse

Change SerializedName KabuSVersion in ApiSoftLimitResponse.

The expected JSON data is...

```json
{"KabuSVersion":"5.21.0.0"}
```

The actual JSON data is...

```json
{"kabuSVersion":"5.21.0.0"}
```

### Change InlineResponse200 to RankingDefaultResponse in Ranking API

InlineResponse200 interface was changed to RankingDefaultResponse class in order to make the JUnit automatic testing of the ranking API work in the interim.

Originally, InlineResponse200 interface was designed to represent classes of RankingDefaultResponse, RankingByTickCountResponse, RankingByTradeVolumeResponse, RankingByTradeValueResponse RankingByTickCountResponse, RankingByTradeVolumeResponse, RankingByTradeValueResponse, RankingByMarginResponse, and RankingByCategoryResponse, but the source generated by Swagger does not support them.

### Add Javax Annotation API to pom.xml

Added Javax Annotation API since it is not build with the latest JDK.

### Add Java Architecture for XML Binding (JAXB) to pom.xml

Added Java Architecture for XML Binding (JAXB) since it is not build with the latest JDK.

### Change the HttpStatus of ResponseEntity from NOT_IMPLEMENTED to OK on success.

Fixed a problem that caused internal errors on the server side even if the requested process succeeded.

### Add JUnit Test

Add minimal JUnit automated tests to avoid errors at build time when JUnit automated tests are not present.
