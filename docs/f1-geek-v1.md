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
        +Integer age
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

## User Interface

## Team list

![image](https://github.com/user-attachments/assets/f10fcae4-12b5-426d-9029-16de2041f6b5)

## Drivers List (After choosing McLaren)

![image](https://github.com/user-attachments/assets/023c347a-acca-471e-a985-9ac32fbf3255)

## Driver Info (After choosing Lando Norris)

![image](https://github.com/user-attachments/assets/c41408d8-f503-4ceb-bdd2-5267ce86e2e6)

## Driver Master list (Searchable)

![image](https://github.com/user-attachments/assets/9b3ec4c2-b36b-4301-b329-d55c96bc9007)

![image](https://github.com/user-attachments/assets/025c86da-5505-475d-844e-faa729fed15a)

## Submission details

* My UNLISTED youtube video (app and test walkthrough): TODO: Add your youtube link here
* My github repository (this MUST be your github classroom repo): TODO: Add your github repo link here
* Have you uploaded a zip of your repo to moodle? (yes/no): TODO: Answer here





