# My MCP Server

A Spring AI MCP Server implementation with WebMVC SSE transport.

## Features
- MCP (Model Context Protocol) server for AI tool integration
- Ping tool for simple health checks
- SSE (Server-Sent Events) support for streaming responses
- Spring Boot 3.4.5
- Spring AI 1.0.1

## Getting Started

### Prerequisites
- Java 17 or newer
- Maven

### Build and Run

```bash
mvn clean package
java -jar target/my-mcp-server-0.0.1-SNAPSHOT.jar
```

### Endpoints
- **POST /mcp**: Main MCP endpoint for tool requests
- **SSE support**: Add `Accept: text/event-stream` header for streaming responses

#### Example Ping Request

```bash
curl -X POST http://localhost:8080/mcp \
  -H "Content-Type: application/json" \
  -d '{
    "version": "1.0",
    "tool": "ping",
    "input": { "message": "samar" },
    "stream": true
  }'
```

#### Example SSE Request

```bash
curl -N -X POST http://localhost:8080/mcp \
  -H "Content-Type: application/json" \
  -H "Accept: text/event-stream" \
  -d '{
    "version": "1.0",
    "tool": "ping",
    "input": { "message": "samar" },
    "stream": true
  }'
```

## Project Structure
```
pom.xml
src/
  main/
    java/
      com/
        samar/
          Application.java
          PingToolService.java
          ToolConfig.java
  test/
    java/
      com/
        samar/
          PingToolServiceTest.java
```

## Custom Tools
Add your own tools by creating service classes and annotating methods with `@Tool`.

## License
MIT
