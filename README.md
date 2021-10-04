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

## Car class
- Make your Car class extend the Vehicle class
  
- Create an instance variable of type int named numDoors
  
- Create a constructor that takes in a numDoors parameter as well as all the parameters from your parent Vehicle class
    - Invoke the constructor from your Vehicle class (You can use super() to do this)
    - Be sure to include the necessary parameters in your call to the parent Vehicle class constructor
    - From inside your Car constructor, assign the correct value to your numDoors instance variable
    
- Create a getter and setter for your instance variable numDoors
    
## Moto class
- Make your Moto class extend the Vehicle class

- Create an instance variable of type int named numOfSeats

- Create a constructor that takes in a numOfSeats parameter as well as all the parameters from your parent Vehicle class
    - Invoke the constructor from your Vehicle class (You can use super() to do this)
    - Be sure to include the necessary parameters in your call to the parent Vehicle class constructor
    - From inside your Moto constructor, assign the correct value to your numOfSeats instance variable
    
- Create a getter and setter for you instance variable numOfSeats

- Override the increaseSpeed() method of the parent class. Make the increaseSpeed() method in Moto increase the speed by
  20 instead of by 10
  
## Main class
- Create an instance of your Car class and name it carOne. Pass in the appropriate arguments

- Create an instance of your Moto class and name it motoOne. Pass in the appropriate arguments   
        
- Call increaseSpeed() on carOne.   
        
- Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)        
        
- Call decreaseSpeed() on carOne.              

- Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)        
        
- Call increaseSpeed() on motoOne.        
        
- Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)

- Call decreaseSpeed() on motoOne.

- Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)        
       
- Try to increase the speed of motoOne above its max speed. This should not be allowed.

- Try to decrease the speed of motoOne below 0. This should not be allowed.

<br>

## Directions for Pushing Revision to github
- Push your changes up to your repository. From your git bash terminal, enter the following commands:
```bash
git add .
git commit -m “Adds solutions to activity”
git push -u origin main
```
- Go to your GitHub repository. You should see your changes.
- Submit your pull request with your solution
  <br>

## If you finish early, consider adding some additional functionality. Be original, add some of your own functionality to the application.