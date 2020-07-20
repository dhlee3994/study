package doIt.chap02;

import java.awt.dnd.DropTarget;
import java.util.Scanner;

public class Exam05_class {
    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++)
            sum += data[i].height;

        return sum/data.length;
    }

    static void distVision(PhyscData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;

        for (; i < data.length; i++)
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
                dist[(int)(data[i].vision*10)]++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] data = {
                new PhyscData("a", 160, 0.3),
                new PhyscData("b", 150, 0.2),
                new PhyscData("c", 170, 1.2),
                new PhyscData("d", 180, 1.5),
                new PhyscData("e", 190, 2.0),
        };

        int[] vdist = new int[VMAX];

        System.out.println("신검 리스트");
        System.out.println(" 이름      키          시력");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s%3d%5.1f\n", data[i].name, data[i].height, data[i].vision);
        }

        System.out.printf("평균 키 : %5.1fcm\n", aveHeight(data));
        distVision(data, vdist);

        System.out.println("시력 분포");
        /*
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~:%2d명\n",i/10.0, vdist[i]);
        }
         */

        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~：", i / 10.0);
            for (int j = 0; j < vdist[i]; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
