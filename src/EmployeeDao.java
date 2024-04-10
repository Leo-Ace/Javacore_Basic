public interface EmployeeDao {
    public void insert(BaseEntity entity);
    public void showAll();
    public void sortAscending();
    public void sortDescending();
    public void saveFile();
    public void search(String name);
}
