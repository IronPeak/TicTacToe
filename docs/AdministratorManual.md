# Administration Manual

## Introduction
The TicTacToe game is developed by Team Goomba. This manual is intended for system administrators. The administrators should have basic understanding of Java, Gradle, Travis Heroku as well as test driven development.

## Requirements
The software required to manage this project are as follows:

* [git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Heroku Toolbelt](https://toolbelt.heroku.com/)
* [Travis - CI](https://github.com/travis-ci/travis.rb)
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)

## Getting Started

1. Install the necessary software
2. Clone the git repository to your administration machine `git clone https://github.com/IronPeak/TicTacToe.git`

## Deploying to Heroku
1. [Login to Heroku](https://toolbelt.heroku.com/) as seen in getting started.
2. From the projects root directory run `heroku create [name]` where `name` is the desired name for the application.
3. run `git push heroku master`
4. Now the application should be running at [name.herokuapp.com](http://[name].herokuapp.com)

## Quality control
The readme file found at http://github.com/IronPeak/TicTacToe gives the administrator information on test results, the code coverage and whether the app has been deployed to Heroku.

## Running locally
1. From the project root directory run `./bin/deploy`
2. The application should be running on the default port at [localhost:4567](http://localhost:4567/) 

## Team Culture
The team consists of 5 developers. Each team member has a role of developer, tester, administrator and product owner. Giving the team members equal value.

The team uses test driven development, which helps members visualize the complete workflow from start to finish.

The team strives for continuous delivery to make sure that the user has access to the most up to date version possible. We also want to minimize the risks involved when deploying a new version.
