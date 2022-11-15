public class Animal {
    private String  name;
    private  int age;

    public Animal(int age , String  name) {
        this.age = age;
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



        public  void  swim(){
            System.out.println("Ташбака сууда тез сүзөт");

        }
    public  void attack(){
        System.out.println("Акула балыкка кол салат");

    }
    public  void fly(){
        System.out.println("Бүркүт бийик учат");

    }

    @Override
    public String toString() {
        return "Animal: [ " +
                "name: " + name + '\'' +
                ", age: " + age +
                ']';
    }
}
