class Person{

    //Attributes
    private String firstName;
    private String lastName;
    private int age;

        
    //Setter First Name 
    public void setFirst(String fName){
        firstName = fName;       
    }

    //Setter for Last Name
    public void setLast(String lName){
        lastName = lName;
    }
    //Setter for  Person Age
    public void setAge(int pAge){
        age = pAge;

    }
    //Getter for First Name
    public String getFirstName(){
        return firstName;
        

    }
    //Getter for Last name
    public String getLastName(){
        return lastName;
    }

    //Getter for Age
    public int getAge(){
        return age;
    }

    //Getter for Full Name
    public String getName(){
        return (getFirstName() + " " + getLastName());
    }   
    
    //Getter for all info
    public String getInfo(){
        return (getName() + " " + getAge());
        
    }

    //Person Constructor
    public Person(String first, String last, int a){
        setFirst(first);
        setLast(last);
        setAge(a);
        
    }    

    //Method Changing Information nf=new first name, nl = new last name, na = new age
    public void changeInformation(String first, String last, int a){
        setFirst(first);
        setLast(last);
        setAge(a);
    } 



}