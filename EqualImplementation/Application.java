public class Application{

 public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setId("V001");
        e1.setCode("VIR100");
        e1.setNIC("954536678v");
        e1.setAddress("colombo");
        System.out.println("Employee ID : " + e1.getId());
        System.out.println("Employee CODE :" + e1.getCode());
        System.out.println("Employee NIC : " + e1.getNIC());
        System.out.println("Employee ADDRESS : " + e1.getAddress());


        System.out.println("\n\n\n");


        Employee e2 = new Employee();
		e2.setId("V002");
        e2.setCode("VIR101");
        e2.setNIC("965876345V");
        e2.setAddress("Jaffna");


        System.out.println("Employee ID : " + e2.getId());
        System.out.println("Employee CODE :" + e2.getCode());
        System.out.println("Employee NIC : " + e2.getNIC());
        System.out.println("Employee ADDRESS : " + e2.getAddress());
        System.out.println("\n\n\n");

        System.out.println(e1.getId() == e2.getId());
        System.out.println(e1.equals(e2.getId()));
        System.out.println(e1.getCode()==e2.getCode());
        System.out.println(e1.getNIC()==e2.getNIC());
        System.out.println(e1.getAddress()==e2.getAddress());


        System.out.println("\n\n\n");

        Employee e3 = new Employee();
		e3.setId("V001");
        e3.setCode("VIR100");
        e3.setNIC("954536678v");
        e3.setAddress("colombo");



        System.out.println("Employee ID : " + e3.getId());
        System.out.println("Employee CODE :" + e3.getCode());
        System.out.println("Employee NIC : " + e3.getNIC());
        System.out.println("Employee ADDRESS : " + e3.getAddress());

        System.out.println(e1.getId() == e3.getId());
        System.out.println(e1.equals(e3.getId()));
        System.out.println(e1.getCode()==e3.getCode());
        System.out.println(e1.getNIC()==e3.getNIC());
        System.out.println(e1.getAddress()==e3.getAddress());


    }


}