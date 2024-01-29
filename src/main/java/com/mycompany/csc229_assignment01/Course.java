/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    private int id;
    private String name;
    private String code;

    //Default Constructor
    public Course(){
        id = 0;
        name = "no-name";
        code = "no-code";
    }
    //Overloading Constructor
    public Course(int i, String nm, String cd){
        i = id;
        nm = name;
        cd = code;
    }

    //sets the number of the id variable
    public void setID(int i)
    {
        i = id;
    }

    //returns the id number
    public int getID()
    {
        return id;
    }

    //sets the name with a string
    public void setName(String nm)
    {
        nm = name;
    }

    //returns the name
    public String getName()
    {
        return name;
    }

    //sets code with a string
    public void setCode(String cd)
    {
        cd = code;
    }

    //returns the code
    public String getCode()
    {
        return code;
    }

}
