public class Client extends Human {
    protected String bank;

    public Client(String name,String surname,String bank){
        super(name,surname);
        this.bank = bank;
    }

    @Override
    public void getInfo(){
        System.out.println("name: " + super.name + "\n" + "surname: " + super.surname + "\n" + "bank: " + this.bank);
    }
}
