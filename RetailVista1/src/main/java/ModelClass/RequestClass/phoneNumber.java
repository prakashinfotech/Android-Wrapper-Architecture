package ModelClass.RequestClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Vivek on 8/1/2017.
 */

public class phoneNumber  implements KvmSerializable{
    public int PhoneTypeId;
    public int CustomerId;
    public String PhoneNumber;

    public int getPhoneTypeId() {
        return PhoneTypeId;
    }

    public void setPhoneTypeId(int phoneTypeId) {
        PhoneTypeId = phoneTypeId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public Object getProperty(int index) {
        switch (index) {
            case 0:
                return PhoneTypeId;
            case 1:
                return CustomerId;
            case 2:
                return PhoneNumber;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void setProperty(int index, Object value) {
        switch (index) {
            case 0:
                PhoneTypeId=(int)value;
            case 1:
                CustomerId=(int)value;
            case 2:
                PhoneNumber=value.toString();
        }
    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {

        switch (index) {
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PhoneTypeId";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PhoneNumber";
                break;
        }
    }
}
