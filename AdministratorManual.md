# Administration Manual

## Introduction
The Tic Tac Toe game is developed by the Goomba team. This manual is intended for system and template administrators. It gives a comprehensive information about the steps needing to fulfill to release a new version of the game.

The game is self-deployed, so it does not require much interaction from the administrator other than reviewing that the process is correct and working fully.

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
* Postgres
* Codecov
* Coverity scan
* Rocket League
* Java 8

When a new version is deployed, the developer pushes it's code to the DevelopmentBranch. It then tests selenium tests, travis tests and code coverage.
When those tests are finished, another developer / administrator accepts the pull request and creates a new pull request from DevelopmentBranch towards master.

## Ensuring the product
The readme file inside the github repo gives the administrator information on how the tests have gone, the code coverage and if the heroku is deployed.

## Team Culture

The team consists of 5 developers who act in a slice-the-cake role for the team. Each team member now has a role of developer, tester, administrator and product owner. Giving the team members equal value.

We work in a test driven development scheme, giving us a good understanding how things work from the beginning.

We strive for continuious delivery to give the user the best experience available at each team. We also want to minimize the risk of giving a new version.