package com.zhss.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 用迭代器模式的实现：
 * 需求：给大家举个例子，现在假设，有一个教室类，里面包含了一堆学生，
 * 我现在要遍历教室里的学生，怎么来玩儿
 * <p>
 * 面向Iterator接口编程，无论底层的数据结构和迭代算法如何变化，调用者都不用修改代码
 * 高内聚，低耦合，漂亮
 * 其实一般很少自己写这个iterator模式的，一般都是在集合编程中使用，尤其是如果要对集合元素遍历过程中做插入删除操作，那就用iterator，
 * 这个我们会在本次项目阶段一来实践，体验JDK已经封装好的iterator模式，加深印象，如果要对某个类中的集合进行遍历，由那个集合类返回一
 * 个iterator回来，我们统一面向iterator迭代器接口来编程遍历，提高系统整体的可维护性，可扩展性
 * 如果自己写iterator模式，一般是研发底层的框架，比如提供某个数据给外部遍历，那么可以使用iterator模式自己封装迭代器，
 * 以后阶段如果有机会，我们也会去实践
 * Created by CTWLPC on 2018/8/10.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Classroom classroom = new Classroom(2);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        java.util.Iterator<Student> iterator = classroom.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }

    /**
     * 代表了一个集合类
     */
    public interface Aggregate {

        public abstract java.util.Iterator<Student> iterator();

    }

    /**
     * 定义一个我们自己的迭代器接口
     *
     * @author zhonghuashishan
     */
    public interface Iterator {

        public abstract boolean hasNext();

        public abstract Object next();

    }

    /**
     * 学生类
     */
    public static class Student {

        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

    /**
     * 教室迭代器
     *
     * @author zhonghuashishan
     */
    public static class ClassroomIterator implements Iterator {

        private Classroom classroom;
        private int index;

        public ClassroomIterator(Classroom classroom) {
            this.classroom = classroom;
            this.index = 0;
        }

        /**
         * 假设此时index是0，classroom的length是2
         * 那么肯定是可以去获取下一个学生的，此时数组还没遍历完
         * <p>
         * 假设此时index是2，classroom的length是2，classroom可以遍历的数组的offset只能是0和1
         */
        public boolean hasNext() {
            if (index < classroom.getLength()) {
                return true;
            } else {
                return false;
            }
        }

        /**
         * 从数组中获取当前的这个学生，同时将index往下移动一位
         * 比如一开始index是0，然后数组长度是2
         * 此时遍历获取了第一个学生之后，返回了数组的0元素，然后将index变为1了
         */
        public Object next() {
            Student student = classroom.getStudent(index);
            index++;
            return student;
        }

    }

    /**
     * 教室类
     *
     * @author zhonghuashishan
     */
    public static class Classroom implements Aggregate {

//	    private Student[] students;

        private List<Student> students;

        /**
         * last相当于是数组的长度
         */
        private int last = 0;

        public Classroom(int size) {
//	        this.students = new Student[size];
            this.students = new ArrayList<Student>(2);
        }

        public Student getStudent(int index) {
//	        return students[index];
            return students.get(index);
        }

        public void addStudent(Student student) {
//	        this.students[last] = student;
            this.students.add(student);
            last++;
        }

        public int getLength() {
            return last;
        }

        /**
         * 返回一个教室迭代器，其中封装了教室自己，让迭代器可以获取教室中的数据
         */
        public java.util.Iterator<Student> iterator() {
//	        return new ClassroomIterator(this);
            return students.iterator();
        }

    }

}
