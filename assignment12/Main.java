package com.company.assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Student> student=new ArrayList<Student>();
        student.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        student.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        student.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        student.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        student.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        student.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        student.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        student.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        student.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        student.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        student.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        student.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        student.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        student.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        student.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        student.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        student.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        //1.To get all departments in college
        student.stream()
                .forEach(Student -> System.out.println(Student.engDepartment));
        //2.names of students who enrolled after 2018
        student.stream()
                .filter(Student -> Student.yearOfEnrollment >2018)
                .forEach(Student -> System.out.println(Student.name));
        //3.Get the details of all male student in the computer sci department
        student.stream()
                .filter(Student -> (Student.gender=="Male" && Student.engDepartment=="Computer Science"))
                .forEach(Student -> System.out.println(Student.name));
        // 4.How many male and female student are there
        Map <String, Long> byGender = student.stream()
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(byGender);
        //5.What is the average age of male and female students?

        Map<String, Double> averageAgeByGender =
                        student.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getGender,
                                        Collectors.averagingInt(Student::getAge)));
        System.out.println(averageAgeByGender);


        //Get the details of highest student having highest percentage ?
        Student highestPercentage=student.stream()
                .collect(Collectors.<Student>maxBy(
                        Comparator.comparing(Student::getPerTillDate))).get();
        System.out.println(highestPercentage.getName());


        //7.Count the number of students in each department
        Map <String, Long> byDepartment = student.stream()
                .collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.counting()));
        System.out.println(byDepartment);

        //8. What is the average percentage achieved in each department?
        Map<String, Double> averagePercentageByDepartment =
                student.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getEngDepartment,
                                        Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(averagePercentageByDepartment);

        //9.Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        Student result=student.stream()
                .filter(Student->Student.engDepartment=="Electronic")
                .collect(Collectors.<Student>minBy(
                        Comparator.comparing(Student::getAge))).get();
        System.out.println(result.getName());

        //10.How many male and female students are there in the computer science department?
        Map <String, Long> byGenderDepartment = student.stream()
                .filter(Student->Student.engDepartment=="Computer Science")
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(byGenderDepartment);
    }
}
