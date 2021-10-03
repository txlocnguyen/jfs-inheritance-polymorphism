# jfs-inheritance-polymorphism

Lesson on Java Inheritance & Polymorphism
## Directions to Clone and load in IntelliJ

- Go to this [Repo](https://github.com/DevCoder0x0/jfs-inheritance-polymorphism) and FORK this repository onto your github
- Copy the HTTPS URL from the "Code" button on your GitHub
- Open your terminal (Git bash) and navigate to the appropriate location where you wish to save the folder to and run
```bash 
git clone URL-you-Copied-goes-here
```

- Open IntelliJ and click on new project
- Select Java and make sure you have a Project SDK selected and then click next
    - Leave the box for create project from template unchecked and click next
- Click on three dots ... next to project location. Change project location to the directory you just cloned to your machine. Click OK and then click Finish.

- `Main` will be the entry point for your application.
- Click on the `Main` java file and read thru the comments.
- Anytime you want to test the code right click on `Main.java` the first time and
  select `Build Module` which should open the Build output and then clicking the green
  hammer will compile future rebuilds
- To run the first time right click on `Main.java` and click `Run Main.main()`
  which will also open the Run output and then on the Green play button will attempt
  further reruns
  <br><br>

## Directions for Coding
- Make all your instance fields private and all your classes and methods public
- Create 6 instance variables within the Vehicle class
    1. One of data type int named topSpeed
    2. One of data type int named currentSpeed and initialize it with the value 0
    3. One of data type String named color
    4. One of data type String named make
    5. One of data type String named model
    6. One of data type boolean named isElectric   
       <br>

- Create a constructor inside of the Vehicle class and take parameters for all of your instance fields except currentSpeed.
    1. Assign the correct values to all of your instance fields from within your constructor. For example, this.topSpeed = topSpeed
       <br>

- Create getters and setters for all your instance fields.
       <br>

- Make a method that will increase the speed of the vehicle. 
    - This method should not return anything and should not take in any parameters 
    - It should increase the currentSpeed by 10
    - This method should not allow the currentSpeed to be more than the topSpeed.
          <br>
      
- Make a method that will decrease the speed of the vehicle.
    - This method should not return anything and should not take in any parameters
    - It should decrease the currentSpeed by 10
    - This method should not allow the currentSpeed to be below 0




```bash
System.out.println("Middle School Roster");
System.out.println("====================");
```
- invoke or run the printStudents method on our class instance
- Print another empty line if desired for readability
- Use a for loop to loop thru the given teachers array on the class instance
- inside the loop
    - create a new variable that stores the result of "Teacher: " +
      teachers name from the array using the counter variable
    - Print the new variable as output
- After
```bash
System.out.println("\nStudent Grades:\n");
```
- Use a for loop to loop thru students ArrayList on the class instance
- inside the loop
    - pass the counter variable as an index to the printStudentGrades method
      to print each students info
    - Print a new line if you want it to look presentable

<br>

## Directions for Pushing Revision to github
- Push your changes up to your repository. From your git bash terminal, enter the following commands:
```bash
git add .
git commit -m “Adds solutions to activity”
git push -u origin main
```
- Go to your GitHub repository. You should see your changes.
- If you want you can submit a PR to merge changes
  <br>

## If you finish early, consider adding some additional functionality. Be original, add some of your own functionality to the application.