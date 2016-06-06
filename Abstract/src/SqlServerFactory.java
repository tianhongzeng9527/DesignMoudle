/**
 * Created by tian on 16-6-2.
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUer CreateUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment CreatDepartment() {
        return new SqlserverDepartment();
    }
}
