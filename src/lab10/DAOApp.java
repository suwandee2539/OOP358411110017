package lab10;

import java.util.List;

public class DAOApp {
    public static void main(String[] args) {

        empDAOlmpl dao = empDAOlmpl.getInstant();
        //GET_ALL_EMP
        ShowAllData(dao);

        //ADD_EMP
        Employee newEmp = new Employee(
                102,
                "dfgjig ogkegelp",
                "fjsfsko",
                3000);

     //   dao.addEmp(newEmp);
     //   ShowAllData(dao);

        //FIND_BY_ID
        Employee e = dao.getEmpById(100);
        System.out.println(e.toString());

        //UPDATE _EMP
        e.setSalary(30000);
        dao.updateEmp(e);
        ShowAllData(dao);

        //DELETE_EMP
        dao.deleteEmp(100);
        ShowAllData(dao);
    }

    private static void ShowAllData(empDAOlmpl dao) {
        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("-----Data in Database");
        for (Employee emp : allEmp){
            System.out.println(emp.toString());
        }

        System.out.println("--------------");

    }
}
