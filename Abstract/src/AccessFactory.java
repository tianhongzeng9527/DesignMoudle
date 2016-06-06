/**
 * Created by tian on 16-6-2.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUer CreateUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment CreatDepartment() {
        return new AccessDepartment();
    }
}
