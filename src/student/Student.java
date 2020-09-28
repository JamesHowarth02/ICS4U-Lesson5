package student;

public class Student {
    private String name; 
    private int test1, test2, test3;

    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public String validateData() {
        String em = null;
        if(name.equals("")) {
            em = "Name is required.";
        }else if(test1 < 0 || test1 > 100 || test2 < 0 || test3 > 100 || test3 < 0 || test3 > 100) {
            if(em == null) {
                em = "At least 1 mark is out of the acceptable range";
            }else{
                em = em +"\nAt least 1 mark is out of the acceptable range.";
            }
        }else if(em != null) {
            em = em + "\nPlease re-enter all the data.\n";
        }
        return em;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setScore(int test, int score) {
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