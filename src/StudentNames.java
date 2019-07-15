import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<StudentConstructor> majina;
        //Instantiate the arraylist
        majina = new ArrayList<>();

        //Create the list Items using the constructor
        StudentConstructor std1 = new StudentConstructor("King","Wanyams","");
        StudentConstructor std2 = new StudentConstructor("Brenda","Mugure","Shiro");
        StudentConstructor std3 = new StudentConstructor("Edwin","Chebii","Kibet");
        StudentConstructor std4 = new StudentConstructor("Erick","Murai","Mburu");
        StudentConstructor std5 = new StudentConstructor("Mercy","Ndanu","Wambua");

        //Add your students names to the arraylist
        majina.add(std1);
        majina.add(std2);
        majina.add(std3);
        majina.add(std4);
        majina.add(std5);

        //Finally print your arraylist using the toString function on the constructor class
        System.out.println(majina.toString());
    }
}
