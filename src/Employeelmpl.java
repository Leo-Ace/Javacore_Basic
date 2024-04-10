import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employeelmpl implements EmployeeDao{
    List<BaseEntity> baseEntities = new ArrayList<BaseEntity>();

    @Override
    public void insert(BaseEntity entity) {
        baseEntities.add(entity);
    }

    @Override
    public void showAll() {
        for (BaseEntity entity: baseEntities) {
            ((Employee) entity).display();
            System.out.println("-----");
        }
    }

    @Override
    public void sortAscending() {
        baseEntities.sort((o1, o2) -> ((Employee)o1).getEmpName().compareTo(((Employee)o2).getEmpName()));
        this.showAll();
    }

    @Override
    public void sortDescending() {
        Collections.sort(baseEntities, Comparator.comparing(BaseEntity::calculateSalary, Comparator.reverseOrder()));
        this.showAll();
    }

    @Override
    public void saveFile() {
        try {
            File file = new File("data.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(baseEntities);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search(String name) {
        for (BaseEntity entity: baseEntities) {
            if(name.equals(((Employee) entity).getEmpName())) {
                ((Employee) entity).display();
                return;
            }
        }
        System.out.println("Khong tim thay ket qua nao!");
    }
}
