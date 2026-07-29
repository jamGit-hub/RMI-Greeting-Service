# RMI Greeting Service
 
A simple Java Remote Method Invocation (RMI) application that demonstrates distributed computing concepts through a client-server architecture.
 
## Overview 
This project implements a basic greeting service using Java RMI. It consists of a server that exposes remote methods and a client that invokes these methods over a network (or localhost for this example).
 
### Features
- **Greeting Service**: Returns a personalized greeting message
- **Word Counter**: Counts the number of words in a given string
- **RMI Registry**: Uses Java's built-in RMI registry for service registration and lookup
## Project Structure
 
```
├── Client.java              # RMI client that calls remote methods
├── RPCc.java                # RMI server/registry setup
├── greetingService.java     # Remote interface definition
└── greetingServiceImpl.java  # Service implementation
```
 
## Components
 
### `greetingService.java`
Remote interface that defines the contract for remote methods:
- `greet(String name)` - Returns a greeting message with the provided name
- `counter(String s)` - Counts and returns the number of words in a sentence
### `greetingServiceImpl.java`
Implements the `greetingService` interface:
- Extends `UnicastRemoteObject` to make it remotely accessible
- Implements word counting using regex split on whitespace
### `RPCc.java`
Server component that:
- Creates and starts an RMI registry on port 1099
- Instantiates the greeting service
- Binds the service to the registry for client lookup
### `Client.java`
Client component that:
- Looks up the remote service from the RMI registry
- Calls the `greet()` method with a sample name
- Calls the `counter()` method with a sample sentence
- Displays the results
## Requirements
 
- **Java Development Kit (JDK)**: Java 8 or higher
- **Maven** (optional): For project management and compilation
## Getting Started
 
### Prerequisites
 
Ensure you have JDK installed on your system:
 
```bash
java -version
javac -version
```
 
#### Expected Output
 
```
Server Response: Hii, Ghala! WELCOME.
Word Count: 7
```
 
## How It Works
1. **Server Startup** (RPCc.java):
   - Creates an RMI registry listening on port 1099
   - Instantiates the greeting service
   - Binds it to the registry with the name `greetingService`
2. **Client Connection** (Client.java):
   - Uses `Naming.lookup()` to locate the remote service
   - Calls remote methods as if they were local
   - Receives responses from the server
3. **Network Communication**:
   - The RMI framework handles serialization and network transmission
   - Methods are invoked remotely via the RMI protocol
## Key Concepts Demonstrated
 
- **Remote Method Invocation**: Calling methods on remote objects
- **RMI Registry**: Service registration and discovery
- **Remote Interface**: Defining a contract for remote services
- **Serialization**: RMI automatically serializes method arguments and return values
- **Exception Handling**: Remote methods throw `RemoteException`

## License
This project is provided as it is for educational purposes. 
---
 
**Note**: This is a basic example for learning RMI concepts. For production applications, consider using modern distributed computing frameworks and REST APIs.
