public class Emploee extends Human{
    String bank;
    String jobTitle;

    public Emploee(String name,String surname,String bank,String jobTitle){
        super(name,surname);
        this.bank = bank;
        this.jobTitle = jobTitle;
    }

    @Override
    public void getInfo(){
        System.out.println("name: " + super.name + "\n" + "surname: " + super.surname + "\n" + "bank: " + this.bank + "\n" +"job title: " + this.jobTitle);
    }
}
