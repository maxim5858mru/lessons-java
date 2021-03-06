package com.company.lw11.example1;

import java.io.IOException;

@FunctionalInterface
interface CaseInterface {
    public void main(String[] args);
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var cases = new com.company.lw11.example1.CaseInterface[] {
                str -> Case1.main(str),
                str -> Case2.main(str),
                str -> {
                    try {
                        Case3.main(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                },
                str -> Case4.main(str),
                str -> Case5.main(str),
                str -> {
                    try {
                        Case6.main(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                },
                str -> {
                    try {
                        Case7.main(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                },
                str -> Case8.main(str),
                str -> {
                    try {
                        Case9.main(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                },
                str -> {
                    try {
                        Case10.main(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        for (int i = 1; i < cases.length; i++) {
            try {
                System.out.println("Пример №" + i);
                cases[i].main(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(10);               // Задержка для вывода данных в консоль с потока err
            } finally {
                System.out.println();
            }
        }
    }
}