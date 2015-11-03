# Administration Manual

## Introduction
The TicTacToe game is developed by team Goomba. This manual is intended for system and template administrators. It gives comprehensive information about the steps required to release a new version of the game.

The game is deployed on the Heroku server when pull requests on master are accepted, so it does not require much interaction from the administrator other than reviewing that the process is correct and fully working when Heroku servers are up and running.

## Git repository and tools
A list of user accounts and links is as follows:

* Github: https://github.com/IronPeak/TicTacToe
* CodeCov: https://codecov.io/github/IronPeak/TicTacToe?branch=master
* Travis: https://travis-ci.org/IronPeak/TicTacToe

## Software integration
The system uses the following software:

* Gradle
* Selenium
* Heroku
* JUnit
* Spark
* TravisCI
* Codecov
* Coverity scan
* Java 8

When a new version is deployed, the developer pushes the code to the DevelopmentBranch. It then runs Selenium tests, Travis tests and code coverage.
When those tests are finished, another developer / administrator accepts the pull request and creates a new pull request from DevelopmentBranch towards master.

## Quality control
The readme file found at http://github.com/IronPeak/TicTacToe gives the administrator information on test results, the code coverage and whether the app has been deployed to Heroku.

## Team Culture

The team consists of 5 developers. Each team member has a role of developer, tester, administrator and product owner. Giving the team members equal value.

The team uses test driven development, which helps members visualize the complete workflow from start to finish.

The team strives for continuous delivery to make sure that the user has access to the most up to date version possible. We also want to minimize the risks involved when deploying a new version.