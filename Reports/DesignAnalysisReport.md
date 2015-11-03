# Design and analysis Report

![Logo](/Late-Term/images/tictactoe_logo.png)

## Introduction

This report outlines the initial design of our TicTacToe application meant as an exercise in setting up a technical infrastructure to support agile development created by Team Goomba. Although the application itself will not be the main focus in this exercise an initial design report can help members get a cohesive visualisation of the product which is vital for development.

The TicTacToe Challenge is a very simple web application that allows two people to enjoy a game of Tic tac toe. The report displays the initial wireframe, as well as a more graphic design of the application. A simple class diagram is also included, it displays the initial class design and will therefore most likely change somewhat during development. Finally the report describes the technical environment which the team is planning to use along with the programming rules they plan to follow.
## Prototypes
### Wireframes
The first steps in designing the system’s user interface as well as trying to determine the main aspects
of the system was to make wireframes. The wireframes are meant to give a basic fundamental structure
of the user interface and help to figure out what data will be needed to give the user the appropriate
and necessary information. The wireframes were sketched up in Excel,
giving a good skeletal framework of the website. The wireframes do not necessarily reflect the final
outcome of the TicTacToe user interface.

![Wireframe](/Late-Term/images/Wireframe.png) 
### Graphic Design
Although the complete design of the website has not been completely decided we wanted to have a base idea for the graphic design of the site. Our priority will of course always be the functionality of the website and the design aesthetics will be secondary. However if time allows hopefully these prototypes will not be far from the final result.

![Graphic Design](/Late-Term/images/TicTacToeGraphicDesign.png) 
## Class Diagram
The class diagram is meant as an overall visual representation of the structure of the TicTacToe game. The diagram shows the game’s classes, their attributes, operations and/or methods, and the relationships among the objects. Although it is difficult, at this point in development, to show the exact structure of the whole system we felt it was important for us to give as accurate of a picture as possible. Nevertheless, we will be fully prepared to reevaluate the structure of the system when, and if, that becomes necessary.
The board class checks if the input given is valid before placing it. Furthermore it checks if the game is over for each move. The game class keeps track of the game and manages moves.

![Class Diagram](/Late-Term/Classdiagram/class-diagram.png) 
## Description of Technical Environment
The game is written in Java and implemented with test driven development. We plan to use Heroku to host the web application and Selenium to test the user interface, nevertheless these tools will only be used if the core functionality is ready.

* For organizing workflow we are using Trello
* Microsoft Excel was used to design wireframe.
* The project will be developed on a machine provided by the course, as well as our own.
* For assistance we will use Notepad++ and Sublime Text while coding
* The system will be designed with Firefox and Google Chrome in mind.
* Both Google Chrome and Firefox have built in development tools that we will use for debugging.
* Source control will be provided by git.
* For hosting of source control we use github.com
* Travis will test our project and deploy to Heroku.
* Mou editor will be used to write reports and manuals.
* The graphic design will be developed in Photoshop as well as the base images used in the project.
* Selenium and JUnit are used for testing.

##Programming Rules
When deciding on programming rules to follow, we looked for inspiration from the XHTML standard for HTML. We looked into CSS coding standards and adjusted the rules for us. For Java we looked into Google traditions for ideas of coding rules. And finally we looked into some coding standards provided by Google for JavaScript. We designed our rules so that the code would be easier to read and understand and to make it more appealing. Following are the rules we decided upon and a few examples.

###Java
* Use PascalCasing for class names and method names.
* Use camelCasing for method arguments and local variables.
* Use noun or nounphrases to name a class.
* Open brace “{” appears at the end of the same line as the declaration statement. Closing brace “}” starts a line by itself indented to match its corresponding opening statement.

###CSS
* Use classes in selectors but avoid id's for better reusability of code.
* Place closing braces of declaration blocks on a new line.
* Selectors names should be descriptive.
* Id names should have underscores.
* Class names should have hyphens.
* Only use English words.
* Place external CSS files within the head and put javascript files at the bottom.

###HTML
* All attributes, events, and tags must be written in lower case.
* All elements must be closed.
* The value assigned to an attribute must be enclosed in quotes.
* All elements must be properly nested.
