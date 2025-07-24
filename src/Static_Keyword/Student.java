package Static_Keyword;

public class Student {
 public static int count =0;
 public Student(){
     count++;
 }
 private int id;
 private String name;
 private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void getCount(){
        System.out.println("Total student"+count);
    }
}
