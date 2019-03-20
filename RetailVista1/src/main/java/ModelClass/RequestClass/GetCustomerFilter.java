package ModelClass.RequestClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Vivek on 8/1/2017.
 */

public class GetCustomerFilter implements KvmSerializable {
    public String getGeneralName() {
        return GeneralName;
    }

    public void setGeneralName(String generalName) {
        GeneralName = generalName;
    }

    public String GeneralName;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String LastName;

    @Override
    public Object getProperty(int index) {
        switch (index) {
            case 0:
                return GeneralName;
            case 1:
                return LastName;
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
                GeneralName = value.toString();
                break;
            case 1:
                LastName =value.toString();
        }
    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "GeneralName";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastName";
                break;
            default:
                break;
        }
    }
}
