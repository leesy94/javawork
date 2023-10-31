package exam;

public class Ch03_Dao {
	public static void dbWork(Ch03_DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new Ch03_OracleDao());
		dbWork(new Ch03_MysqlDao());
	}

}
