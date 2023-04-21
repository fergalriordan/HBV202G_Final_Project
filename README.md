# HBV202GFinalProject
A very simple digital university library implementation to be tested using JUnit4.

# Installation 

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

# Contents

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass8`, 
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `LibrarySystem.java`: the library system class
  - `LibraryInterface.java`, `AdminMode.java`, `UserTypeSelection.java`, `User.java`: java classes that implement a textual user interface
  - `BookComposite.java`, `BookComponent.java`, `Omnibus.java`, `Book.java`: composite design pattern implementation of books and omnibuses, 
  allowing books to be stored either individually or as part of a collection (omnibus)
  - Various other java classes that make up the dependencies of the library system 

- `src/test/java`:
  - `AuthorTest.java`: A class containing JUnit4 test cases for the `Author` class.
  - `BookTest.java`: A class containing JUnit4 test cases for the `Book` class.
  - `FacultyMemberTest.java`: A class containing JUnit4 test cases for the `FacultyMember` class.
  - `LendingTest.java`: A class containing JUnit4 test cases for the `Lending` class.
  - `StudentTest.java`: A class containing JUnit4 test cases for the `Student` class.
  - `UserTest.java`: A class containing JUnit4 test cases for the `User` class.

# Running the system

The files have been built and packaged in a .jar file for convenience.
The jar file is named `library.jar` and is stored in the ass8/bin directory.  
To run the library system, enter the ass8/bin directory and then enter the command: `java -jar library.jar`

# Credits

Dr. Helmut Neukirchen 

Fergal Riordan

# License 

[MIT License](https://spdx.org/licenses/MIT.html)
