package student;

public class Student {
    private String name; 
    private int test1, test2, test3;

    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
        System.out.println("[CLASS] Student: A new student was created.");
    }
    
    // Step 3) --> Create the methods
    public void setName(String nm) {
        String previousName = name;
        String newName = nm;
        name = nm;
        System.out.println("[CLASS] Student: " + previousName + "'s name was changed to " + newName + ".");
    }
    
    public String getName() {
        return name;
    }
    
    public void setMark(int test, int score) {
        if(test == 1) test1 = score;
        if(test == 2) test2 = score;
        if(test == 3) test3 = score; 
    }
    
    public int getMark(int test) {
        if(test == 1) return test1;
        if(test == 2) return test2;
        if(test == 3) return test3;
        return test;
    }
    
    public int getAverage() {
        return (test1 + test2 + test3) / 3;
    }
    
    public int getHighest() {
        int highest = test1;
        if(test2 > highest) highest = test2;
        if(test3 > highest) highest = test3;
        return highest;
    }
    
    @Override
    public String toString() {
        String s = "Name:\t" + name;
        s += "\nTest1:\t" + test1;
        s += "\nTest2:\t" + test2;
        s += "\nTest3:\t" + test3;
        s += "\nAverage:\t" + getAverage();
        return s;
    }
    
    public Student(String str, int m1, int m2, int m3) {
        name = str;
        test1 = m1;
        test2 = m2;
        test3 = m3;
    }
    
    public Student(Student other) {
        name = other.name;
        test1 = other.test1;
        test2 = other.test2;
        test3 = other.test3;
    }
}