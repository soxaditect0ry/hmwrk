class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}

class Choose {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "petrpetr@mailbox.com", "892345678", 40000, 35);
        persArray[2] = new Person("Sidorova Maria", "Developer", "maria.sidorova@mailbox.com", "891212345", 50000, 28);
        persArray[3] = new Person("Kuznetsova Elena", "Designer", "elena.kuznetsova@mailbox.com", "895678912", 35000, 32);
        persArray[4] = new Person("Smirnova Natalia", "Analyst", "natalia.smirnova@mailbox.com", "896789123", 45000, 29);

        for (Person person : persArray) {
            person.printInfo();
        }
    }
}