package com.company;

public class ExeptionTime extends Exception
{

    private String lengthSent;

    //Creates a blank InvalidLengthException with no arguements.
    private ExeptionTime()
    {

    }

    //Creates an InvalidLengthException that takes in the invalid String.
    public ExeptionTime(String inString)
    {
        this.lengthSent = inString;
    }

    //Returns the inString of an InvalidLengthException.
    public String getLengthSet()
    {
        return this.lengthSent;
    }

    //Returns InvalidLengthException as a String.
    public String toString()
    {
        String returnString;

        returnString = this.lengthSent + " is an invalid length!\n";

        return returnString;
    }

}