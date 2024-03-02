# SwagDemo_Assignment
This project integrates Sauce Labs for automated testing, 
Allowing for seamless testing of websites.

***
### Requirements
- Sauce Demo website URL

  https://www.saucedemo.com/v1/

- Chrome Browser

***
#### Tools and Technology :
- IntelliJ Idea IDE
- Programming language - **Java**
- Automation framework - **Selenium**
- Testing framework - **TestNG**  
- Project management tool - **Maven**  

***
### Design Patterns:
- **Page Object Model (POM)** 

***
### Tests:
- **Login functionality**  
  **S1:** Login using valid credentials should succeed  
  **S2:** Login using invalid credentials should fail

-  **Home Page functionality**  
  **S1:** Sort items on the basis of Price (Low to High)
  **S2:** Add the item with lowest price to the cart   

- **Cart functionality**  
  **S1:** Validate whether the product is added to the cart or not
  
***


### 📜 Instructions:
#### Clone the Github Repository into your IntelliJ Idea 

- Copy the Github Repository Url on the repository page by clicking on "Code" then copy
- Open IntelliJ Idea 
- If you have any prior project open then click on Main Menu on the top left, then hover on "git" and click clone, a window will appear past the repo URL link and click on clone
- If you don't have any prior project open, then on the homescreen you'll see three options "New Project", "Open" and "Get from VCS", click on "Get from VCS" then paste the repo URL link and click on clone 
- The Project will be cloned successfully.
  - Reload the project and refresh maven
  - Check the JDK installed on you machine before trying the project
  - Check the POM.xml also 
- Now everything seems good, right? Time to run the tests!

#### Executing the tests:
- Just right click src/test/java and find **Run all tests** 
- All the tests will start to evecute 
- Finally, executed the tests! 😀
  
