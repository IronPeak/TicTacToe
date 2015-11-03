# Developer Manual

## Introduction
The TicTacToe game is developed by Team Goomba. This manual is intended for system developers. The developers should have basic understanding of Java as well as test driven development.

## Software Requirements
The software required to develop this project are as follows:

* [git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)

## Getting Started
1. Install necessary software
2. Clone the git repository to your development machine ´´´git clone https://github.com/IronPeak/TicTacToe.git´´´

## Building and Running Locally
1. run ´´´./bin/deploy´´´
2. open your browser at [http://localhost:4567/](http://localhost:4567/)

> **Note:** The deploy command will build and run all unit tests before  deploying but if you only wish to build the project or run tests you can run ´´´gradle build´´´ for building or ´´´gradle test´´´

## Coding Rules
* Suggested coding rules can be found in the [design report](https://github.com/IronPeak/TicTacToe/blob/master/docs/DesignAnalysisReport.md).

## Committing and Pushing Changes
1. Any new features should ideally be pushed into a new branch while being worked on.
	1. ´´´git checkout -b [new branch]´´´
	2. ´´´git add .´´´
	3. ´´´git commit -m [informative commit message]
	4. ´´´git push origin [the new branch]
2. When changes are ready they should be merge into the development branch using a pull request if appropriate.
3. If all tests on the development branch are successful it can be merge into master with a pull request. The pull request should be reviewed by an administrator.or another member of your team.
