package B07;

public class e119 {
    public static void main(String[] args) {
        int[] score = { 2, 5, 8, 10, 10 , 10 };
        String[] student = { "Hang", "Dung", "Hien", "Dieu", "Lan" };


        int maxScore = score[0];
        int[] indexScore = {0};

        for (int i = 0; i < score.length; i++) {
            if(score[i] > maxScore) {
                maxScore = score[i];
                // indexScore = {3}
            } else if (score[i] == maxScore) {
                // indexScore = {3,4 ,5}
            }
        }
       

        System.err.println();






















        // int maxScore = 0;
        // StringBuilder topStudents = new StringBuilder();

        // for (int i = 0; i < score.length; i++) {
        //     if (score[i] > maxScore) {
        //         maxScore = score[i];
        //         topStudents.setLength(0); // Xóa danh sách cũ
        //     }
        //     // Tạo mảng mới chứa phần tử
        //     if (score[i] == maxScore) {
        //         if (topStudents.length() > 0)
        //             topStudents.append(", ");
        //         topStudents.append(student[i]);
        //     }
        // }

        // System.out.printf("HV có điểm cao nhất - %s: %d\n", topStudents, maxScore);
    }
}
