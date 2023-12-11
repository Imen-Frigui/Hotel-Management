# Hotel Management System

## MicroMasters Team

### Team Members:

1. Farah Metoui - Room Reservation Manager (H2 Database)
2. Rami Ouali - Room Management Manager (MySQL Database)
3. Imen Frigui - Complaints Manager (MySQL Database)
4. Hanin Ben Jemaa - Events Management Manager (H2 Database)

## Project Overview

The project aims to develop a modular and scalable Hotel Booking Management System. The system comprises several services, each responsible for specific functionalities such as room reservation, room management, complaints management, events management, and statistics.

### Tasks

#### 1. Room Reservation (Farah) - First MicroService:

- Implementation of reservation management in a service using MySQL.
- Development of features for adding, viewing, modifying, and canceling reservations.
- Configuration of the service to interact efficiently with MySQL.

#### 2. Room Management (Rami) - Second MicroService:

- Implementation of room information management in a service using H2.
- Development of features for searching, adding, modifying, and deleting rooms.
- Configuration of the service to interact efficiently with H2.

#### 3. Complaints Management (Imen) - Third MicroService:

- Implementation of complaints management in a service using H2.
- Development of CRUD functionalities for complaints.
- Configuration of the service to interact efficiently with H2.

#### 4. Events Management (Hanin) - Fourth MicroService:

- Implementation of events management in a service using MySQL.
- Development of CRUD functionalities for events.
- Configuration of the service to interact efficiently with MySQL.

#### 5. Statistics (Team Effort) - Fifth MicroService:

- Design and implementation of a service using MongoDB for generating statistics.
- Aggregation of data from MySQL and H2 databases.
- Configuration of the service to provide statistical insights on reservations, room occupancy, complaints, and events.

## Task Distribution

- **Farah:** Room Reservation Manager (Service One) - MySQL
- **Rami:** Room Management Manager (Service Two) - H2
- **Imen:** Complaints Manager (Service Three) - H2
- **Hanin:** Events Management Manager (Service Four) - MySQL
- **Team Effort:** Statistics (Service Five) - MongoDB

## Setup Instructions

1. **Room Reservation Service (Service One):**
   - [Add setup instructions for Farah's service using MySQL]

2. **Room Management Service (Service Two):**
   - [Add setup instructions for Rami's service using H2]

3. **Complaints Service (Service Three):**
   - [Add setup instructions for Imen's service using H2]

4. **Events Management Service (Service Four):**
   - [Add setup instructions for Hanin's service using MySQL]

5. **Statistics Service (Service Five):**
   - [Add setup instructions for the team effort service using MongoDB]

## API Gateway and Security

- The communication between services is facilitated through an API Gateway.
- Security measures are implemented using Keklock.

## Deployment

All services are deployed in Docker containers.
