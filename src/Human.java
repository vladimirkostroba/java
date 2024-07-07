public abstract class Human {
    protected String name,surname;

    public Human(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public abstract void getInfo();


    public String getName(){
       return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
}
