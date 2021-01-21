package UserStory4.Random;

public class MySuper {
    public int num;

    public String name;

    MySuper(String name){

    }


    @Override
    public String toString() {
        return "MySuper{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    MySuper(int num, String name) {
this.num = num;

this.name = name;





    }
}

