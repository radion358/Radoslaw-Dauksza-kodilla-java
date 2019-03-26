package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67032906720", "John", "Smith"},
            {"62081612107", "Ivone", "Nowak"},
            {"67032909489", "Jessie", "Pinkman"},
            {"39835583589", "Walter", "White"},
            {"4r234883762", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
