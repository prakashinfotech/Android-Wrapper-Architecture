package ModelClass.RequestClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Vivek on 7/31/2017.
 */

public class emailAddress implements KvmSerializable {
    public String Email;
    public int CustomerId;

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    @Override
    public Object getProperty(int index) {
        switch (index) {
            case 0:
                return Email;
            case 1:
                return CustomerId;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void setProperty(int index, Object value) {
        switch (index) {
            case 0:
                Email = value.toString();
                break;
            case 1:
                CustomerId = (int)value;
                break;
        }
    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Email";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            default:
                break;
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
