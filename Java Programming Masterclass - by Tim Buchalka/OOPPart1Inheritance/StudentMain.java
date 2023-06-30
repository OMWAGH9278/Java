public class StudentMain {

        public static void main(String[] args) {

                for (int i = 1; i <= 5; i++) {
                        LPAStudent s = new LPAStudent("S92300" + i,
                                        switch (i) {
                                                case 1 -> "Mary";
                                                case 2 -> "Carol";
                                                case 3 -> "Tim";
                                                case 4 -> "Harry";
                                                case 5 -> "Lisa";
                                                default -> "Anonymous";
                                        },
                                        "05/11/1985",
                                        "Java Masterclass");
                        System.out.println(s);
                }

                Student pojostudent = new Student("S923006", "Ann",
                                "05/11/1985", "Java Masterclass");
                LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                                "05/11/1985", "Java Masterclass");

                System.out.println(pojostudent);
                System.out.println(recordStudent);

                pojostudent.setClassList(pojostudent.getClassList() + ", Java OCP Exam 829");
                // recordStudent.setClassList(recordStudent.classList()+", Java OCP Exam 829");

                System.out.println(pojostudent.getName() + " is taking " +
                                pojostudent.getClassList());
                System.out.println(recordStudent.name() + " is taking " +
                                recordStudent.classList());

        }
}
