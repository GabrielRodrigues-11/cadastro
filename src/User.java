public class User {
    public static int contador = 0;
    private int id;
    private String name;
    private String email;
    private int year;

    public User(String nome, int idade, String emails){
        this.id = contador;
        this.name = nome;
        this.year = idade;
        this.email = emails;
    }

    // Get
    public String getName() {
        return name;
    } public int getYear() {
        return year;
    } public String getEmail() {
        return email;
    }

    // Set
    public void setName(String name) {
        this.name = name;
    } public void setYear(int year) {
        this.year = year;
    } public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID= " + id + " |" +
                "name= " + name + " |" +
                " email= " + email + " |" +
                " year= " + year +
                '}';
    }
}