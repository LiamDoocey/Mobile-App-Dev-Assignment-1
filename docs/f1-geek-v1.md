# F1 Geek Design - Version 1

## Mindmap
```mermaid
mindmap
  root((F1 Geek))
    Drivers
        Information
        Personal Records
        Personal Statistics
    Teams
        History
        Current Members
    Race Tracks
        Information
            Track Length
            Location
        Statistics
            Record / Avg Lap Times
    Seasons
        Races
            Live
            Media
            Results
            Upcoming
    Personalisation
        Follow Drivers
        Display favourite Team
        Fantasy League
    News Feed
        Team News
        Driver News
        Weather updates

```

## User Stories

- As a Formula 1 fan, I want to see a list of drivers so that I can see who is competing in the championship.
- As a Formula 1 fan, I want to see a list of teams so that I can see who is competing in the championship.
- As a Formula 1 fan, I want to drill down into a driver so that I can see more information about them.
- As a Formula 1 fan, I want to drill down into a team so that I can see more information about them, including their drivers.

- As a Formula 1 expert, I want to have access to live weather updates to be able to prepare for race day appropriately.
- As a Formula 1 expert, I want to be able to have all the latest news on teams and players so I am well informed at all times.
- As a Formula 1 expert, I want to have access to live updates to my mobile device from ongoing races I might not be able to attend / watch, so I can keep up to date.

- As a new Formula 1 fan, I want to be able to see team history with past results etc. so I can gain a better understanding of the teams I am watching
- As a new Formula 1 fan, I want to have access to information telling where I can watch the races and at what time. to make it easier to get in on.

## Design

![Figma-proto](https://github.com/user-attachments/assets/2af7f88c-4906-47d9-b43a-2c74e3a21c31)


## Data Model

```mermaid
classDiagram
    Team "1" --> "1" Driver : primaryDriver
    Team "1" --> "1" Driver : secondaryDriver
    Team "1" --> "1..*"  Driver : reserveDrivers
    class Driver{
        +String surname
        +String firstName
        +String abbreviatedName
        +Integer number
    }
    class Team{
        +String name
    }

    Circuit "1" --> "0..*" Result: results
    class Circuit{
        +String name
        +String country
        +Float length 
    }
    class Result{
        +String first
        +String second
        +String third
        +Integer year
    }
```

TODO: You must also actually implement the data model in kotlin in your F1 Geek app and include tests, see the previous page for details on the model.

## User Interface - 40%

TODO: Add screenshots of your driver list, team list, team detail screens and driver detail screens
