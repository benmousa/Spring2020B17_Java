package Day33_CustomClass_Info;

/*
cat class:
      data/attributes:  instance variables
        breed, color, age

      actions: instance methods
        sleep(), eat(), drink()
 */
public class Cat {
    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat (String catFood){
        System.out.println(name+" is eating "+catFood);
    }
    public void drink (String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void setCatInfo (String catName , String catBreed, String catColor, int catAge){
        breed = catBreed;
        color = catColor;
        age = catAge;
        name = catName;
    }

    public String toString (){
        return "Cat's name is: "+name+", breed is: "+breed+", color is: "+color+", "+age+" years old" ;
    }
}
