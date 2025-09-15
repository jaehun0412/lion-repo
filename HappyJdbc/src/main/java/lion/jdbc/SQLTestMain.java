package lion.jdbc;

public class SQLTestMain {

    public static void main(String[] args) {

        InsertTest insertTest = new InsertTest();
        UpdateTest updateTest = new UpdateTest();
        DeleteTest deleteTest = new DeleteTest();

        try {
            insertTest.insert(50, "Home", "Seoul");
//        updateTest.updateDname("본사", 5);
//            deleteTest.delete(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
