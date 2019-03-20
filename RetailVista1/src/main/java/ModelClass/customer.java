package ModelClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by admin on 19/07/17.
 */

public class customer implements KvmSerializable {

    public String FirstName;
    public String MiddleName;
    public String LastName;
    public int SalutationId;


    public customer() {
    }

    public customer(String FirstName, String MiddleName, String LastName, int SalutationId) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.SalutationId = SalutationId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public Object getProperty(int index) {

        switch (index) {
            case 0:
                return FirstName;
            case 1:
                return MiddleName;
            case 2:
                return LastName;
            case 3:
                return  SalutationId;
        }

        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void setProperty(int index, Object value) {

        switch (index) {
            case 0:
                FirstName = value.toString();
                break;
            case 1:
                MiddleName = value.toString();
                break;
            case 2:
                LastName = value.toString();
                break;
            case 3:
                SalutationId = (int)value;
                break;
            default:
                break;


        }
    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FirstName";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MiddleName";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastName";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "SalutationId";
                break;
            default:
                break;
        }
    }
}
