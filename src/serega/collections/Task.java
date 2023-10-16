package serega.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Task {
    private ArrayList<Integer> grades;
    private String s = "";


    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Task() {
        grades = new ArrayList<>();
    }

    public Task(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void jopa(int count) {
        for (int i = 0; i < count; i++) {
            grades.add(i);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(grades, task.grades) && Objects.equals(s, task.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grades, s);
    }
}
