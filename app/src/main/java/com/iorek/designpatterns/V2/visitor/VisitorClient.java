package com.iorek.designpatterns.V2.visitor;

public class VisitorClient {

    public void test(){
        Element student1 = new Student("张三",95,10);
        Element student2 = new Student("李四",50,6);
        Element student3 = new Student("王五",60,3);
        Element student4 = new Student("金六",70,2);

        Element teacher1 = new Teacher("老张",100,10);
        Element teacher2 = new Teacher("老王",90,5);
        Element teacher3 = new Teacher("老李",70,6);
        Element teacher4 = new Teacher("老金",40,9);

        ElementManager instance = ElementManager.getInstance();

        instance.addElement(student1);
        instance.addElement(student2);
        instance.addElement(student3);
        instance.addElement(student4);

        instance.addElement(teacher1);
        instance.addElement(teacher2);
        instance.addElement(teacher3);
        instance.addElement(teacher4);

        GradeSelection gradeSelection = new GradeSelection();
        instance.accept(gradeSelection);

    }

}
