package DesignPatternsAndLLD.creationalDesignPatterns.BuilderDesignPattern;

public class User {
    private String name;
    private String city;
    private String degree;
    private int age;
    public User(UserBuilder builder){
        this.name = builder.name;
        this.city = builder.city;
        this.degree = builder.degree;
        this.age = builder.age;
    }
    

    @Override
    public String toString() {
        return "User [name=" + name + ", city=" + city + ", degree=" + degree + ", age=" + age + "]";
    }
    


    static class UserBuilder{
        private String name;
        private String city;
        private String degree;
        private int age;
        public UserBuilder(String name){//lets say name is required feild then we will pass it in constructor
            this.name = name;
        }
        public UserBuilder setCity(String city){
            this.city=city;
            return this;
        }
        public UserBuilder setDegree(String degree){
            this.degree = degree;
            return this;
        }
        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public User build(){
            return new User(this);
        }

    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getDegree() {
        return degree;
    }


    public void setDegree(String degree) {
        this.degree = degree;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
