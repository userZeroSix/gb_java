public class lesson5 {
        public static void main(String[] args) {
//   employee s1 = new employee("thomas", "associate director", "thoma@gmail.com", "+1 940 602 22 34", "6000$", 32 );
//   s1.printAll();

            employee[] persArray = new employee[5];
            persArray[0] = new employee("thoma", "ft associate director", "thoma@gmail.com", "+1 940 602 22 34", "6000$", 32);
            persArray[1] = new employee("xiao", "director", "xiao@gmail.com", "+1 940 602 46 27", "9000$", 44);
            persArray[2] = new employee("albedo", "sd associate director", "albedo@gmail.com", "+1 940 602 21 43", "5500$", 28);
            persArray[3] = new employee("kadzuhu", "owner", "kadzuhu@gmail.com", "+1 940 602 66 66", "25000$", 37);
            persArray[4] = new employee("jun lee", "cashier", "jun_lee@gmail.com", "+1 940 602 29 34", "4000$", 49);

            for (int i=0; i < persArray.length; i++)
                if (persArray[i].age > 40) persArray[i].print();

            }
        }

    class employee {
        String fio;
        String post;
        String email;
        String telephone;
        String salary;
        int age;

        public int getAge() {
            return age;
        }

        public employee(String fio, String post, String email, String telephone, String salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        public void printAll() {
            System.out.println("name: " + this.fio);
            System.out.println("post: " + this.post);
            System.out.println("email: " + this.email);
            System.out.println("telephone: " + this.telephone);
            System.out.println("salary: " + this.salary);
            System.out.println("age: " + this.age);
        }

        public void print(){
            System.out.println(this);
        }

    }


