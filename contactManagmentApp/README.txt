Go to:
src\main\java\com\signify\contactApp
For all the main file.

Main class: ContactApp.java

(Here, you can see different folders. What the contains are explained below.)

Entity: Contact.java
	Location: \entity
	Function: Here we define the various properties of the object ( different coloumns of a table )
		: userId is auto-generated an will be unique for each data. 	
		: Also we set the getter and setter of all the properties.

Controller: ContactController.java
	Location: \controller
	Function: Here, we define the url and functions of different html methods like
	1)Post	-Create
	2)Get	-Read
	3)Put	-Update
	4)Delete-Delete
	[CRUD operations]

Repository: ContactRepository.java [interface that implements JpaRepository]
	Location: \repository
	Function: This interface provides methods to perform CRUD (Create, Read, Update, and Delete) operations on the Contact
	entity using Spring Data JPA. The JpaRepository provides default implementations for these methods, so you don't have to implement them yourself.

Services: ContactServices.java [interface]
	Location: /services
	Function: An interface to declare all the functions and methods that needs to be defined.

	: ContactServicesImpl.java [implements ContactServices.java]
	Location: \repository
	Function: Defines the funcions declared in the ContactServices interface.
		: It also connects with the repository for the transfer of data:
		: Methods which are defined in here are:
			1.saveContact(): saves a new data.
			2.getContactId(): get an existing contact from the repository.
			3.updateContactId(): update an existing contact in the repository with a new information.
			4.deleteContactId(): deletes an existing contact in the repository.
---------------------------------------------
Results are shown in ContactManagementApp.pdf
---------------------------------------------
