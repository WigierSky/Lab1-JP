package collections;

public class Person implements Comparable<Person> {
        private String first_name;
        private String last_name;
        private int age;


       public Person(String first_name, String last_name, int age)
       {
            setFirst_name(first_name);
            setLast_name(last_name);
            setAge(age);
       }

       public void setFirst_name(String name) {
            this.first_name = name;
       }

       public void setLast_name(String name) {
           this.last_name = name;
       }

       public void setAge(int age) {
           this.age = age;
       }

    public int getAge() {
        return age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String fullname() {
        return first_name + " " + last_name + " " + age + " " + "lat";
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
